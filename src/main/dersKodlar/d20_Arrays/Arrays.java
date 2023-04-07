package d20_Arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        //String[] ogrenciler = {"Ahmet", "Cem", "Aslı"};

        ogrenciler[0] = "Ahmet";
        ogrenciler[1] = "Cem";
        ogrenciler[2] = "Betül";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println("ogrenciler = " + ogrenciler[i]);
        }

        System.out.println("-----------------------------");

        for (String ogrenci : ogrenciler) {
            System.out.println("ogrenci = " + ogrenci);
        }

        System.out.println("-----------------------------");

        int[] sayilar = {7, 5, 1, 6};
        int toplamSayilar = 0;
        int enBuyukSayi = 0;

        for (int sayi : sayilar) {
            if (enBuyukSayi < sayi) {
                enBuyukSayi = sayi;
            }
            toplamSayilar = toplamSayilar + sayi;
            System.out.println("sayi = " + sayi);
        }
        System.out.println("toplamSayilar = " + toplamSayilar);
        System.out.println("enBuyukSayi = " + enBuyukSayi);

    }
}
