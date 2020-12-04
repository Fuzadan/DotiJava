import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado =new Scanner (System.in);

        int ndias,A, mes, dias;

        ndias = teclado.nextInt();
        

        A = ndias /365;
        mes = (ndias %365/30); 
        dias = (ndias %365%30);
        

        System.out.println(A + " Ano(s)");
        System.out.println(mes + " Mes(es)");
        System.out.println(dias + " Dia(s)");

    }

}