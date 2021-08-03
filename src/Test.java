import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int mat,kimya,fizik,tarih,turkce,muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu yaz:");
         mat = input.nextInt();

        System.out.print("Kimya notunu yaz:");
         kimya = input.nextInt();

        System.out.print("Fizik notunu yaz:");
         fizik = input.nextInt();

        System.out.print("Tarih notunu yaz:");
         tarih = input.nextInt();

        System.out.print("Türkce notunu yaz:");
         turkce = input.nextInt();

        System.out.print("Müzik notunu yaz:");
         muzik = input.nextInt();

        System.out.print("Ortalaman:");
        double ort = (mat + kimya + fizik + tarih + turkce + muzik)/6.0;

        System.out.println(ort);

    }
}
