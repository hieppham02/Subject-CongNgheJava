package vn.edu.eaut.lab2;

public class GradeCalculator {
    public double TinhDiemTongKet(double cc, double gk, double ck) {
        return (cc * 0.1) + (gk * 0.3) + (ck * 0.6);
    }

    public String XepLoai(double tongDiem) {
        if (tongDiem >= 8.5) {
            return "A";
        } else if (tongDiem >= 7.0) {
            return "B";
        } else if (tongDiem >= 5.5) {
            return "C";
        } else if (tongDiem >= 4.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
