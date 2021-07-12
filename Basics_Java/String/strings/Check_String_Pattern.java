package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check_String_Pattern {    
	
	
	private static Boolean StringDateMatcher(String input) {
		
        String patternStr = "^$";
        Pattern pattern = Pattern.compile(patternStr);

        Matcher matcher = pattern.matcher(input);
        boolean matchFound = matcher.matches();
		
		return matchFound;
	}
 
    public static void main(String[] args) {
    	
    	// TEST UUID-Matcher pattern
    	
        String patternStr = "^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[4][0-9A-Fa-f]{3}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}[.[0-9]+]*$";
        Pattern pattern = Pattern.compile(patternStr);

        String input = "145ce37a-2dcb-4cbe-ad8b-34c5a1fb9cf3";
        Matcher matcher = pattern.matcher(input);

        boolean matchFound = matcher.matches();
        System.out.println(input + " - matches UUID patern: " + matchFound);
        
        
        System.out.println(input + " - matches date patern: " + StringDateMatcher(""));
    }
}
