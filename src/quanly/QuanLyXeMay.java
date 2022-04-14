package quanly;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay>{
    private XeMay[] xeMays = new XeMay[3];
    private int size = 0;

    @Override
    public void them(XeMay xeMay) {
        xeMays[size] = xeMay;
        size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        xeMays[timKiem(name)] = xeMay;
    }

    @Override
    public void xoa(String name) {
        xeMays[timKiem(name)] = null;
    }

    @Override
    public int timKiem(String name) {
        for (int i = 0; i < size ; i++) {
            if (name == xeMays[i].getTen()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void in() {
        for (int i = 0; i < size; i++) {
            System.out.println(xeMays[i]);
        }
        System.out.println("-----------");
    }

    @Override
    public void sapXep() {
        Arrays.sort(xeMays);
    }
}

