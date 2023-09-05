public class Time2 {
    private int hour;
    private int minute;
    private int second;

    public Time2(){
        this(0, 0, 0);
    }

    public Time2(int h){
        this(h, 0, 0);
    }

    public Time2(int h, int m){
        this(h, m, 0);
    }
    public Time2(int h, int m, int s) {
        if (h < 0 || h >= 24) throw new IllegalArgumentException("Hour must be between 0 and 23");
        if (m < 0 || m >= 60) throw new IllegalArgumentException("Minutes must be between 0 and 59");
        if (s < 0 || s >= 60) throw new IllegalArgumentException("Seconds must be between 0 and 59");
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public Time2(Time2 time){
        this(time.hour, time.minute, time.second);
    }

    public void setTime(int hour, int minute, int second){
        if (hour < 0 || hour >= 24) throw new IllegalArgumentException("Hour must be between 0 and 23");
        if (minute < 0 || minute >= 60) throw new IllegalArgumentException("Minutes must be between 0 and 59");
        if (second < 0 || second >= 60) throw new IllegalArgumentException("Seconds must be between 0 and 59");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", (getHour()==0 || getHour() == 12 ? 12:getHour()%12),
                getMinute(), getSecond(), getHour()>=12?"PM":"AM");
    }
}
