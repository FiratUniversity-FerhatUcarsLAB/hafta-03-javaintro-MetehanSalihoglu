250542025
  Metehan Salihoğlu


    
import java.util.Scanner;

public class ParaBozma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bozulacak miktarı giriniz (TL): ");
        int miktar = input.nextInt();
        parayiBoz(miktar);
        input.close();
    }

    public static void parayiBoz(int miktar) {
        if (miktar <= 0) {
            System.out.println("Geçerli bir miktar giriniz!");
            return;
        }

        int[] paralar = {200, 100, 50, 20, 10, 5, 1};
        System.out.println("\nBanknot\tAdet");
        System.out.println("---------------");

        for (int tl : paralar) {
            int adet = miktar / tl;
            miktar %= tl;
            if (adet > 0) {
                System.out.printf("%3d TL\t%3d%n", tl, adet);
            }
        }
    }
}
