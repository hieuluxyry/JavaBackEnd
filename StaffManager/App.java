import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ManagerStaff managerStaff = new ManagerStaff();
        Scanner scanner = new Scanner(System.in);
        int choice;
        String filePath = "data.csv";

        managerStaff.docTuCSV(filePath);

        do {
            System.out.println("---Quản lý Nhân Viên Trong Công Ty--");
            System.out.println("_____________________________________");
            System.out.println("1. Thêm nhân viên");
            System.out.println("_____________________________________");
            System.out.println("2. Sửa thông tin nhân viên");
            System.out.println("_____________________________________");
            System.out.println("3. Xóa nhân viên");
            System.out.println("_____________________________________");
            System.out.println("4. Hiển thị danh sách nhân viên");
            System.out.println("_____________________________________");
            System.out.println("5. Lưu danh sách nhân viên vào file CSV");
            System.out.println("_____________________________________");
            System.out.println("0. Thoát");
            System.out.println("_____________________________________");
            System.out.print("Nhập lựa chọn của bạn: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Lựa chọn không hợp lệ, vui lòng nhập số.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("1. Nhân viên văn phòng");
                    System.out.println("2. Nhân viên công xưởng");
                    System.out.println("3. Nhân viên giao hàng");
                    System.out.print("Chọn loại nhân viên: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Lựa chọn không hợp lệ, vui lòng nhập số.");
                        scanner.next();
                    }
                    int loaiNv = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Nhập ID: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("ID không hợp lệ, vui lòng nhập số.");
                        scanner.next();
                    }
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phone = scanner.nextLine();
                    System.out.print("Nhập chức vụ: ");
                    String role = scanner.nextLine();

                    switch (loaiNv) {
                        case 1:
                            // Adding an Office Staff
                            ManagerStaff.addStaff(new StaffOffice(id, name, phone, role));
                            break;
                        case 2:
                            // Adding a Workshop Staff
                            System.out.print("Nhập mã xưởng: ");
                            String workshopID = scanner.nextLine();
                            ManagerStaff.addStaff(new StaffWorkshop(id, name, phone, role, workshopID));
                            break;
                        case 3:
                            // Adding a Shipper
                            System.out.print("Nhập loại xe: ");
                            String car = scanner.nextLine();
                            ManagerStaff.addStaff(new StaffShipper(id, name, phone, role, car));
                            break;
                        default:
                            System.out.println("Loại nhân viên không hợp lệ.");
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Nhập ID nhân viên cần sửa: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("ID không hợp lệ, vui lòng nhập số.");
                        scanner.next();
                    }
                    int idSua = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Nhập tên mới: ");
                    String tenMoi = scanner.nextLine();
                    System.out.print("Nhập số điện thoại mới: ");
                    String phoneMoi = scanner.nextLine();
                    System.out.print("Nhập chức vụ mới: ");
                    String roleMoi = scanner.nextLine();
                    System.out.print("Nhập thông tin bổ sung mới (nếu có, để trống nếu không): ");
                    String extraInfo = scanner.nextLine();

                    ManagerStaff.updateStaff(idSua, tenMoi, phoneMoi, roleMoi, extraInfo);
                    break;

                case 3:
                    System.out.print("Nhập ID nhân viên cần xóa: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("ID không hợp lệ, vui lòng nhập số.");
                        scanner.next();
                    }
                    int idXoa = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    ManagerStaff.deleteStaff(idXoa);
                    break;

                case 4:
                    ManagerStaff.hienThiDanhSachNhanVien();
                    break;

                case 5:
                    ManagerStaff.luuVaoFileCSV(filePath);
                    System.out.println("Danh sách nhân viên đã được lưu vào file " + filePath);
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }
}

