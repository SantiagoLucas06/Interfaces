package Interfaces;

public class Caminhao implements ICarro{
    @java.lang.Override
    public void andar() {
        System.out.println("Carro está andando devagar");
    }

    @java.lang.Override
    public void parar() {
        System.out.println("Caminhão parando");
    }
}