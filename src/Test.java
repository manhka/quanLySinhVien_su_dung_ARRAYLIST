import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
        do {
            System.out.println("------Menu-------");

            System.out.println("1.- thêm\n" +
                    "2.-in sinh vien ra man hinh\n" +
                    "3.-kiểm tra ds có rỗng không\n" +
                    "4.-lấy ra số lượng sinh viên\n" +
                    "5.-làm rỗng danh sách sinh viên\n" +
                    "6.-kiểm tra sinh viên cong trong ds không , dựa vào sinh viên\n" +
                    "7.-xóa 1 sinh viên\n" +
                    "8.-tìm kiếm sinh viên dựa vào tên\n" +
                    "9.-xuất ra ds sinh viên có điểm từ cao đến thấp\n"
                    + "0.- thoat");System.out.print("enter your choice:");
            choice = scanner.nextInt();

            if (choice == 1) {
                // them sinh vien
                System.out.print("nhập id:");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("nhập họ và tên:");
                String name = scanner.nextLine();
                System.out.print("nhập năm sinh:");
                Integer date = scanner.nextInt();
                System.out.print("nhập điểm trung bình:");
                float average = scanner.nextFloat();
                Sinhvien sinhvien = new Sinhvien(id, name, date, average);
                danhSachSinhVien.themSinhVien(sinhvien);
            } else if (choice == 2) {
                // in danh sach sinh vien
                danhSachSinhVien.inDanhSachSinhVien();
            } else if (choice == 3) {
// kiem tra danh sach rong
                System.out.println("kiểm tra danh sách xem rỗng không : "+danhSachSinhVien.KiemTraDs());
            } else if (choice == 4) {
                //lấy ra số lượng sinh viên
                System.out.println("lấy ra số lượng sinh viên :"+danhSachSinhVien.laySoLuong());
            } else if (choice == 5) {
                danhSachSinhVien.xoahet();
            } else if (choice == 6) {
                scanner.nextLine();
                System.out.println("nhap ten:");
                String name= scanner.nextLine();
                Sinhvien sinhvien=new Sinhvien(name);
                System.out.println("kiem tra sinh vien co trong ds khong:"
                        +danhSachSinhVien.kiemTraSuTonTai(sinhvien));
            } else if (choice == 7) {
                System.out.println("nhap id:");
                int id= scanner.nextInt();
                Sinhvien sinhvien=new Sinhvien(id);
                danhSachSinhVien.xoaMotSV(sinhvien);
                System.out.println("xoa mot sinh vien trong danh sach"
                        +danhSachSinhVien.xoaMotSV(sinhvien));
            } else if (choice == 8) {
                scanner.nextLine();
                System.out.println("nhap ho ten sinh vien can tim:" );
                String hoten= scanner.nextLine();
                danhSachSinhVien.timSV(hoten);
            }else if (choice==9){
                danhSachSinhVien.sapXepSvTheoDiem();
                danhSachSinhVien.inDanhSachSinhVien();
            }
        }
        while (choice != 0);

    }
}
