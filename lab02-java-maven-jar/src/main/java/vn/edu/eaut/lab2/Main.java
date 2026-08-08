package vn.edu.eaut.lab2;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static double diemCC;
    public static double diemGK;
    public static double diemCK;
    public static double diemTongKet;

    public static String maSV;
    public static String hoTen;
    public static String xepLoai;

    // public static void main(String[] args) {
    //     NhapDuLieu();
    //     TinhDiem();
    //     XepLoai();
    //     HienThiDuLieu();
    //     scanner.close();
    // }

    public static void NhapDuLieu() {
        System.out.println("--- NHAP DU LIEU SINH VIEN ---");

        System.out.print("Nhap ma sinh vien: ");
        maSV = scanner.nextLine();

        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();

        diemCC = Double.parseDouble(NhapDiem("diem chuyen can"));
        diemGK = Double.parseDouble(NhapDiem("diem giua ky"));
        diemCK = Double.parseDouble(NhapDiem("diem cuoi ky"));
    }

    public static void HienThiDuLieu() {
        System.out.println("\n================ KET QUA ================");
        System.out.printf("%-10s | %-20s | %-15s | %-8s\n", "Ma SV", "Ho ten", "Diem tong ket", "Xep loai");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s | %-20s | %-15.2f | %-8s\n", maSV, hoTen, diemTongKet, xepLoai);
        System.out.println("=========================================================");

        // System.out.println(maSV + " - " + hoTen + " - " + diemTongKet + " - " +
        // xepLoai);
    }

    public static void TinhDiem() {
        diemTongKet = 0.1 * diemCC + 0.3 * diemGK + 0.6 * diemCK;
    }

    public static void XepLoai() {
        if (diemTongKet >= 8.5) {
            xepLoai = "A";
        } else if (diemTongKet >= 7.0) {
            xepLoai = "B";
        } else if (diemTongKet >= 5.5) {
            xepLoai = "C";
        } else if (diemTongKet >= 4.0) {
            xepLoai = "D";
        } else {
            xepLoai = "F";
        }
    }

    public static String NhapDiem(String diemQuaTrinh) {
        String diem;
        while (true) {
            System.out.print("Nhap " + diemQuaTrinh + ": ");
            diem = scanner.nextLine();
            try {
                double diemSo = Double.parseDouble(diem);
                if (diemSo >= 0 && diemSo <= 10) {
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
