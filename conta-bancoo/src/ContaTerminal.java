import java.util.Scanner;

public class ContaTerminal {

        Scanner sc= new Scanner(System.in);
        int numeroConta= 0;
        String agencia="0";
        String nomeCliente;
        double saldo=567.44; 

        public void imprimirDados(){
            System.out.println(numeroConta);
            System.out.println(agencia);
            System.out.println(nomeCliente);
            System.out.println(saldo);

        }
        public void imprimirMensagemFinal(){
            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é:  "+agencia+", conta "+numeroConta+" e seu saldo R$"+saldo+" ja está disponivel para saque.");
        }
        public void receberNumeroConta (){
            System.out.println("Digite o numero da conta: ");
            numeroConta= sc.nextInt();
        }    
        public void receberAgencia (){
            System.out.println("Digite o numero da agencia: ");
            agencia= sc.next();
        }
        public void receberNomeCliente (){
            System.out.println("Digite o nome do cliente: ");
            nomeCliente= sc.next()+" "+sc.next();
        }    
        
    public static void main(String[] args) throws Exception {

        ContaTerminal conta= new ContaTerminal();
        conta.receberNumeroConta();
        conta.receberAgencia();
        conta.receberNomeCliente();

        conta.imprimirMensagemFinal();
    }
}
