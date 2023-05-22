package chat.chatbot.service;

import chat.chatbot.data.Schedule;
import chat.chatbot.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    private static ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository){
        this.scheduleRepository = scheduleRepository;
    }

    public static List<Schedule> getAllSchedule(){
        return scheduleRepository.findAll();
    }
}
