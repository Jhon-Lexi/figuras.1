package Figuras;

public class main {
    public static void main(String[] args) {
        Figura fig = new Figura();
        fig.nombre = "cuadrado";
        fig.lados = 4;
        fig.altura = 4.5;
        fig.base = 4.5;
        fig.tipo();
        Figura fig2 = new Figura();
        fig2.nombre = "triangulo";
        fig2.lados = 3;
        fig2.altura = 7.8;
        fig2.base = 3;
        fig2.tipo();
    }
}
