import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Contabanco{
    public static void main(String[] args) {
        Double saldo=23.32;

        List<String> listaNome = new ArrayList<>();
        List<Integer> listaSenha = new ArrayList<>();

        Scanner cadastroNome = new Scanner(System.in);
        Scanner cadastroSenha = new Scanner(System.in);
        Scanner agencia=new Scanner(System.in);

        System.out.println("Criação do seu login\nDigite o seu nome:");
        String login = cadastroNome.next();
        listaNome.add(login);

        System.out.println("\nDigite a sua senha (apenas números):");
        int senha = cadastroSenha.nextInt();
        listaSenha.add(senha);

        System.out.println("Digite o número da sua agencia");
        String agenciaNumero=agencia.next();

        //-------------------------------------------------------------
        Scanner confirmarSenha = new Scanner(System.in);
        Scanner confirmarLogin = new Scanner(System.in);

        System.out.println("\nBem vindo ao seu Login\nDigite o seu Nome");
        String verificaLogin = confirmarLogin.next();
        if (verificaLogin.equals(login)) {
            System.out.println("Nome autorizado");
        } else {
            System.out.println("Login Negado");
        }

        System.out.println("Digite a sua senha:");
        String verificarSenha = confirmarSenha.next();
        if (verificarSenha.equals(senha)) {
            System.out.println("Bem vindo novamente " + login);
        }
        else {
            System.out.println("Senha negada");
        }

        System.out.println("Seu número da agencia: "+agenciaNumero);
        System.out.println("Seu nome"+login);
        System.out.println("Seu saldo é de: R$"+saldo);

    }
}
