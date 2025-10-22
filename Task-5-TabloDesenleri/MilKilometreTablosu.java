250542025
  Metehan Salihoğlu



public class MilKilometreTablosu {

    public static void main(String[] args) {
        double baslangic = 1.0;
        double bitis = 10.0;
        tabloyuYazdir(baslangic, bitis);
    }

  
    public static void tabloyuYazdir(double baslangic, double bitis) {
        if (baslangic >= bitis || baslangic < 0) {
            System.out.println("Geçerli bir aralık giriniz!");
            return;
        }

        System.out.println("Mil\t|\tKilometre");
        System.out.println("------------------------");

        for (double mil = baslangic; mil <= bitis; mil++) {
            double km = mil * 1.609;
            System.out.printf("%.2f\t|\t%.3f%n", mil, km);
        }
    }
}
