package quanly;

import java.util.Arrays;

public class QuanLyOto implements QuanLy<Oto>{
    private Oto[] otos = new Oto[3];
    private int size = 0;

    @Override
    public void them(Oto oto) {
        otos[size] = oto;
        size++;
    }

    @Override
    public void sua(String name, Oto oto) {
        otos[timKiem(name)] = oto;
    }

    @Override
    public void xoa(String name) {
        otos[timKiem(name)] = null;
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name == otos[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void in() {
        for (int i = 0; i < size; i++) {
            System.out.println(otos[i]);
        }
        System.out.println("-------");
    }

    @Override
    public void sapXep() {
        Arrays.sort(otos);
    }
}
