250542025
  Metehan Salihoğlu

     public class HesapOzeti {
    public static void main(String[] args) { 
       String urun1="saat";
       int miktar1=9;
       int fiyat1=70000;
       int toplam1=miktar1*fiyat1;

       String urun2="şeker";
       int miktar2=25;
       double fiyat2=45;
       double toplam2=miktar2*fiyat2;

       String urun3="ayakkabı";
       int miktar3= 1;
       double fiyat3=285;
       double toplam3=miktar3*fiyat3;
       double geneltoplam=toplam1+toplam2+toplam3;

       System.out.println("urun1+\t miktar1+\t fiyat1"+toplam1);
       System.out.println("urun2+\t miktar2+\t fiyat2"+toplam2);
       System.out.println("urun3+\t miktar3+\t fiyat3"+toplam2);

       System.out.println("\t\t\tGenel Toplam"+geneltoplam);
   }
   
}
