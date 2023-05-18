package chat.chatbot.controller;

import chat.chatbot.menu.Menu;
import chat.chatbot.service.MenuService;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class menuController {

    @PostMapping("/restaurants")
    public String restaurantsData() {

        //모든 정보
        List<Object[]> data = MenuService.getAllCafeteriaAndMenu();
        //오늘 날짜의 모든 정보
        //List<Object[]> data = MenuService.findAllCafeteriaAndMenuByDate(LocalDate.now());


        String data2 = "";

        List<String> stringData = new ArrayList<>();

        for (Object[] row : data) {
            StringBuilder rowData = new StringBuilder();
            for (Object value : row) {
                rowData.append(value.toString()).append(", ");
            }
            rowData.setLength(rowData.length() - 2); // 마지막 쉼표 및 공백 제거
            stringData.add(rowData.toString());
        }

        LocalDate ld = LocalDate.now();

        String today = ld.getYear() + "-" + String.format("%02d", ld.getMonthValue())  + "-" + ld.getDayOfMonth();
        for (String row : stringData) {
            if ( row.contains(today)){
                data2 += (row.substring(0, row.length()-12));
                System.out.println(row);
            }
        }
        if (data2.length() < 1 )
            return "오늘은 학식이 없습니다.";
        return data2;
    }

}
