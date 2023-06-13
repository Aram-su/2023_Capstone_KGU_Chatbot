package chat.chatbot.controller;

import chat.chatbot.data.InputMessage;
import chat.chatbot.data.SuwonMap;
import chat.chatbot.service.ChatbotClientService;
import chat.chatbot.service.SuwonMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class messageController {

    private final contactController contactController;
    private final menuController menuController;
    private final noticeController noticeController;

    @Autowired
    public messageController(contactController contactController, menuController menuController, noticeController noticeController) {
        this.contactController = contactController;
        this.menuController = menuController;
        this.noticeController = noticeController;
    }

    @PostMapping("/messages")
    public <T> T messageData(@RequestBody InputMessage msg) throws IOException {
        System.out.println(msg.getMessage());

        String code = new ChatbotClientService().Client(msg.getMessage());

        if ( code.substring(0,2).equals("01") ){
            return (T) menuController.restaurantsData();
        }
        if ( code.substring(0,2).equals("02")){
            contactController.code = code;
            return (T) contactController.contactsData();
        }

        if ( code.equals("050101") || code.equals("050201")){
            return (T) libraryController.librariesData();
        }

        if ( code.substring(0,2).equals("07") ){
            SuwonMap sm = new SuwonMap();
            sm.setCode(code);
            sm.setLocation(SuwonMapService.setLocation(code.substring(2,4)));
            sm.setDescription(SuwonMapService.setDescription(code.substring(2,4)));
            return (T) sm;
        }

        if ( code.substring(0,2).equals("09") ){
            return (T) noticeController.announcementsData();
        }


        return null;
    }
}
