package main.java.vn.edu.eaut.lab1;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");  
        int n = scanner.nextInt();
        if(KiemTraNguyenTo(n))
            System.out.print(n + " la so nguyen to\n");
        else{
            System.out.print(n + " khong phai so nguyen to\n");
        }
        for(int i = 0; i <= n; i++){
            System.out.print(Fibonaci(i) + " ");
        }
    }
    
    static public boolean KiemTraNguyenTo(int n){
        if (n <= 2)
            return false;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    static int Fibonaci(int n){
        if (n <= 1) return n;
        return Fibonaci(n - 1) + Fibonaci(n - 2);
    }
}
