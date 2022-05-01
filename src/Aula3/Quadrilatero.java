package Aula3;

public class Quadrilatero {

    public static double quadrilatero(double lado){ // retorna Double
        return lado * lado;
    }

    public static double quadrilatero(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double quadrilatero(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor) * altura) / 2;
    }

}
