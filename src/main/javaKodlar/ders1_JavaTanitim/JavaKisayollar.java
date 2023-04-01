package ders1_JavaTanitim;

public class JavaKisayollar {
    public static void main(String[] args) {
/*
        Java Kısayolları (Intellij)

        1- Kod Ekranı nasıl yakınlaştırılır (zoom) ve uzaklaştırılır
                -File/Setting/Editor/General --> Mouse Control

        2- Kod Ekranı nasıl Karanlık (Darcula) veya Beyaz mod olarak değiştirilir
                -File/Setting/Appearance&Behavior/Appearence --> Theme

        3- Intellij'de tek veya birden fazla yorum satırı nasıl yapılır?
                -her satır için; CRTL + /
                    (her satırın başına // bu işareti ekler)
                -çoklu satır için; CRTL + SHIFT + /
                    (ilk satırın başına /* işaretini ekler ve son satırın sonuna /* işaretini ekler)

        4- IntelliJ kullanırken projede arama nasıl yapılır, aynı kod nasıl kopyalanır ?
                - CTRL + F : aktif sayfada arama yapar
                - CTRL + SHIFT + F : tüm projede arama yapar
                - CTRL + D : imleçin bulunduğu kod satırını alt satıra kopyalar

        5- JAVA ile Konsola Yazı Yazdırma
                - JAVA yukarıdan aşağıya ve soldan sağa çalışır
                - println: sonraki satıra ekler
                - print: sonraki satırı eklemez
                - System.err.print: çıtıyı kırmızı yazdırır

        6- Kodu başlatmak için (RUN yapmak için)
                - SHIFT + F10

 */

        //3- Yorum satırı nasıl yapılır?
        //-her satır için; CRTL + /
        //-çoklu satır için; CRTL + SHIFT + /

        System.out.println("Satır1" );
        System.out.println("Satır2; Hello World" );
        System.out.print("Satır3; Merhaba Dünya");
        System.err.println("Satır4; Merhaba Arkadaşlar");


    }
}
