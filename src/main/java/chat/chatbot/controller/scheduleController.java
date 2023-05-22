package chat.chatbot.controller;

import chat.chatbot.data.Schedule;
import chat.chatbot.service.ScheduleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class scheduleController {

    @PostMapping("/plans")
    public List<Schedule> plansData() {
        return ScheduleService.getAllSchedule();
    }
}

