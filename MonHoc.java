/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisinhvien;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class MonHoc{
    String MaMon;
    String TenMon;
    String NganhHoc;
    private ArrayList<MonHoc> DSMonHoc;


    public MonHoc(String MaMon, String TenMon, String NganhHoc) {
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.NganhHoc = NganhHoc;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getNganhHoc() {
        return NganhHoc;
    }

    public void setNganhHoc(String NganhHoc) {
        this.NganhHoc = NganhHoc;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "MaMon=" + MaMon + ", TenMon=" + TenMon + ", NganhHoc=" + NganhHoc + '}';
    }
    
    
    
    
}
