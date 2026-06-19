package model;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String dataNascimento;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = "";
        this.dataNascimento = "";
    }

    public Pessoa(String nome, String cpf, String telefone, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }
