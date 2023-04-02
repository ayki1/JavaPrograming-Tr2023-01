package ders1_JavaTanitim;

public class d02_JavaKisayollar {
    public static void main(String[] args) {
/*
        JAVA KISAYOLLARI (INTELLIJ) VE KOD YAZMA KURALLARI

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

        7- BAZI ZORUNLU KURALLAR
            1. Class adınız ve dosya adınız aynı olmalıdır
            2. JAVA'da "{","(","[") her açılış parantezi için "}",")","]" kapatma parantezlerine sahip olmanız gerekir.
            3. ";" (noktalı virgül) kodunuzun bittiği yerde olması gerekir.
            4. Kodlarınızı çalıştırmak için "main" method yönteminizin olması gerekir
 */


        //3- Yorum satırı nasıl yapılır?
        //-her satır için; CRTL + /
        //-çoklu satır için; CRTL + SHIFT + /

        System.out.println("Satır1");
        System.out.println("Satır2");    // önce yazdır sonra bir sonraki satıra git
        System.out.print("Satır3");  // CTRL + D , CMND+D
        System.err.println("Satır4"); //err

        /*System.out.print("Bir");
        System.out.println("İki");
        System.out.print("Üç");
        System.err.println("Hata bildirimi");   //err
*/

    }
}
