import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik ders notunu giriniz: ");
        int math = Integer.parseInt(sc.nextLine());

        System.out.print("Fizik ders notunu giriniz: ");
        int physics = Integer.parseInt(sc.nextLine());

        System.out.print("Kimya ders notunu giriniz: ");
        int chemistry = Integer.parseInt(sc.nextLine());

        System.out.print("Türkçe ders notunu giriniz: ");
        int turkish = Integer.parseInt(sc.nextLine());

        System.out.print("Tarih ders notunu giriniz: ");
        int history = Integer.parseInt(sc.nextLine());

        System.out.print("Müzik ders notunu giriniz: ");
        int music = Integer.parseInt(sc.nextLine());

        double avg = (math + physics + chemistry + turkish + history + music) / 6;

        System.out.println(avg > 60 ? "Sınıfı geçti" : "Sınıfta kaldı");
    }
}
