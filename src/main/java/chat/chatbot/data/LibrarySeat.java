package chat.chatbot.data;

import com.fasterxml.jackson.annotation.JsonInclude;

public class LibrarySeat {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String location;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Integer all_seats;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Integer using;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Integer available;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String operating_hours;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAll_seats() {
        return all_seats;
    }

    public void setAll_seats(Integer all_seats) {
        this.all_seats = all_seats;
    }

    public Integer getUsing() {
        return using;
    }

    public void setUsing(Integer using) {
        this.using = using;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getOperating_hours() {
        return operating_hours;
    }

    public void setOperating_hours(String operating_hours) {
        this.operating_hours = operating_hours;
    }
}
