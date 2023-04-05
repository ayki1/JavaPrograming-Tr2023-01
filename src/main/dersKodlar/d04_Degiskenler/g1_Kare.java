package d04_Degiskenler;

public class g1_Kare {
    public static void main(String[] args) {
/* 1. Kare adında bir sınıf oluşturun, herhangi bir karenin alanını ve
        çevresini hesaplayan bir program yazın.

                alan = kenar * kenar;
                çevre = 4 * kenar

                */

        //DataType variableName = Data;

        double kenar = 8.5;

        double alan = kenar * kenar;
        double cevre = kenar * 4;

        System.out.println("kenar = " + kenar);
        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);

    }
}
