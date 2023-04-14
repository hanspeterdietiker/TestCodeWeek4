package AlturaLargaRetangulo;

import java.util.Scanner;

public class AlturaLarguraRetanguloAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlturaLarguraRetangulo user = new AlturaLarguraRetangulo();
        System.out.println("**********************************");
        System.out.print("Informe a largura do retangulo: ");
        user.setLargura(sc.nextDouble());

        System.out.print("Informe a altura do retangulo: ");
        user.setAltura(sc.nextDouble());

        System.out.println("\nÁrea do retangulo: " + user.area());
        System.out.println("Perimetro: " + user.perimetro());
        System.out.println("Diagonal: " + user.diagonal());

        System.out.println("**********************************");
        sc.close();
    }
}