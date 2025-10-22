250542025
  Metehan Salihoğlu


    
import java.util.Scanner;

public class SaatDonusturme {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dakika cinsinden süreyi giriniz: ");
        int dakika = input.nextInt();
        donustur(dakika);
        input.close();
    }

    public static void donustur(int dakika) {
        if (dakika < 0) {
            System.out.println("Negatif değer girilemez!");
            return;
        }

        int saat = dakika / 60;
        int kalanDakika = dakika % 60;

        System.out.printf("%d dakika = %d saat %d dakika%n", dakika, saat, kalanDakika);
    }
}
