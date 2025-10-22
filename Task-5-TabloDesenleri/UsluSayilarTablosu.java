250542025
  Metehan Salihoğlu



public class UsluSayilarTablosu {

    public static void main(String[] args) {
        int taban = 1;
        int ustSinir = 5; 
        yazdirUsluSayilar(taban, ustSinir);
    }

   
    public static void yazdirUsluSayilar(int taban, int ustSinir) {
        if (ustSinir <= 0) {
            System.out.println("Pozitif bir sınır giriniz!");
            return;
        }

        System.out.println("Sayı\t1.Üs\t2.Üs\t3.Üs\t4.Üs\t5.Üs");
        System.out.println("------------------------------------------------");

        for (int i = taban; i <= ustSinir; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j <= ustSinir; j++) {
                System.out.print((int) Math.pow(i, j) + "\t");
            }
            System.out.println();
        }
    }
}
