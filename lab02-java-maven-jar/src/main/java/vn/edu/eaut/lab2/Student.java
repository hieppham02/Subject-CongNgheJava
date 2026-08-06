
package vn.edu.eaut.lab2;

public class Student {
    private String id;
    private String hoten;
    private String rank;
    private double cc;
    private double gk;
    private double ck;

    public Student(String id, String hoten) {
        this.id = id;
        this.hoten = hoten;
    }

    public String getId() { return id; }
    public String getName() { return hoten; }
    public String getRank() { return rank; }
    public double getCC() { return cc; }
    public double getGK() { return gk; }
    public double getCk() { return ck; }
    public void setRank(String rank) {}
    
}
