package quanlysinhvien;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        SinhVien sv1 = new SinhVien(1, "Dat", 18, 5);
        SinhVien sv2 = new SinhVien(2, "Dat1", 19, 6);
        SinhVien sv3 = new SinhVien(3, "Dat2", 20, 7);
        SinhVien sv4 = new SinhVien(4, "Dat3", 21, 8);

        ql.them(sv1);
        ql.them(sv2);
        ql.them(sv3);
        ql.them(sv4);
        ql.hienThi();
        System.out.println(ql.timKiem("Dat"));

        SinhVien sv5 = new SinhVien(5, "Dat4", 22, 9);
        ql.sua("Dat1", sv5);
        ql.hienThi();
    }
}
