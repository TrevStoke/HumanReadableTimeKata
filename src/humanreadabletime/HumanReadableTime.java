/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package humanreadabletime;

/**
 *
 * @author trevor
 */
public class HumanReadableTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printTime(0);
        printTime(5);
        printTime(60);
        printTime(86399);
        printTime(359999);
        
        System.out.printf("%2d\n", 2);
    }
    
    public static String convertSeconds(int seconds)
    {
        if (seconds == 0) return "00:00:00";
        
        int wholeMinutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        
        int wholeHours = wholeMinutes / 60;
        int remainingMinutes = wholeMinutes % 60;
        
        StringBuilder sb = new StringBuilder();
        
        String format = "%s:%s:%s";
        
        return String.format(format, 
                representUnit(wholeHours),
                representUnit(remainingMinutes),
                representUnit(remainingSeconds)
                );
    }

    private static void printTime(int i) {
        System.out.println(convertSeconds(i));
    }
    
    private static String representUnit(int unit)
    {
        StringBuilder sb = new StringBuilder();
        if (unit < 10) sb.append("0");
        
        sb.append(unit);
        
        return sb.toString();
    }
    
}
