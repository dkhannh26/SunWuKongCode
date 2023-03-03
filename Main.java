/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlisinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonHoc mh1 = new MonHoc("PRO", "code", "IT");
        MonHoc mh2 = new MonHoc("MAD", "Toan", "IT");

        SinhVien sv1 = new SinhVien("Bob", "Nguyen Chi Nguyen", "ap1", "SE1");
        Diem Dsv1 = new Diem(sv1, mh1, 9);
        SinhVien sv2 = new SinhVien("BZ", "Tran Thanh Duy   ", "ap2", "SE2");
        Diem Dsv2 = new Diem(sv2, mh2, 9);
        SinhVien sv3 = new SinhVien("CX", "Duong Quang Khanh", "ap3", "SE3");

        int LuaChon = 0;
        String check;

        DanhSach DS = new DanhSach();
        DanhSachMonHoc MH = new DanhSachMonHoc();

        DS.addSV(sv1);
        DS.addSV(sv2);
        DS.addSV(sv3);
        MH.add(mh1);
        MH.add(mh2);
        do {
            System.out.println("");
            System.out.println("MENU: ");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xoa 1 sinh vien");
            System.out.println("3. Thay doi lop cho sinh vien");
            System.out.println("4. Sap xep");
            System.out.println("5. Tim kiem sinh vien ");
            System.out.println("6. Danh sach");
            System.out.println("7. Hien thi so luong sinh vien");
            System.out.println("0. Exit");
            System.out.println("Lua chon:");
            LuaChon = sc.nextInt();
            sc.nextLine();
            if (LuaChon == 1) {
                System.out.println("Nhap ma sinh vien: ");
                String MaSV = sc.nextLine();
                System.out.println("Nhap  ten sinh vien ");
                String HoTen = sc.nextLine();
                System.out.println("Nhap dia chi: ");
                String DiaChi = sc.nextLine();
                System.out.println("Nhap lop: ");
                String Lop = sc.nextLine();
                SinhVien sv = new SinhVien(MaSV, HoTen, DiaChi, Lop);
                DS.addSV(sv);
                System.out.println("Them sinh vien thanh cong.");
            } else if (LuaChon == 2) {
                System.out.println("Nhap ma sinh vien can xoa:");
                String MaSV = sc.nextLine();
                SinhVien sv = new SinhVien(MaSV);
                DS.XoaSV(sv);
                System.out.println("Da xoa thanh cong!!");
            } else if (LuaChon == 3) {
                System.out.println("Nhap ma sinh vien can doi: ");
//                String MaSV = sc.nextLine();
//
//                SinhVien sv = new SinhVien(MaSV);
//               
//                sv.setLop(sc.nextLine());                
//                switch (sc.nextInt()) {
//                    case 1:
//                        sc.nextLine();
//                        System.out.println("Doi ten lop");
//                        sv1.setLop(sc.nextLine());
//                        break;
//                    case 2:
//                        sc.nextLine();
//                        System.out.println("Doi ten lop");
//                        sv2.setLop(sc.nextLine());
//                        break;
//                    case 3:
//                        sc.nextLine();
//                        System.out.print("Doi ten lop");
//
//                        sv3.setLop(sc.nextLine());
//
//                        break;
//                }
                String oMaSV = sc.nextLine();
                System.out.println("Thay doi lop cho sinh vien");
                DS.SetInfo(oMaSV);
                }else if (LuaChon == 4) {
                System.out.println("Sap xep theo bang chu cai:");
                DS.sort();
                DS.Show();
            } else if (LuaChon == 5) {
                System.out.println("Nhap ho va ten ");
                String HoTen = sc.nextLine();
                System.out.println("Kết quả tìm kiếm: ");
                DS.findSV(HoTen);

            } else if (LuaChon == 6) {
                DS.Show();
                MH.showMonHoc();
            } else if (LuaChon == 7) {
                System.out.print("So luong sinh vien: " + DS.SoLuongSV());

            } else if (LuaChon == 0) {
                System.out.println("Thank you, see u again!!!");

            } else {
                System.out.println("Sai lua chon!");
                System.out.println("Moi nhap lai");
            }

            }
            while (LuaChon != 0);
        }

    }
