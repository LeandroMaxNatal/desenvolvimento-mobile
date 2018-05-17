package com.example.androidbti.provamobile;

/**
 * Created by android.bti on 15/05/18.
 */

public class Contato {
    private String nome;
    private String email;
    private String telefone;

    // essa porra nao funciona porque?
    public static final Contato[] contatos = {
        new Contato("contato 1", "contato1@gmail.com","9999-1111"),
        new Contato("contato 2", "contato2@gmail.com","9999-2222"),
        new Contato("contato 3", "contato3@gmail.com","9999-3333"),
        new Contato("contato 4", "contato4@gmail.com","9999-4444"),
        new Contato("contato 5", "contato5@gmail.com","9999-5555")
    };

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

    public String toString() {
        return this.nome;
    }
}
