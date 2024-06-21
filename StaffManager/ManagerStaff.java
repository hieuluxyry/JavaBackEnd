import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ManagerStaff {
    private static final List<Staff> danhsachNhanVien = new ArrayList<>();

    // Method to add a new staff
    public static void addStaff(Staff nv) {
        danhsachNhanVien.add(nv);
    }

    public static void updateStaff(int id, String name, String phone, String role, String extraInfo) {
        for (Staff nv : danhsachNhanVien) {
            if (nv.getId() == id) {
                nv.setName(name);
                nv.setPhone(phone);
                nv.setRole(role);
                if (nv instanceof StaffWorkshop) {
                    ((StaffWorkshop) nv).setWorkshopID(extraInfo);
                } else if (nv instanceof StaffShipper) {
                    ((StaffShipper) nv).setCar(extraInfo);
                }
                break;
            }
        }
    }

    public static void deleteStaff(int id) {
        danhsachNhanVien.removeIf(nv -> nv.getId() == id);
    }

    public static void hienThiDanhSachNhanVien() {
        for (Staff nv : danhsachNhanVien) {
            nv.hienThiThongTin();
            System.out.println("-----");
        }
    }

    public static void luuVaoFileCSV(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Staff nv : danhsachNhanVien) {
                writer.write(nv.toCSV());
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi ghi vào file CSV: " + e.getMessage());
        }
    }

    public void docTuCSV(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String phone = parts[2];
                String role = parts[3];
                String type = parts[4];
                switch (type) {
                    case "StaffOffice":
                        addStaff(new StaffOffice(id, name, phone, role));
                        break;
                    case "StaffWorkshop":
                        String workshopID = parts[5];
                        addStaff(new StaffWorkshop(id, name, phone, role, workshopID));
                        break;
                    case "StaffShipper":
                        String car = parts[5];
                        addStaff(new StaffShipper(id, name, phone, role, car));
                        break;
                    default:
                        System.err.println("Loại nhân viên không xác định: " + type);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi đọc từ file CSV: " + e.getMessage());
        }
    }
}


