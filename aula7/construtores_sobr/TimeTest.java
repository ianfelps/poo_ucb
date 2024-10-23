public class TimeTest{
    public static void main(String[] args){
        
        Time t1 = new Time(); //00:00:00
        Time t2 = new Time(2); //02:00:00
        Time t3 = new Time(21,34); //21:34:00
        Time t4 = new Time(12,25,42); //12:25:42
        Time t5 = new Time(t4); // 12:25:42

        try{
            Time t6 = new Time(27,74,99);
        }

        catch (IllegalArgumentException e){
            System.out.printf("%nExceção enquanto t6 inicializa: %s%n", e.getMessage());
        }
    }
}