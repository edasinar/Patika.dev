import java.util.Scanner;

public class Proje2 {

    public static void main(String[] args) {
     manav();
    }

    public static void manav() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        int armut = sc.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        int elma = sc.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        int domates = sc.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        int muz = sc.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        int patlican = sc.nextInt();

        double toplam = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.0;

        System.out.println("Toplam tutar: " + toplam + "TL");
    }
}
