import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Conta> transacao = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while(running){
            System.out.println("Digite a opcao desejada: "
            + "\n1 - Cadastrar Conta"
            + "\n2 - Saldo"
            + "\n3 - Saque"
            + "\n4 - Deposito"
            + "\n5 - Transferencia"
            + "\n6 - Sair");

            int opcao = Integer.parseInt(input.nextLine());
            switch (opcao) {
                case 1:
                    cadastrarConta(transacao);
                    break;
                case 2:
                    consultaSaldo(transacao);
                    break;
                case 3:
                    realizaSaque(transacao);
                    break;
                case 4:
                    realizaDeposito(transacao);
                    break;
                case 5:
                    realizaTransferencia(transacao);
                    break;            
                case 6:
                    running = false;
                    System.out.println("Obrigado por utilizar nossos servicos."
                    + "\nAte mais...");
                    break;
            }
        }
        input.close();
    }
}
