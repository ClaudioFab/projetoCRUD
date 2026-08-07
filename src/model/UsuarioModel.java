package model;

import java.sql.Date;

public class UsuarioModel {

    private int idusuario;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Date nascimento;

    //Getter-------------------------------------------------
    public int getIdusuario() {
        return idusuario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    //Setter-------------------------------------------------
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

}









/*
    idusuario int auto_increment primary key,
    nome varchar(200) NOT NULL,
    cpf varchar(14) NOT NULL unique,
    email varchar(150) NOT NULL,
    telefone varchar(150) NOT NULL,
    nascimento date NOT NULL
*/
