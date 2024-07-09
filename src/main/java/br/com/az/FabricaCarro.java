package br.com.az;

public class FabricaCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro("branca", "fiat", "palio");
        Carro carro2 = new Carro("branca", "fiat", "uno");
        Carro carro3 = new Carro("branca", "fiat", "palio");
        Carro carro4 = new Carro("branca", "fiat", "palio");
        Carro carro5 = new Carro("branca", "fiat", "palio");

        //case01
        System.out.println(carro1 == carro2); //false

        //case02
        System.out.println(carro1.equals(carro2)); //true
        System.out.println(carro1.equals(carro3)); //true
        System.out.println(carro1.equals(carro4)); //true
        System.out.println(carro1.equals(carro5)); //true

        //case03
        Carro carro6 = carro1; // não é um novo carro, mas sim, uma referência a
        System.out.println(carro6 == carro1); //??
        System.out.println(carro6.equals(carro1)); //??

    }
}