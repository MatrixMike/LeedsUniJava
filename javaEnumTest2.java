//package enumTest;

public class javaEnumTest2 {
    Day day;
    
    public javaEnumTest2(Day day) {
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
        javaEnumTest2 firstDay = new javaEnumTest2(Day.MONDAY);
        firstDay.tellItLikeItIs();
                javaEnumTest2 first2Day = new javaEnumTest2(Day.TUESDAY);
        first2Day.tellItLikeItIs();
        javaEnumTest2 thirdDay = new javaEnumTest2(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        javaEnumTest2 fifthDay = new javaEnumTest2(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        javaEnumTest2 sixthDay = new javaEnumTest2(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        javaEnumTest2 seventhDay = new javaEnumTest2(Day.SUNDAY);
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
