package d04_Degiskenler;

public class MaasHesaplama {
    public static void main(String[] args) {


        // saatlik ücret, haftalık çalışma süresi

        int saatlikUcret = 65;
        int haftalikCalismaSuresi  = 45;
        int haftaSayisi = 52;

        int maas = saatlikUcret * haftalikCalismaSuresi * haftaSayisi;
        int aylikMaas=maas/12;

        // System.out.println(salary);
        System.out.println("saatlikUcret = " + saatlikUcret+" TL");
        System.out.println("haftalıkCalismaSuresi = " + haftalikCalismaSuresi);
        System.out.println("haftaSayisi = " + haftaSayisi);
        System.out.println("Yıllık Maas = " + maas +" TL");
        System.err.println("AylikMaas = " + aylikMaas);

    }
}
