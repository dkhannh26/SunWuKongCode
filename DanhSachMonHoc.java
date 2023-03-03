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
public class DanhSachMonHoc {
     private ArrayList<MonHoc> DSMonHoc;

    
    
    public DanhSachMonHoc(ArrayList<MonHoc> DSMonHoc) {
        this.DSMonHoc = DSMonHoc;
    }

    public DanhSachMonHoc() {
        this.DSMonHoc = new ArrayList<MonHoc>();
    }
     
    public ArrayList<MonHoc> getDSMonHoc() {
        return DSMonHoc;
    }

    public void setDSMonHoc(ArrayList<MonHoc> DSMonHoc) {
        this.DSMonHoc = DSMonHoc;
    }
    
    public void showMonHoc() {
        for (MonHoc monHoc : DSMonHoc) {
            System.out.println(monHoc);
        }
    }
    
    public void add(MonHoc mh) {
        this.DSMonHoc.add(mh);
    }
}
