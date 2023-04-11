import java.util.Scanner;
public class CalculatorWithOperators {
    static public void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Numbers n1 = new Numbers(0);
        Numbers n2 = new Numbers(0);
        Numbers result = new Numbers(0);
        int opc;
        String operacao;
        do {


            System.out.print("\nDigite o valor 1: ");
            n1.setValue(sc.nextDouble());

            System.out.print("\nDigite a operacao ( +,-,/,* ): ");
            operacao= sc.next();

            System.out.print("\nDigite o valor 2: ");
            n2.setValue(sc.nextDouble());
            result.setValue(n1.getValue() + n2.getValue());


            System.out.printf("A operacao do Valor 1 com Valor 2 e igual a: %.2f %n ",+  realizarCauculo(n1.getValue(), n2.getValue(), operacao));
            System.out.print("\nDeseja fazer outra operacao? (1)Sim or (2)Nao: ");
            opc = sc.nextInt();
        } while (opc == 1);
        sc.close();
    }

    public static Double realizarCauculo(Double n1, Double n2, String operacao) {
        Double respostaCalculo=0.0;
        switch (operacao) {
            case "+":
               respostaCalculo= n1 + n2;
               break;
            case "-":
                respostaCalculo= n1-n2;
                break;
            case "/":
                respostaCalculo= n1/n2;
                break;
            case "*":
                respostaCalculo= n1*n2;
                break;
            default:
                System.out.println("Operacao é invalida!");

        }
        return respostaCalculo;
    }
}