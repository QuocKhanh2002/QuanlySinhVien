/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.Scanner;
/**
 *
 * @author AUGUST
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        String choose = null;
//        boolean exit = false;
        QuanLySinhVien studentManager = new QuanLySinhVien();
        int svID;
        Menu();
        while (true) {
            choose = scanner.nextLine();  
            switch (choose) {
            case "1":
                studentManager.Them();
                break;
            case "2":
                svID = studentManager.NhapID();
                studentManager.chinhSua();
                break;
            case "3":
                svID = studentManager.NhapID();
                studentManager.Xoa(svID);
                break;
            case "4":
                studentManager.SapXepTheoGPA();
                break;
            case "5":
                studentManager.SapXepTheoName();
                break;
            case "6":
                studentManager.HienThiDanhSach();
                break;
            case "0":
                System.exit(0);
//                System.out.println("exited!");
//                exit = true;
                break;
            default:
                System.out.println("Lua chon khong hop le vui long nhap lai lua chon:");
                break;
            }
//            if (exit) {
//                break;
//            }
            // show menu
            Menu();
        }
    }
    /**
     * create menu
     */
    public static void Menu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Them Sinh Vien.");
        System.out.println("2. Sua thong tin Sinh vien .");
        System.out.println("3. xoa sinh vien .");
        System.out.println("4. sap xep sinh vien theo gpa.");
        System.out.println("5. sap xep sinh vien theo name.");
        System.out.println("6. hien thi danh sach sinh vien.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Moi Nhap Lua Chon: ");
    }
}
