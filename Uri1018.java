import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado =new Scanner (System.in);

        int valor, cem, cinq, vint, dez,cinco,dois,um;

        valor = teclado.nextInt();
        

        cem = valor /100;
        cinq = (valor %100 /50); 
        vint = (valor %100%50/20);
        dez = (valor %100%50%20/10);
        cinco = (valor %100%50%20%10/5);
        dois = (valor %100%50%20%10%5/2);
        um = (valor %100%50%20%10%5%2/1);
        

        System.out.println(valor);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinq + " nota(s) de R$ 50,00");
        System.out.println(vint + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

    }

}