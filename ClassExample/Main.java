public class Main {
    public static void main(String[] args) {
        // Các tên lớp học để kiểm tra
        String[] classNames = {"C0223G", "A0323K", "K0318G", "P0323B", "C1234H"};

        for (String className : classNames) {
            if (ClassValidator.isClassName(className)) {
                System.out.println("Tên lớp hợp lệ: " + className);
            } else {
                System.out.println("Tên lớp không hợp lệ: " + className);
            }
        }
    }
}


