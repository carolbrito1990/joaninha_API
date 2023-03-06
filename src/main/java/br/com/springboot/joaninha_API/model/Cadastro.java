package br.com.springboot.joaninha_API.model;

import java.util.ArrayList;

public class Cadastro {
    private int id;
    private String email;
    private String dataCadastro;
    private boolean isCupomUsado;
    private ArrayList<String> newsletters;

    public Cadastro(int id, String email, String dataCadastro, boolean isCupomUsado, ArrayList<String> newsletters) {
        this.id = id;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.isCupomUsado = isCupomUsado;
        this.newsletters = newsletters;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean getCupomUsado() {
        return isCupomUsado;
    }

    public void setCupomUsado(boolean cupomUsado) {
        isCupomUsado = cupomUsado;
    }

    public ArrayList<String> getNewsletters() {
        return newsletters;
    }

    public void setNewsletters(ArrayList<String> newsletters) {
        this.newsletters = newsletters;
    }
}
