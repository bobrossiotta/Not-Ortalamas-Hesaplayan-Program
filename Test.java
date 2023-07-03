
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
    // değişkenler
        int mat,fizik,kimya,tr,tarih,music;
        Scanner bob = new Scanner(System.in);
    // değerler
        System.out.print("Matematik:");
        mat = bob.nextInt();

        System.out.print("fizik:");
        fizik = bob.nextInt();

        System.out.print("Kimya:");
        kimya = bob.nextInt();

        System.out.print("Türkçe:");
        tr = bob.nextInt();

        System.out.print("Tarih:");
        tarih = bob.nextInt();

        System.out.print("Müzik:");
        music = bob.nextInt();

        int total = (mat+fizik+kimya+tr+tarih+music);
        double result = total/6.0 ;

        String info = result >= 60 ? "Başarılı" : "Kaldınız";
        System.out.println("Ortalamanız:" + result);
        System.out.println(info);
    } }