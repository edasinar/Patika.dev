import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Para miktarı giriniz: ");
        float amount = Float.parseFloat(sc.nextLine());

        float kdv = (amount > 0 && amount < 1000) ? .18f : .8f;

        float kdvAmount = amount * kdv;
        float newAmount = amount + kdvAmount;

        System.out.println("Kdv tutarı: " + kdvAmount + " kdv'li yeni miktar: " + newAmount);

    }
}
