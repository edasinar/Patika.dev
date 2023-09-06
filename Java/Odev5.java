import java.util.Scanner;

public class Odev5 {

    public static void main(String[] args) {
        cevreVeAlan();
        dilimAlan();
    }
    
    public static void cevreVeAlan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("yarıçapı giriniz: ");
        int cap = sc.nextInt();
        
        double PI = 3.14;
        
        double cevre = 2 * PI * cap;
        double alan = PI * cap * cap;

        System.out.println("çevre: " + cevre + " alan: " + alan);
    }
    
    public static void dilimAlan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("sırasıyla yarıçapı ve açıyı giriniz: ");
        int r = sc.nextInt();
        int a = sc.nextInt();
        System.out.println("dilim dairenin alanı: " + (3.14 * r * r * a)/360);
    }
}
