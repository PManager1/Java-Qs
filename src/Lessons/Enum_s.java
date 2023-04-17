package Lessons;

public class Enum_s {

    public enum DayOfTheWeek{
        SUN, MON, TUES, WED, THURS, FRI, SAT
    }

    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.MON;
        System.out.println(weekDay);



        System.out.println( "Name is  =" +  weekDay.name() );
        String n = weekDay.name();


        System.out.println( "ordinal =" +  weekDay.ordinal() );


    }
}
