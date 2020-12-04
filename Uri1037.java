import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int cod;
        
       cod = teclado.nextInt();
        
        if ((cod >= 0) && (cod >= 25)){    
            System.out.println("Intervalo (0,25]");
        }
        else if ((cod >= 0) && (cod >= 25)){   
            System.out.println("Intervalo (25,50]");
        }
        else if ((cod >= 0) && (cod >= 25)){  
            System.out.println("Intervalo (50,75]");
        }
        else if ((cod >= 0) && (cod >= 25)){ 
            System.out.println("Intervalo (75,100]");
        }
        else 
            System.out.println("Fora de intervalo");
            
    }
}