package br.com.az.enums;

public enum EstadoBrasileiro {
    PIAUI("Piaui", "PI"),
    MARANHAO("Maranhao", "MA"),
    SAO_PAULO("São Paulo", "SP"),
    RIODEJANEIRO("Rio de Janeiro", "RJ"),
    CEARA("Ceara", "CE"),
    ;

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
