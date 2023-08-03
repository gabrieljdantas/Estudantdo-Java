package aula0308;

import java.time.LocalDate;

public class Cliente {

    // get (obter) e set (inserir) ENCAPSULAMENTO

    private String nome;
    private Integer idade;
    private Double altura;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean validarCpf() {
        return cpf.contains(".");
    }

    public static boolean validarEmail(String email) {
        return email.contains("@");
    }
}