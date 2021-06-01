package kodlamaio.hrms.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FakeMernis {
	
	public static boolean validate(String identityNumber) {
		
		String regex = "^[0-9]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(identityNumber);
		
		if (identityNumber.length()>11) {
			return false;
		}else if(matcher.matches() && !identityNumber.startsWith("0")) {
			return true;
		}else {
			return false;
		}
	}
}
