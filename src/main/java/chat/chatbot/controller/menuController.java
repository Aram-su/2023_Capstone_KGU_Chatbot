package chat.chatbot.controller;

import chat.chatbot.menu.Menu;
import chat.chatbot.service.MenuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class menuController {

    @PostMapping("/restaurants")
    public String restaurantsData() {

        // 받은 데이터를 처리하는 로직 작성
        List<Object[]> data = MenuService.getAllCafeteriaAndMenu();
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

        for (String row : stringData) {
            data2 += (row+"\n");
            System.out.println(data2);
        }
        return data2;
    }

}
