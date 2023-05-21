package chat.chatbot.service;

import chat.chatbot.menu.LibrarySeat;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;


@Service
public class libraryService {

    public static LibrarySeat[] getLibrarySeats() throws IOException {

        ArrayList<LibrarySeat> seats = new ArrayList<>();

        String libraryURL = "http://libgate.kyonggi.ac.kr/libraries/lib-status/1";

        try {
            Document doc = Jsoup.connect(libraryURL).ignoreContentType(true).get();
            String jsonStr = doc.body().text();

            JSONObject jsonObject = new JSONObject(jsonStr);
            JSONArray dataArray = jsonObject.getJSONArray("data");

            for (int i = 0; i < dataArray.length(); i++) {

                JSONObject dataObj = dataArray.getJSONObject(i);

                String loc = dataObj.getString("name").substring(3,8);
                Integer all = dataObj.getInt("available");
                Integer use = dataObj.getInt("inUse");
                Integer valid = all - use;

                StringBuffer startTime = new StringBuffer(dataObj.getString("startTm"));
                StringBuffer endTime = new StringBuffer(dataObj.getString("endTm"));
                startTime.insert(2, ":");
                endTime.insert(2, ":");
                String operatingTime = startTime + "~" + endTime;

                if ( !seats.isEmpty() && seats.get(seats.size()-1).getLocation().equals(loc) ){
                    int last_idx = seats.size() -1;

                    seats.get(last_idx).setAll_seats(seats.get(last_idx).getAll_seats()+all);
                    seats.get(last_idx).setUsing(seats.get(last_idx).getUsing()+use);
                    seats.get(last_idx).setAvailable(seats.get(last_idx).getAvailable()+valid);
                } else{
                    LibrarySeat seat = new LibrarySeat();
                    seat.setLocation(loc);
                    seat.setAll_seats(all);
                    seat.setUsing(use);
                    seat.setAvailable(valid);
                    seat.setOperating_hours(operatingTime);

                    seats.add(seat);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return seats.toArray(new LibrarySeat[seats.size()]);
    }

}
