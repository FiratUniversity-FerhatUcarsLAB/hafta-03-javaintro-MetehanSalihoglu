250542025
  Metehan Salihoğlu


public class CarpimTablosu {

    public static void main(String[] args) {
        int n = 10;  
        yazdirCarpimTablosu(n);
    }


    public static void yazdirCarpimTablosu(int n) {
        if (n <= 0) {
            System.out.println("Pozitif bir sayı giriniz!");
            return;
        }

        System.out.print("    ");
        for (int j = 1; j <= n; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();
        System.out.print("    ");
        for (int j = 1; j <= n; j++) {
            System.out.print("____");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
