package br.com.az.enums;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        String nomeString = "sao_paulo";
        EstadoBrasileiro eb = EstadoBrasileiro.valueOf("SAO_PAULO");
        System.out.println(eb.getNome());
        System.out.println(eb.name());
        System.out.println(eb.getSigla());

        for(EstadoBrasileiro ebb: EstadoBrasileiro.values()){
            System.out.println("Estado Localizado");
            System.out.println(ebb.getNome());
            System.out.println(ebb.name());
            System.out.println(ebb.getSigla());
        }
    }
}
