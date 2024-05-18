import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declaração de valor em conta
        double saldoConta = 1000.0;

        //Coleta de Dados do usuário

        System.out.println("Olá seja bem vindo ao Banco Nacional Java!");
        System.out.println("Digite seu nome logo abaixo:");
        String name = scanner.nextLine();
        System.out.println("Digite o número de sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o número de sua agência:");
        String agenciaBanco = scanner.nextLine();

        //Valor de saque solicitado

        System.out.println("O valor disponível para saque é de: " + saldoConta + " Digite o valor que deseja sacar abaixo:");
        double valorSaque = Double.parseDouble(scanner.nextLine());
        System.out.println("Olá " + name + ", " + "obrigado por criar uma conta em nosso banco, sua agência é: " + agenciaBanco + ", " + "conta: " + numeroConta + " e seu saldo de " + valorSaque + " á está disponível para saque.");

        //Validação de saque e finalização do programa

        System.out.println("[S] Para continuar e [N] Para finalizar");
        String respostaUser = scanner.nextLine();
        if (respostaUser.equalsIgnoreCase("S")) {
            double novoSaldo = saldoConta - valorSaque;
            System.out.println("Saque efetuado! seu novo saldo é: " + novoSaldo);
        } else if (respostaUser.equalsIgnoreCase("N")) {
            System.out.println("Programa Finalizado!");
        } else {
            System.out.println("Resposta inválida");
        }
        scanner.close();


    }

}
