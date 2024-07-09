package br.com.az;

public class Sistema {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente();
        System.out.println(gleyson.limiteCredito);
        gleyson.solicitarLimiteCredito(200.0);
        System.out.println(gleyson.limiteCredito);
    }
}
