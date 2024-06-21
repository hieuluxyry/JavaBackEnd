import java.util.regex.*;

public class PhoneExample {
    public static boolean isPhone(String phoneNumber) {
        String regex = "\\(\\d{2}\\)-\\(0\\d{9}\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}