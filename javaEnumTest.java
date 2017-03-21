//package enumTest;

public class javaEnumTest {
    Day day;
    
    public javaEnumTest(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                 System.out.println(Day.MONDAY);
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        javaEnumTest firstDay = new javaEnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
                javaEnumTest first2Day = new javaEnumTest(Day.TUESDAY);
        first2Day.tellItLikeItIs();
        javaEnumTest thirdDay = new javaEnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        javaEnumTest fifthDay = new javaEnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        javaEnumTest sixthDay = new javaEnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        javaEnumTest seventhDay = new javaEnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
        
        for (Day D : Day.values()) {
			System.out.println(D);
		}
    }
}
//public 
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
}
