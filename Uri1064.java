import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor;
        int qtdePositivos=0;
        
        for (int cont=1; cont<=6; cont++){
            valor = teclado.nextFloat();
            if (valor > 0){
                // System.out.println("Valor positivo");
                qtdePositivos++;
            }
        }
        System.out.println(qtdePositivos +" valores positivos");
    }
}