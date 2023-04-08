package d14_String2;

public class d1_String2 {
    public static void main(String[] args) {
        String cumle="Yazılım testi 3 gruptur.";
        System.out.println("cumle = " + cumle);

        //replace()=değiştir
        System.out.println("replace()=değiştir= " + cumle.replace(" ","_"));
        System.out.println("substring()=kesme = " + cumle.substring(2));
        System.out.println("substring()=5-15 kesme = " + cumle.substring(5,15));
        System.out.println("toLowerCase()=kücük harf = " + cumle.toLowerCase());
        System.out.println("toUpperCase()=BÜYÜK harf = " + cumle.toUpperCase());

        String replace_Cumle=cumle.replace(" ","_");
        System.out.println("replace li Cumle = " + replace_Cumle);

        String cumle2="     Manuel test kolaydır.   ";
        System.out.println("cumle2 = " + cumle2);
        System.out.println("trim()=boşlukları siler= " + cumle2.trim());

    }
}
