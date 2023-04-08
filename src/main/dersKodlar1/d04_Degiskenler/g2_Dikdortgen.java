package d04_Degiskenler;

public class g2_Dikdortgen {
    public static void main(String[] args) {
/*
   2. Dikdörtgen adında bir sınıf oluşturun, herhangi bir Dikdörtgenin
        alanını ve çevresini hesaplayan bir program yazın.

                uzunluk
                Genişlik

        alan = uzunluk * genişlik
        çevre = 2 * (uzunluk + genişlik)

*/

        // uzunluk, genişlik, alan, çevre

        double uzunluk = 5.5;
        double genislik = 10.5;

        double alan = uzunluk * genislik;
        double cevre = 2 * (uzunluk + genislik);

        System.out.println("uzunluk = " + uzunluk);
        System.out.println("genişlik = " + genislik);
        System.out.println("alan = " + alan);
        System.out.println("çevre = " + cevre);

    }
}
