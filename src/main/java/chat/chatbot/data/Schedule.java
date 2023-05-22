package chat.chatbot.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="schedule") @Entity
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Schedule {

    @Id @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String title;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String startDay;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String endDay;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }
}
