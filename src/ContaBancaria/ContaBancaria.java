package ContaBancaria;
import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(double saldo, String nome) {
        this.saldo = saldo;
        this.nome = nome;
    }

    public void ExibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
    }

    public static ContaBancaria CriarConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta:");
        String nome = scanner.nextLine();
        System.out.println("Digite o saldo inicial da conta:");
        double saldo = scanner.nextDouble();
        return new ContaBancaria(saldo, nome);
    }
    public void Depositar(double valor) {
        this.saldo += valor;
    }

    public void Sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
