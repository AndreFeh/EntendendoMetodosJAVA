package Aula3;

public class Main {

    public static void main(String[] args){

        double areaQuadrado = Quadrilatero.quadrilatero(3);
        System.out.println("A Área do Quadrado é: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.quadrilatero(5,9);
        System.out.println("\n A Área do Retagulo é: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.quadrilatero(8,9,7);
        System.out.println("\n A Área do Trapézio é: " + areaTrapezio);

    }
}
