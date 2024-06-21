import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassValidator {
    // Phương thức kiểm tra tính hợp lệ của tên lớp học
    public static boolean isClassName(String className) {
        // Biểu thức chính quy để kiểm tra
        String regex = "^[CAP]\\d{4}[GHIK]$";

        // Tạo Pattern từ biểu thức chính quy
        Pattern pattern = Pattern.compile(regex);

        // Tạo Matcher để kiểm tra chuỗi với biểu thức chính quy
        Matcher matcher = pattern.matcher(className);

        // Kiểm tra chuỗi có khớp với biểu thức chính quy không
        return matcher.matches();
    }
}

