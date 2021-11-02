package modelo;

import java.util.List;

public class Usuario {
    private String nome;
    private String senha;
    private int idade;
    private String curso;
    private int periodo;
    private List<String> gostos;
    private String sobreMim;

    public Usuario(String nome, String senha, int idade, String curso, int periodo, List<String> gostos, String sobreMim) {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.curso = curso;
        this.periodo = periodo;
        this.gostos = gostos;
        this.sobreMim = sobreMim;
    }

    public String cadastrar(Usuario usuario) {
        return "";
    }

    public String logar(String nome, String senha) {
        return "";
    }

    public Usuario verMeuPerfil(Usuario usuario) {
        return usuario;
    }

    public Usuario editarPerfil(Usuario usuario) {
        return usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public List<String> getGostos() {
        return gostos;
    }

    public void setGostos(List<String> gostos) {
        this.gostos = gostos;
    }

    public String getSobreMim() {
        return sobreMim;
    }

    public void setSobreMim(String sobreMim) {
        this.sobreMim = sobreMim;
    }
}