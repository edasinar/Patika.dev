import java.util.Scanner;

public class Odev3 {

    public static void main(String[] args) {
        hipotenus();
        area();

    }


    public static void hipotenus() {

        Scanner sc = new Scanner(System.in);

        // hipotenüs hesaplama
        System.out.print("Sırasıyla iki dik kenarın uzunluklarını girin: ");
        int kenar1 = sc.nextInt();
        int kenar2 = sc.nextInt();

        double hipotenus = Math.sqrt( kenar1 * kenar1 + kenar2 * kenar2);

        System.out.println("hipotenüs: " + hipotenus);
    }
    public static void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sırasıyla kenarların uzunluklarını girin: ");
        int kenar1 = sc.nextInt();
        int kenar2 = sc.nextInt();
        int kenar3 = sc.nextInt();

        double u = (kenar1 + kenar2 + kenar3) / 2;

        double alan = u * (u - kenar1) * (u - kenar2) * (u - kenar3);

        System.out.println("girilen kenarlara ilişkinin üçgenin alanı: " + Math.sqrt((alan < 0 ? alan * -1 : alan)));
    }
}
