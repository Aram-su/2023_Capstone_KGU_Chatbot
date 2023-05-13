package chat.chatbot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class announceController {

    @PostMapping("/announcements")
    public String announcementsData() {
        // 받은 데이터를 처리하는 로직 작성
        //System.out.println("Received data: " + data);

        // 응답 데이터를 생성하여 반환
        String response = "특별한 공지사항이 없습니다!";
        return response;
    }
}
