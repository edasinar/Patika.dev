import java.util.Scanner;

public class Odev4 {

    public static void main(String[] args) {
        taksimetre();
    }
    public static void taksimetre() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gidilen kilometreyi giriniz: ");
        int km = sc.nextInt();

        double ucret = km * 2.2 + 10;

        System.out.println("ödenecek tutar: " + (ucret < 20 ? 20 : ucret));

    }
}
