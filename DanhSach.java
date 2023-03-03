/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class DanhSach {
    Scanner sc =new Scanner(System.in);
    private ArrayList<SinhVien> DanhSach;
    
    
    public DanhSach(ArrayList<SinhVien> DanhSach) {
        this.DanhSach = DanhSach;
    }
   
    public ArrayList<SinhVien> getDanhSach() {
        return DanhSach;
    }
     
    public void setDanhSach(ArrayList<SinhVien> DanhSach) {
        this.DanhSach = DanhSach;
    }

    public DanhSach() {
        this.DanhSach = new ArrayList<SinhVien>();
    }

    public void addSV(SinhVien sv) {
        this.DanhSach.add(sv);
    }

    public void Show() {
        for (SinhVien SinhVien : DanhSach) {
            System.out.println(SinhVien);
        }
    }

    public int SoLuongSV() {
        return this.DanhSach.size();
    }

    public boolean XoaSV(SinhVien sv) {
        return this.DanhSach.remove(sv);
    }

    public void findSV(String ten) {
        for (SinhVien sinhVien : DanhSach) {
            if (sinhVien.getHoTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien); }
//            } else if (sinhVien.getHoTen().indexOf(ten) < 0) {
//                System.out.println("Khong co sinh vien nay trong danh sach");
//                break;
//            }
            
        }
    }
    
    public void SetInfo(String oMaSV) {
        for (SinhVien sinhVien : DanhSach) {
            if(sinhVien.getMaSV().equals(oMaSV)) {
                sinhVien.setLop(sc.nextLine());
            }
        }
    }

    public void sort() {
        Collections.sort(this.DanhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getHoTen().charAt(0) < sv2.getHoTen().charAt(0)) {
                    return -1;
                } else if (sv1.getHoTen().charAt(0) > sv2.getHoTen().charAt(0)) {
                    return 1;
                } else {
                    return 0;
                }

            }
        });
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
