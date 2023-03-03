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
public class Diem {
    private SinhVien SinhVien;
    private MonHoc MonHoc;
    private double Diem;

    public Diem(SinhVien SinhVien, MonHoc MonHoc, double Diem) {
        this.SinhVien = SinhVien;
        this.MonHoc = MonHoc;
        this.Diem = Diem;
    }

    public SinhVien getSinhVien() {
        return SinhVien;
    }

    public void setSinhVien(SinhVien SinhVien) {
        this.SinhVien = SinhVien;
    }

    public MonHoc getMonHoc() {
        return MonHoc;
    }

    public void setMonHoc(MonHoc MonHoc) {
        this.MonHoc = MonHoc;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }

  
    
}
