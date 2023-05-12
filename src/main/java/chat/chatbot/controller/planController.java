package chat.chatbot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class planController {

    @PostMapping("/plans")
    public String plansData() {
        // 받은 데이터를 처리하는 로직 작성
        //System.out.println("Received data: " + data);

        // 응답 데이터를 생성하여 반환
        String response = "Data received successfully!";
        return response;
    }
}
