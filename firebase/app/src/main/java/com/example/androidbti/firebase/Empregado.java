package com.example.androidbti.firebase;

/**
 * Created by android.bti on 29/05/18.
 */

public class Empregado {
    private String cargo;
    private String email;
    private String nome;

    public Empregado() {
        // contrutor vazio
    }

    public Empregado(String cargo,String email, String nome) {
        this.cargo = cargo;
        this.email = email;
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
