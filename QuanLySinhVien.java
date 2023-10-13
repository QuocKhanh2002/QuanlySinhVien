/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
//import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author AUGUST
 */
public class QuanLySinhVien {
    public static Scanner scanner = new Scanner(System.in);
    private List<SinhVien> SinhVienList;
//    private StudentDao studentDao;
//    public QuanLySinhVien() {
//        studentDao = new StudentDao();
//        SinhVienList = studentDao.read();
//    }
     public void Them() {
//        int ID = NhapID();
//        System.out.println("student id = " + ID);
//        String Name = NhapName();
//        byte Age = NhapAge();
//        String Address = NhapAddress();
//        float GPA = NhapGPA();
//        SinhVien student = new SinhVien(ID, Name, Age, Address, GPA);
//        SinhVienList.add(student);
////        studentDao.write(SinhVienList);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sinh vien can them vao sanh sach: ");
        
        int soSv = sc.nextInt();
        for (int i = 0; i < soSv; i++) {
            sc.nextLine();
            System.out.println("Sinh_Vien Thu:" + i +1 + " La");
            int ID = NhapID();
            String Name = NhapName();
            String Address = NhapAddress();
            byte Age = NhapAge();
            float GPA = NhapGPA();
            SinhVien sv = new SinhVien(ID, Name, Age, Address, GPA);
//            SinhVienList.Them();
//            return ;
        }
    }
//     public void Sua(int ID) {
//        boolean isExisted = false;
//        int size = SinhVienList.size();
//        for (int i = 0; i < size; i++) {
//            if (SinhVienList.get(i).getID() == ID) {
//                isExisted = true;
//                SinhVienList.get(i).setName(NhapName());
//                SinhVienList.get(i).setAge(NhapAge());
//                SinhVienList.get(i).setAddress(NhapAddress());
//                SinhVienList.get(i).setGPA(NhapGPA());
//                break;
//            }
//        }
//        if (!isExisted) {
//            System.out.printf("id = %d not existed.\n", ID);
//        } else {
////            studentDao.write(SinhVienList);
//        }
       public void chinhSua() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien can chinh sua: ");
        int maSv = sc.nextInt();
        sc.nextLine();
        var check = false;
        for (int i = 0; i < SinhVienList.size(); i++) {
            if (maSv == SinhVienList.get(i).getID()) {
                check = true;
                System.out.println("Nhap thong tin sinh vien can chinh sua: ");
                SinhVienList.get(i).setName(NhapName());
                SinhVienList.get(i).setAge(NhapAge());
                SinhVienList.get(i).setAddress(NhapAddress());
                SinhVienList.get(i).setGPA(NhapGPA());
                break;
            }
        }
    }
    public void Xoa(int ID) {
        SinhVien sv = null;
        int size = SinhVienList.size();
        for (int i = 0; i < size; i++) {
            if (SinhVienList.get(i).getID() == ID) {
                sv = SinhVienList.get(i);
                break;
            }
        }
        if (sv != null) {
            SinhVienList.remove(sv);
//            studentDao.write(SinhVienList);
        } else {
            System.out.printf("id = khong ton tai moi nhap lai .\n", ID);
        }
    }
    public void SapXepTheoName() {
        XuLyTen t = new XuLyTen();
        for (int i = 0; i < SinhVienList.size() - 1; i++) {
            for (int j = i + 1; j < SinhVienList.size(); j++) {
                if (t.sapXep(SinhVienList.get(i).getName(), SinhVienList.get(j).getName()) > 0) {
//                    Swap(i, j);
                }
            }
        }
    }
    public void SapXepTheoGPA() {
        for (int i = 0; i < SinhVienList.size() - 1; i++) {
            for (int j = i + 1; j < SinhVienList.size(); j++) {
                if (SinhVienList.get(i).getGPA() > SinhVienList.get(j).getGPA()) {
                }
            }
        }
    }
//    public void show() {
//      
//            System.out.format("ID la : ", sv.getID());
//            System.out.format("Name : ", sv.getName());
//            System.out.format("Age ", sv.getAge());
//            System.out.format("Address | ", sv.getAddress());
//            System.out.format("GPA", sv.getGPA());
//    }
     public void HienThiDanhSach() {
        System.out.println("-----------------DANH SACH SINH VIEN-------------------");
        for (int i = 0; i < SinhVienList.size(); i++) {
            SinhVien sv = new SinhVien();
            sv = SinhVienList.get(i);
            System.out.println(sv.getID() + " Ho&ten: " + sv.getName() + "  Nam sinh: " + sv.getAge() + "  Dia chi: " + sv.getAddress() + "  GPA: " + sv.getGPA());
        }
    }
//    public void Init() {
//        SinhVienList.clear();
//    }
    public int NhapID() {
        System.out.print("Nhap ID Sinh Vien: ");
        while (true) {
            try {
                int ID = Integer.parseInt((scanner.nextLine()));
                return ID;
            } catch (NumberFormatException ex) {
                System.out.print("ID Khong Hop Le Moi nhap lai : ");
            }
        }
    }
    private String NhapName() {
        System.out.print("Nhap Vao Name: ");
        return scanner.nextLine();
    }

    private String NhapAddress() {
        System.out.print("Nhap vao Address: ");
        return scanner.nextLine();
    }

    private byte NhapAge() {
        System.out.print("Nhap vao tuoi Sinh Vien: ");
        while (true) {
            try {
                byte Age = Byte.parseByte((scanner.nextLine()));
                if (Age < 0 && Age > 100) {
                    throw new NumberFormatException();
                }
                return Age;
            } catch (NumberFormatException ex) {
                System.out.print("ID Khong Hop le Moi Nhap Lai: ");
            }
        }
    }
 
    private float NhapGPA() {
        System.out.print("nhap GPA Sinh vien : ");
        while (true) {
            try {
                float GPA = Float.parseFloat((scanner.nextLine()));
                if (GPA < 0.0 && GPA > 10.0) {
                    throw new NumberFormatException();
                }
                return GPA;
            } catch (NumberFormatException ex) {
                System.out.print("GPA Khong Hop le Moi Nhap Lai: ");
            }
        }
    }
 
    public List<SinhVien> getStudentList() {
        return SinhVienList;
    }
 
    public void setStudentList(List<SinhVien> studentList) {
        this.SinhVienList = studentList;
    }

}
