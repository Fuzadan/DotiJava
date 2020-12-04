import java.util.Scanner;
public class Uri1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod;
        

        cod = teclado.nextInt();
        

        Switch (cod){ 
            Case 61:   
            System.out.println("Brasilia");
            break;
        
            Case 71:   
            System.out.println("Salvador");
            break;

            Case 11: 
            System.out.println("Sao Paulo");
            break;

            Case 21:
            System.out.println("Rio de Janeiro");
            break;

            Case 32: 
            System.out.println("Juiz de Fora");
            break;

            Case 19:
            System.out.println("Campinas");
            break;

            Case 27:
            System.out.println("Vitoria");
            break;

            Case 31: 
            System.out.println("Belo Horizonte");
            break;

        } 
        System.out.println("DDD não cadastrado");    
    }
}