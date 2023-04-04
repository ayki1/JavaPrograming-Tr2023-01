package d04_Degiskenler;

public class d1_Degiskenler_Variables {
    public static void main(String[] args) {

  /*    byte yas = 38;
        int arabanizin_Degeri = 320000;
        short boyunuz = 176;
        float su_Miktari = 3921.5f;
        double gezegenin_Agirligi = 392222277772222.4;

        int yasiniz=27;
        String ilkAd="Mehmet";
        String ikinciAd="Ali";
        String soyad="BİRAND";
        long kimlikNo=1234567891;


        /*double isim;
        int isim1;
        long $isim;
        char _isim;
        short yasi20olanlar;
        byte ev_Adresi;

        double 1isim;
        int *isim1;
        short yasi20@olanlar;
        byte ev Adresi;

         */


        //Değişkenler:

        //int yasiniz = 25;             //tamsayılar için

        double ondaliksayi = 12.45;   //ondalık sayılar için
        char tekKarakter = 'B';       //tek karakterler için
        boolean dogruYanlis = true;   //doğru-yanlış mı


        // yaş: 38
        //  byte = -128 / 127 aralığındaki sayılar
        byte yas = 38;

        // boyunuz: 176
        // short: -32768 ile 32767 aralığındaki sayılar
        //  byte boyunuz = 176;  // 176,5 cm byte aralığının dışında
        short boyunuz = 176; // 176 short aralığının İçinde


        //arabanizinDegeri: 320000 TL
        //int = -2.147.483.648 ile 2.147.483.647 aralığındaki sayılar
        // short arabanizinDegeri = 320000; // 320000 short aralığının dışında
        int arabanizinDegeri = 320000; // int tamsayılar için tercih edilen veri türüdür

        //MerkezBankasiRezervi:2.250.948.194 //mesala :)
        //long= -9.223.372.036.8547.775.808 ile 9.223.372.036.854.775.808 aralığındaki sayılar
        //int MerkezBankasiRezervi:2250948194; // 2250948194 int aralığının dışında
        long MerkezBankasiRezervi = 2250948194l;
        //System.out.println("MerkezBankasiRezervi = " + MerkezBankasiRezervi);


        //suMiktari: 1.5 LT
        // float = Ondalık sayılar = -3.40282347*10³⁸ ile 3.4*10³⁸ arası (-3.4*10³⁸ ile 3.4*10³⁸)
        float suMiktari = 39222222222223222222233333222222222231.5f;

        //gezegeninAgirligi=7250948195784.7;
        //  double = Ondalık sayılar = -1.7*10³⁰⁸ ile 1.7*10³⁰⁸ arası
        double gezegeninAgirligi = 392222277772222223444222222233333222222222231.5;


        //ehliyetSinifiniz=B
        // char = Karakter türünde değerler alır.
        char ehliyetSinifiniz = 'B';      //A-z arası harf
        char liseKacinciSinifta = '2';    //1-4 arası sayı
        System.out.println("liseKacinciSinifta = " + liseKacinciSinifta);

        // #
        // char = diğer alfebelerde (Arabça vs.) olan harfler kullanılabilir.
        // Nasıl; rakamsal değer girilir ve karşılığında harf gösterir
        //https://www-ssec-wisc-edu.translate.goog/~tomw/java/unicode.html?_x_tr_sl=en&_x_tr_tl=tr&_x_tr_hl=tr&_x_tr_pto=sc
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;   //ch3 = 袸
        System.out.println("ch3 = " + ch3);

        char ch4 = 15000;   // ch4 = 㪘
        System.out.println("ch4 = " + ch4);

        char chr5 = 1951;     //chr5 = ޟ
        System.out.println("chr5 = " + chr5);

        char cinsiyet = 'E';

        char sinavSonucu = 'C';

        char evetHayir = 'H';
        System.out.println(evetHayir);

        //  char ch6 = 'AB';

        boolean calisiyormu = true;
        boolean evlimi = false;
        //boolean = sadece 2 değer alır. Bu değerler true veya false

        boolean sonuc = 100 > 300;

        System.out.println("calisiyormu = " + calisiyormu);
        System.out.println("evlimi = " + evlimi);
        System.out.println("sonuc = " + sonuc);


        String ad = "Cenk Tosun";
        String sehir = "Kayseri";
        String ulke = "Türkiye";

        // String name = "Cenk";

        System.out.println("AD = " + ad);
        System.out.println("ŞEHİR = " + sehir);

        String adiniz$ = "Caner";
        int num1 = 100;
        int num2 = 200;

        //int private = 300;

        double suMiktari_Sise = 1.5;
        //int suMiktari_Sise = 1.5;


    }
}
