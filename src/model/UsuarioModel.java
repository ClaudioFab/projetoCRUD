package model;

import java.util.Date;

public class UsuarioModel {
    private int idusuario;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private int idade;
    private Date nascimento;
}



/*
    idusuario int auto_increment primary key,
    nome varchar(200) NOT NULL,
    cpf varchar(14) NOT NULL unique,
    email varchar(150) NOT NULL,
    telefone varchar(150) NOT NULL,
    idade int NOT NULL,
    nascimento date NOT NULL
*/