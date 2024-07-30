import java.util.Scanner;
import ContaBancaria.ContaBancaria;
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = ContaBancaria.CriarConta();
        conta.ExibirInformacoes();
        System.out.println("Digite o valor a ser depositado:");
        double valor = scanner.nextDouble();
        conta.Depositar(valor);
        conta.ExibirInformacoes();
        System.out.println("Digite o valor a ser sacado:");
        valor = scanner.nextDouble();
        conta.Sacar(valor);
        conta.ExibirInformacoes();


    }


}