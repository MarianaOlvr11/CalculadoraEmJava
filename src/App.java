import java.util.Scanner;
import calculadora.Operacoes;
import calculadora.Operacoes2;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();
        Operacoes2 operacoes2 = new Operacoes2();

        int operador = 34;
        while (operador != 0) {
            System.out.println("\nEscolha qual operação deseja fazer:\n 1.Adição\n 2.Subtração\n 3.Divisão\n 4.Multiplicação\n 5.Fatorial\n 6. Porcentagem de N2 por N1\n Digite 0 para sair do programa");
            operador = sc.nextInt();
            if (operador == 0) {
                break;
            }

            if (operador == 5){
                System.out.print("\nInsira o numero que será fatorado: ");
                operacoes2.num1 = sc.nextInt();
                System.out.println("Resultado da fatoração: "+ operacoes2.fatorar());

            } else {
            System.out.println("Digite o primeiro número: ");
            operacoes.n1 = sc.nextDouble();
            System.out.println("Digite o segundo número: ");
            operacoes.n2 = sc.nextDouble();

            switch (operador) {
                case 1:
                    System.out.println("\nResultado da Adição: " + operacoes.n1 + " + " + operacoes.n2 + "= " +
                            operacoes.somar());
                    break;

                case 2:
                    System.out.println("\nResultado da Subtração: " + operacoes.n1 + " - " + operacoes.n2 + "= " +
                            operacoes.subtracao());
                    break;

                case 3:
                    System.out.println("\nResultado da Divisão: " + operacoes.n1 + " ÷ " + operacoes.n2 + "= " +
                            operacoes.dividir());
                    break;

                case 4:
                    System.out.println("\nResultado da Multiplicação: " + operacoes.n1 + " x " + operacoes.n2 + "= " +
                            operacoes.multiplicar());
                    break;

                case 6:
                    System.out.println("\nResultado da Porcentagem: " + operacoes.n2 + "% de " + operacoes.n1 + "= " +
                            operacoes.porde1num());
                    break;
                

                default:
                    break;
            }
        }

        }
        sc.close();
    }
}
