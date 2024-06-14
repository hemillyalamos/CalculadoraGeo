import espaciais.*;
import planas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "█▀▀ █▀▀█ █░░ █▀▀ █░░█ █░░ █▀▀█ █▀▀▄ █▀▀█ █▀▀█ █▀▀█ 　 \n" +
                "█░░ █▄▄█ █░░ █░░ █░░█ █░░ █▄▄█ █░░█ █░░█ █▄▄▀ █▄▄█ 　 \n" +
                "▀▀▀ ▀░░▀ ▀▀▀ ▀▀▀ ░▀▀▀ ▀▀▀ ▀░░▀ ▀▀▀░ ▀▀▀▀ ▀░▀▀ ▀░░▀ 　 \n" +
                "█▀▀▀ █▀▀ █▀▀█ █▀▄▀█ █▀▀ ▀▀█▀▀ █▀▀█ ░▀░ █▀▀ █▀▀█ \n" +
                "█░▀█ █▀▀ █░░█ █░▀░█ █▀▀ ░░█░░ █▄▄▀ ▀█▀ █░░ █▄▄█ \n" +
                "▀▀▀▀ ▀▀▀ ▀▀▀▀ ▀░░░▀ ▀▀▀ ░░▀░░ ▀░▀▀ ▀▀▀ ▀▀▀ ▀░░▀ \n"
        );
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite um número para definir letra maiuscula ou minuscula: ");
        int formato = scanner.nextInt();
        System.out.println("Seja bem-vindo(a) " + nome + "!");

        System.out.println(
                "█▀▄▀█ █▀▀ █▀▀▄ █  █ \n" +
                "█ ▀ █ █▀▀ █  █ █  █ \n" +
                "▀   ▀ ▀▀▀ ▀  ▀  ▀▀ \n");

        while (true){
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Figuras Planas");
            System.out.println("2- Figuras Especiais");
            System.out.println("3- Sair");

        int escolha = scanner.nextInt();
            if (escolha == 3) {
                System.out.println("Obrigado por jogar " +nome);
                break;
            }
              switch (escolha) {
                  case 1:
                      System.out.println("Escolha uma figura plana:");
                      System.out.println("1-Quadrado");
                      System.out.println("2-Retângulo");
                      System.out.println("3-Triângulo Equilátero");
                      System.out.println("5-Circulo");
                      System.out.println("6-Hexágono Regular");
                      int opc = scanner.nextInt();

                      switch (opc){
                          case 1:
                              System.out.println("\nDigite tamanho do lado: \n");
                              double ladoQuadrado = scanner.nextDouble();
                              Quadrado quadrado = new Quadrado(ladoQuadrado);
                              quadrado.informaCalculo(formato);
                          case 2:
                              System.out.println("\nDigite o tamanho da altura: \n");
                              double alturaRetangulo = scanner.nextDouble();
                              System.out.println("\nDigite a base do Retângulo: \n");
                              double baseRetangulo = scanner.nextDouble();
                              Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);
                              retangulo.informaCalculo(formato);

                          case 3:
                              System.out.println("\nDigite o tamanho do lado:\n");
                              double ladoTriangulo = scanner.nextDouble();
                              Triangulo triangulo = new Triangulo(ladoTriangulo);
                              triangulo.informaCalculo(formato);

                          case 4:
                              System.out.println("\nDigite o tamanho do raio: \n");
                              double raioCirculo = scanner.nextDouble();
                              Circulo circulo = new Circulo(raioCirculo);
                              circulo.informaCalculo(formato);

                          case 5:
                              System.out.println("\nDigite o  tamanho de cada lado: \n");
                              double ladoHexagono = scanner.nextDouble();
                              Hexagono hexagono = new Hexagono(ladoHexagono);
                              hexagono.informaCalculo(formato);

                      }

              break;

                    case 2:
                        System.out.println("Escolha uma figura especial: ");
                        System.out.println("1-Cubo");
                        System.out.println("2-Paralelepípedo");
                        System.out.println("3-Esfera");
                        System.out.println("4-Pirâmide de Base Quadrada");
                        System.out.println("5-Cilindro");
                        System.out.println("6-Cone");
                        int opc2 = scanner.nextInt();


                        switch (opc2) {
                            case 1:
                                System.out.println("\nDigite o tamanho do lado: \n");
                                double ladoCubo = scanner.nextDouble();
                                Cubo cubo = new Cubo(ladoCubo);
                                cubo.informaCalculo(formato);

                            case 2:
                                System.out.println("\nDigite o tamanhoo do comprimento:\n ");
                                double comprimentoParalelepipedo = scanner.nextDouble();
                                System.out.println("\nDigite o tamanho da altura: \n");
                                double alturaParalelepipedo = scanner.nextDouble();
                                System.out.println("\nDigite o tamanho da largura: \n");
                                double larguraParalelepipedo = scanner.nextDouble();
                                Paralelepipedo paralelepipedo = new Paralelepipedo(comprimentoParalelepipedo, alturaParalelepipedo, larguraParalelepipedo);
                                paralelepipedo.informaCalculo(formato);

                            case 3:
                                System.out.println("\nDigite o tamanho do raio: \n");
                                double raioEsfera = scanner.nextDouble();
                                Esfera esfera = new Esfera(raioEsfera);
                                esfera.informaCalculo(formato);

                            case 4:
                                System.out.println("\nDigite o tamanho da arresta da base da pirâmide:\n  ");
                                double arestaPiramide = scanner.nextDouble();
                                System.out.println("\nDigite o tamanho do apotema: \n");
                                double apotemaPiramide = scanner.nextDouble();
                                System.out.println("\nDigite o tamanho da altura: \n");
                                double alturaPiramide = scanner.nextDouble();
                                Piramide piramide = new Piramide(arestaPiramide, apotemaPiramide, alturaPiramide);
                                piramide.informaCalculo(formato);

                            case 5:
                                System.out.println("\nDigite o tamanho da altura: \n");
                                double alturaCilindro = scanner.nextDouble();
                                System.out.println("\nDigite  o tamanho do raio: \n");
                                double raioCilindro = scanner.nextDouble();
                                Cilindro cilindro = new Cilindro(alturaCilindro, raioCilindro);
                                cilindro.informaCalculo(formato);

                            case 6:
                                System.out.println("\nDigite o tamanho do raio: \n");
                                double raioCone = scanner.nextDouble();
                                System.out.println("\nDigite a altura:\n ");
                                double alturaCone = scanner.nextDouble();
                                Cone cone = new Cone(raioCone, alturaCone);
                        }

                break;

                    default:
                        System.out.println("Opção invalida");
                }
        }
    }
}