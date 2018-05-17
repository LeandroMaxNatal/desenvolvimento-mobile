package com.example.androidbti.provamobile;

/**
 * Created by android.bti on 15/05/18.
 */

public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
