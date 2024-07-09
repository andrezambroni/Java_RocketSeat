package br.com.az;

public class Cliente {
    String nome;
    Double limiteCredito = 10.0;

    public void solicitarLimiteCredito(Double valorSolicitado){
        limiteCredito = valorSolicitado;
    }

    public void comprar(Double valorProduto){
        limiteCredito =  limiteCredito - valorProduto;
    }
}
