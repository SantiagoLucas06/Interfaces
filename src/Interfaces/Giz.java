package Interfaces;

public class Giz implements ICaneta{
    @java.lang.Override
    public void escrever(java.lang.String texto) {
        System.out.println("Escrevendo o valor" + texto + " na classe " + getClass().getSimpleName());
    }

    @java.lang.Override
    public java.lang.String getCor() {
        return "Branco";
    }
}
