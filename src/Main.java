import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println(" Dette program beregner x i en andengradsligning af typen: ax^2+bx+c");
        System.out.println("definer, a,b og c på hver sin linje:");

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        Beregner beregner= new Beregner(a,b,c); //Objekt

        System.out.println(beregner.beregnX() );


        System.out.println("her beregnes rumfanget af en kasse:");

        System.out.println("rumfanget er: " + beregner.rumfangAfKasse(5,3,5));

    }
}
