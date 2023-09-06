import java.util.Scanner;

public class Proje1 {

    public static void main(String[] args) {
     vki();
    }

    public static void vki() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = sc.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = sc.nextDouble();

        double bmi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}
