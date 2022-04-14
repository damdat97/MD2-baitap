package quanly;

public class Test {
    public static void main(String[] args) {
        QuanLyXeMay qlxm = new QuanLyXeMay();
        XeMay xm1 = new XeMay("Honda", "Den", "a", 20, 150);
        XeMay xm2 = new XeMay("Honda", "Xanh", "b", 80, 150);
        XeMay xm3 = new XeMay("Honda", "Do", "c", 60, 150);

        qlxm.them(xm1);
        qlxm.them(xm2);
        qlxm.them(xm3);
        qlxm.in();
        qlxm.sapXep();
        System.out.println(qlxm.timKiem("a"));

        XeMay xm4 = new XeMay("Honda", "Trang", "d", 70, 200);
        qlxm.sua("c", xm4);
        qlxm.in();
        qlxm.xoa("b");
        qlxm.in();

        QuanLyOto qlot = new QuanLyOto();
        Oto ot1 = new Oto("Suzuki", "Hong", "ad", 440, 4);
        Oto ot2 = new Oto("Ford", "Do", "va", 880, 4);
        Oto ot3 = new Oto("Audi", "Vang", "aa", 1500, 4);

        qlot.them(ot1);
        qlot.them(ot2);
        qlot.them(ot3);
        qlot.in();
        qlot.sapXep();
        System.out.println(qlot.timKiem("va"));

        Oto ot4 = new Oto("Toyota", "Xanh", "abc", 2500, 4);
        qlot.sua("aa", ot4);
        qlot.in();
        qlot.xoa("Suzuki");
        qlot.in();
    }
}
