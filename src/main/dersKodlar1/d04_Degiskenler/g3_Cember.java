package d04_Degiskenler;

public class g3_Cember {
    public static void main(String[] args) {
/*    3. Cember adında bir sınıf oluşturun, verilen herhangi bir
        Çember'in alanını ve çevresini hesaplayabilen bir program yazın.

        Pi sayısı, yarıçap, çap, alan, çevre

        İpuçları: PI = 3.14
        yaricap = 5.5;

        alan = yarıçap * yarıçap * PI
        Çevre = 2 * yarıçap * PI
                */

        double yaricap = 5.5;

        double PI = 3.14;

        double cap = yaricap * 2;  // yarıçapı 2 ile çarparak çapı bulur
        double alan = yaricap * yaricap * PI; // dairenin alanını bulur
        double cevre = cap * PI;  // dairenin çevresini bulur

        System.out.println("yarıçap = " + yaricap);
        System.out.println("çap = " + cap);
        System.out.println("alan = " + alan);
        System.out.println("çevre = " + cevre);


    }


}