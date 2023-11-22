import java.util.Scanner;
public class odev3 {
    public static void main(String[] args) {
        double Km ,tutar,herKm = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("kilometreyi giriniz : ");
        Km = input.nextDouble();

        if(Km>=4.5454545455) {
            tutar = 10 + (Km * herKm);
            System.out.print("Tutar : " + tutar);
        }
        else {
            tutar = 20;
            System.out.print("Tutar : " + tutar);

        }



    }

}
