package chat.chatbot.controller;

import chat.chatbot.menu.Menu;
import chat.chatbot.service.MenuService;
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
    public Menu[] restaurantsData() {

        Menu[] output = new Menu[3];
        //모든 정보
        List<Object[]> data = MenuService.getAllCafeteriaAndMenu();

        List<String> stringData = new ArrayList<>();

        for (Object[] row : data) {
            StringBuilder rowData = new StringBuilder();
            for (Object value : row) {
                rowData.append(value.toString()).append(", ");
            }
            rowData.setLength(rowData.length() - 2); // 마지막 쉼표 및 공백 제거
            stringData.add(rowData.toString());
        }

        int idx = 0;
        LocalDate ld = LocalDate.now();
        String today = ld.getYear() + "-" + String.format("%02d", ld.getMonthValue())  + "-" + ld.getDayOfMonth();
        for (String row : stringData) {
            if ( row.contains(today)){
                row = (row.substring(0, row.length()-12));
                String[] tmp = row.split(",");

                output[idx] = new Menu();
                output[idx].setCafeteria(tmp[0]);
                output[idx].setLunch_or_dinner(tmp[1]);
                output[idx].setMenu01(tmp[2]);
                output[idx].setMenu02(tmp[3]);
                output[idx].setMenu03(tmp[4]);
                output[idx].setMenu04(tmp[5]);
                output[idx].setMenu05(tmp[6]);
                output[idx].setMenu06(tmp[7]);
                idx++;
            }
        }

        return output;
    }

}
