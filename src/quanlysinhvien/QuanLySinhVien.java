package quanlysinhvien;

public class QuanLySinhVien implements QuanLy<SinhVien>{
    private SinhVien[] sinhViens = new SinhVien[4];
    private int size = 0;

    @Override
    public void them(SinhVien sinhVien) {
        sinhViens[size] = sinhVien;
        size++;
    }

    @Override
    public void sua(String ten, SinhVien sinhVien) {
        sinhViens[timKiem(ten)] = sinhVien;
    }

    @Override
    public int timKiem(String ten) {
        for (int  i = 0; i < size; i++) {
            if (ten == sinhViens[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < size; i++) {
            System.out.println(sinhViens[i]);
        }
        System.out.println("-------");
    }
}
