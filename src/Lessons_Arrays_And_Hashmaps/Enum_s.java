package Lessons_Arrays_And_Hashmaps;

import java.util.Random;

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

    public static DayOfTheWeek RandomDay () {

            int randomInteger = new Random().nextInt(7);  // the no shoudl be 0-6
            var allDays = DayOfTheWeek.values();
            return allDays[randomInteger];
    }
}
