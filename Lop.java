/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisinhvien;

/**
 *
 * @author LENOVO
 */
public class Lop {
    private String MaLop;
    private String TenLop;
    private int Khoa;

    public Lop(String MaLop, String TenLop, int Khoa) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.Khoa = Khoa;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public int getKhoa() {
        return Khoa;
    }

    public void setKhoa(int Khoa) {
        this.Khoa = Khoa;
    }
    
    
}
