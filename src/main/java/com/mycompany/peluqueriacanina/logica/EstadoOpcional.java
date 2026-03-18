package com.mycompany.peluqueriacanina.logica;

public enum EstadoOpcional {
    SI("SI"),
    NO("NO"),
    VACIO("-"); // representa "-"
    
    private final String valor;

    EstadoOpcional(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
