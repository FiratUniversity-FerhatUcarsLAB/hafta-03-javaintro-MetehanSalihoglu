250542025
  Metehan Salihoğlu



    

import java.util.Scanner;

public class VucutKitleIndeksi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz (kg): ");
        double kilo = input.nextDouble();
        System.out.print("Boyunuzu giriniz (metre): ");
        double boy = input.nextDouble();

        double vki = hesaplaVKI(kilo, boy);
        yorumlaVKI(vki);

        input.close();
    }

   
    public static double hesaplaVKI(double kilo, double boy) {
        if (kilo <= 0 || boy <= 0) {
            System.out.println("Geçersiz değer girildi!");
            return 0;
        }
        return kilo / (boy * boy);
    }

 
    public static void yorumlaVKI(double vki) {
        System.out.printf("Vücut Kitle İndeksiniz: %.2f%n", vki);

        if (vki < 18.5)
            System.out.println("Durum: Zayıf");
        else if (vki < 25)
            System.out.println("Durum: Normal");
        else if (vki < 30)
            System.out.println("Durum: Fazla Kilolu");
        else
            System.out.println("Durum: Obez");
    }
}
