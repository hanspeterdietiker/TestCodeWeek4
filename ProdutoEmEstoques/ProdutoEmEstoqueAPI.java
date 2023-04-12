package ProdutoEmEstoques;
import ProdutoEmEstoques.ProdutoEmEstoque;
import java.util.Scanner;

public class ProdutoEmEstoqueAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoEmEstoque produto = new ProdutoEmEstoque();
        int opc;
        do {
            System.out.println("*************************************************");
            System.out.print("Informe os dados do produto: ");

            System.out.printf("\nNome: ");
            produto.setNome(sc.next());

            System.out.printf("Preço: ");
            produto.setValor(sc.nextFloat());

            System.out.printf("Quantidade em Estoque: ");
            produto.setQuantidade(sc.nextInt());


            System.out.printf("%nTotal do preço com a quantidade e igual a R$: %.2f", +produto.getTotal(produto.getValor(), produto.getQuantidade()));

            System.out.printf("\nInforme o número de produtos a serem adcionados no estoque: ");
            produto.setAdcEstoque(sc.nextInt());


            System.out.printf("Estoque Atualizado: %d ", +produto.getAttAdcEstoque(produto.getQuantidade(), produto.getAdcEstoque()));


            System.out.printf("\nInforme o número de produtos a serem removidos no estoque: ");
            produto.setDelEstoque(sc.nextInt());

            System.out.printf("Estoque Atualizado: %d ", +produto.getAttDelAdcEstoque(produto.getDelEstoque(), produto.getAttAdcEstoque(produto.getQuantidade(), produto.getAdcEstoque())));
            System.out.println("\n*************************************************");

            System.out.println("Gostaria de repetir alguma transação? (1)Sim or (2)Não ");
            opc = sc.nextInt();
        } while (opc == 1);
        sc.close();
    }
}