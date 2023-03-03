/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisinhvien;

import java.util.Objects;
/**
 *
 * @author LENOVO
 */
public class SinhVien implements Comparable<SinhVien>{
    public String MaSV;
    public String HoTen;
    public String DiaChi;
    public String Lop;

    public SinhVien(String MaSV, String HoTen, String DiaChi, String Lop) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.Lop = Lop;
    }

    public SinhVien(String MaSV) {
        this.MaSV = MaSV;
    }

    
    public SinhVien() {
    }



    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "MaSV=" + MaSV + ", HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", Lop=" + Lop + '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.MaSV.compareTo(o.MaSV);
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        
        if (obj == null) 
            return false;
        
        if (getClass() != obj.getClass()) 
            return false;
        
        
        
       SinhVien other = (SinhVien) obj;
       return Objects.equals(MaSV, other.MaSV);
    }

    void set(int i, SinhVien sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
    
}
