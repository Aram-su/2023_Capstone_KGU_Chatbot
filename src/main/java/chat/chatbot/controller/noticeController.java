package chat.chatbot.controller;

import chat.chatbot.data.Notice;
import chat.chatbot.service.NoticeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class noticeController {

    @PostMapping("/announcements")
    public List<Notice> announcementsData() {
        return NoticeService.getAllNotice();
    }
}
