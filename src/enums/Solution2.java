package enums;

public class Solution2 {
    /*
    Implement enum Week, that each element has the name of the week (String) and the number of weekday (int)
    Print these values to the console in the formant - Monday - day of the week: 1
     */
    public static void main(String[] args) {
        //System.out.print(Solution1.Alphabet.B.name() + " - " + Solution1.Alphabet.B.getLetterPosition());
        System.out.print(Week.SUNDAY.getWeekDay() + "- day of the week: " + Week.SUNDAY.getNumOfDay());
    }

    public enum Week {
        SUNDAY("Sunday", 1),
        MONDAY("Monday", 2),
        TUESDAY("Tuesday", 3),
        WEDNESDAY("Wednesday", 4),
        THURSDAY("Thursday", 5),
        FRIDAY("Friday", 6),
        SATURDAY("Saturday", 7);

        String weekDay;
        int numOfDay;


        String getWeekDay(){
            return weekDay;

        }

        int getNumOfDay(){
            return numOfDay;
        }
        Week(String weekDay, int numOfDay) {
            this.weekDay = weekDay;
            this.numOfDay = numOfDay;
        }
    }
}

