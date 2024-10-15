package homework.hw13;

public class Sklad {

    private Integer count;
    private String workTime;
    private String cityName;

    public Sklad(Integer count, String workTime, String cityName) {
        this.count = count;
        this.workTime = workTime;
        this.cityName = cityName;
    }

    public Integer getCount() {
        return count;
    }

}
