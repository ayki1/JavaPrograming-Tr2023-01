package d22_MultiDimensionalArrays;

public class MultiDemArrays {
    public static void main(String[] args) {

        String[][] ogrenciler=new String[2][4];
        ogrenciler[0][0]="Ahmet";
        ogrenciler[0][1]="Mert";
        ogrenciler[0][2]="Cemal";
        ogrenciler[0][3]="Cemal";

        ogrenciler[1][0]="Derya";
        ogrenciler[1][1]="Elif";
        ogrenciler[1][2]="Burak";
        ogrenciler[1][3]="Burak";

        for (int i = 0; i <= 1; i++) {
            System.out.println("--------------------------");
            for (int j = 0; j <= 3; j++) {
                System.out.println("ogrenciler = " + ogrenciler[i][j]);
            }
        }

        /*int[][][][] arr4D = {   {{{1,2,3}, {4,5,6}, {7,8,9}} ,{{10,20,30}, {40,50,60}, {70,80,90}}}    };
        //                                                  0

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int element : each1D) {
                        System.out.println(element);
                    }
                }
            }
        }*/

    }
}
