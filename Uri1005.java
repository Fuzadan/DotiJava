import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner teclado =new Scanner (System.in);

        Double A, B, media;

        A= teclado.nextDouble();
        B= teclado.nextDouble();

        media = A+B /2;

        System.out.printf("MEDIA = %.5f",  media);

    }

}