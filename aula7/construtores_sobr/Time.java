// declaração da classe Time com construtores sobrecarregados
public class Time
{
    private int hour;
    private int minute;
    private int second;

    //inicializa cada variável de instância para zero
    public Time(){
        this(0,0,0);
    }

    //hora fornecida, restante zero
    public Time(int hour){
        this(hour,0,0);
    }

    // hora e minuto fornecidos
    public Time(int hour, int minute){
        this(hour, minute,0);
    }

    //todos os parametros fornecidos
    public Time(int hour, int minute, int second){
        if (hour<0||hour>=24)
            throw new IllegalArgumentException("hora deve estar entre 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minuto deve estar entre 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("segundo deve estar entre 0-59");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //recebe outro objeto Time
    public Time(Time time){
        this(time.getHour(),time.getMinute(),time.getSecond());
    }

    public void setTime(int hour, int minute, int second){
        if (hour<0||hour>=24)
            throw new IllegalArgumentException("hora deve estar entre 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minuto deve estar entre 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("segundo deve estar entre 0-59");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour){
        if (hour<0||hour>=24)
            throw new IllegalArgumentException("hora deve estar entre 0-23");
        this.hour = hour;
    }
    
    public void setMinute(int minute){
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minuto deve estar entre 0-59");
        this.minute = minute;
    }

    public void setSecond(int second){
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("segundo deve estar entre 0-59");
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    // converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString(){
        return String.format(
        "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s",
        ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}