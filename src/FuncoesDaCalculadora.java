import java.util.Scanner;

public class FuncoesDaCalculadora {

    // funções do menu
    public String saudacoes(String nome) {
        return "Olá, " + nome + ", já tomou café hoje?";
    }

 
    public float soma(float x, float b) {
        return x + b;
    }

    public float subtracao(float x, float b) {
        return x - b;
    }

    public float multiplicacao(float x, float b) {
        return x * b;   
    }

    public float divisao(float x, float b) {
        if (b != 0) {
            return x / b;
        } else {
            System.err.println("Erro: Divisão por zero!");
            return 0;
        }
    }

    public float porcentagem(float x, float b) {
        return x * (b / 100);
    }
    // escolha do menu
    public void opcoes(int opcao, float x, float b) {
        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + soma(x, b));
                break;
            case 2:
                System.out.println("Resultado: " + subtracao(x, b));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicacao(x, b));
                break;
            case 4:
                System.out.println("Resultado: " + divisao(x, b));
                break;
            case 5:
                System.out.println("Resultado: " + porcentagem(x, b));
                break;
            case 6:
                System.out.println("Obrigado por usar nosso sistema.");
                break;
            default:
                System.err.println("Opção inválida! Escolha uma opção de 1 a 6.");
        }
    }

   
    // Menu
    public void menu() {
        System.out.println("Escolha a operação que deseja fazer:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Porcentagem");
        System.out.println("6 - Sair");
    }

    public static void main(String[] args) {
        FuncoesDaCalculadora calculadora = new FuncoesDaCalculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja Bem-Vindo à Calculadora em Java");
        System.out.print("Qual o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println(calculadora.saudacoes(nome));

        boolean continuar = true;
        while (continuar) {
            calculadora.menu();
            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 6) {
                continuar = false;
                calculadora.opcoes(opcao, 0, 0);
                break;
            }

            System.out.print("Digite o primeiro número: ");
            float x = scanner.nextFloat();
            System.out.print("Digite o segundo número: ");
            float b = scanner.nextFloat();

            calculadora.opcoes(opcao, x, b);
            System.out.println();
        }

        scanner.close();
    }
}
