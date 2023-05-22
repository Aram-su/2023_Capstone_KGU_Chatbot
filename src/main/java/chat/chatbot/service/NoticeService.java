package chat.chatbot.service;

import chat.chatbot.menu.Notice;
import chat.chatbot.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {

    private static NoticeRepository noticeRepository;

    @Autowired
    public NoticeService(NoticeRepository noticeRepository){
        this.noticeRepository = noticeRepository;
    }

    public static List<Notice> getAllNotice(){
        return noticeRepository.findAll();
    }
}
