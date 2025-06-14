import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
    int numero1= 0; 
    int numero2= 0;
    do{ 
        System.out.println("Digite dois numeros inteiros: (o primeiro numero deve ser menor que o segundo)");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        try {
           for (int contador=1; contador <= ValidadorDeParametros(numero1, numero2); contador++){
             System.out.println("contando... "+ contador);
           }
           
         } catch (ParametrosInvalidosException e) {
             System.out.println("ERRO! O primeiro numero deve ser menor que o segundo!");
           }
          
    } while (numero1>numero2);
    
        
    }
    static int ValidadorDeParametros(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }
        return parametro2-parametro1;

    }
}
