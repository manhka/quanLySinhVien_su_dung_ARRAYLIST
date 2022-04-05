
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<Sinhvien> danhsach;

    public DanhSachSinhVien() {
        this.danhsach = new ArrayList<Sinhvien>();
    }


    public DanhSachSinhVien(ArrayList<Sinhvien> danhsach) {
        this.danhsach = danhsach;
    }

    public void themSinhVien(Sinhvien sinhvien) {
        this.danhsach.add(sinhvien);
    }

    public void inDanhSachSinhVien() {
        for (Sinhvien sinhvien : danhsach
        ) {
            System.out.println(sinhvien);
        }

    }

    public boolean KiemTraDs() {
        return this.danhsach.isEmpty();
    }

    public int laySoLuong() {
        return this.danhsach.size();
    }

    public void xoahet() {
        this.danhsach.removeAll(danhsach);
    }

    public boolean kiemTraSuTonTai(Sinhvien sinhvien) {
        Sinhvien sinhvien1=new Sinhvien();
        return this.danhsach.contains(sinhvien);
    }

    public boolean xoaMotSV(Sinhvien sinhvien) {
        return this.danhsach.remove(sinhvien);
    }

    public void timSV(String ten) {
        for (Sinhvien sinhvien : danhsach
        ) {
            if (sinhvien.getName().indexOf(ten) >= 0) {
                System.out.println(sinhvien);
            }
        }
    }
    public void sapXepSvTheoDiem(){
        Collections.sort(this.danhsach, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien sv1, Sinhvien sv2) {
                return (int) (sv1.getAverageMark()-sv2.getAverageMark());
            }
        });
    }



}
