package vn.edu.eaut.lab2;

import java.util.*;

public class App {
    
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- NHAP DU LIEU SINH VIEN ---");
        System.out.print("Nhap ma sinh vien: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        String name = scanner.nextLine();

        Student student = new Student(id, name);

        double cc = inputValidGrade("diem chuyen can");
        double gk = inputValidGrade("diem giua ky");
        double ck = inputValidGrade("diem cuoi ky");

        GradeCalculator calculator = new GradeCalculator();
        double finalGrade = calculator.TinhDiemTongKet(cc, gk, ck);
        String rank = calculator.XepLoai(finalGrade);

        System.out.println("\n================ KET QUA ================");
        System.out.printf("%-10s | %-20s | %-15s | %-8s\n", "Ma SV", "Ho ten", "Diem tong ket", "Xep loai");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s | %-20s | %-15.2f | %-8s\n", student.getId(), student.getName(), finalGrade, rank);
        System.out.println("=========================================================");
    }

    private static double inputValidGrade(String monHoc) {
        Scanner scanner = new Scanner(System.in);
        double diem;
        while (true) {
            try {
                System.out.print("Nhap " + monHoc + ": ");
                diem = Double.parseDouble(scanner.nextLine());

                if (diem >= 0 && diem <= 10) {
                    break; 
                } else {
                    System.out.println("-> Loi: Diem khong hop le! Phai nam trong khoang [0 - 10]. Vui long nhap lai.");
                }
            } catch (NumberFormatException e) {
                System.out.println("-> Loi: Dinh dang khong hop le! Vui long nhap vao mot so thuc.");
            }
        }
        return diem;
    }

}
