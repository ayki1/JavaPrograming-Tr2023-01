package d13_String;

public class d01_Strings {
    public static void main(String[] args) {
        String cumle="Java kullanmayı seviyorum.";
        //String karakter dizisidir, yani char'lar içerir
        System.out.println("cumle = " + cumle);

        System.out.println("cumle.length()=karakter sayısı = " + cumle.length());
        System.out.println("cumle.charAt(5)=5.karakter nedir= " + cumle.charAt(5));
        System.out.println("cumle.concat()= ekleme yapar=" + cumle.concat(" Ya sen?"));

        //Cümle değişti mi?
        System.out.println("cumle = " + cumle);
        System.out.println("cumle.startsWith()=baslangıc J mi= " + cumle.startsWith("J"));
        System.out.println("cumle.startsWith()=baslangıc j mi= " + cumle.startsWith("j"));
        System.out.println("cumle.endsWith()=son . mı= " + cumle.endsWith("."));
        System.out.println("cumle.indexOf()=v dizin sırası= " + cumle.indexOf("v"));
        System.out.println("cumle.lastIndexOf()=k dizin sırası= " + cumle.lastIndexOf("a"));


    }
}
