package modelo;

import controlador.Controlador;
import exception.ExcecaoCaracter;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String nome;
    private String senha;
    private int idade;
    private String curso;
    private int periodo;
    private List<String> listaDeGostos = new ArrayList<>();
    private String sobreMim;

    Controlador controlador = new Controlador();

    public Usuario(String nome, String senha, int idade, String curso, int periodo, List<String> gostos, String sobreMim) {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.curso = curso;
        this.periodo = periodo;
        this.listaDeGostos = gostos;
        this.sobreMim = sobreMim;
    }

    public Usuario() {
    }

    public String verMeuPerfil() {
        return "==========Meu perfil==========\n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Curso: " + curso + "\n" +
                "Período: " + periodo + "\n" +
                "Gostos: " + controlador.getListaDeGostosDaAplicacao().get((Integer.parseInt(listaDeGostos.get(0)) - 1)).substring(3, controlador.getListaDeGostosDaAplicacao().get((Integer.parseInt(listaDeGostos.get(0)) - 1)).length()) + " e " +
                controlador.getListaDeGostosDaAplicacao().get((Integer.parseInt(listaDeGostos.get(1)) - 1)).substring(3, controlador.getListaDeGostosDaAplicacao().get((Integer.parseInt(listaDeGostos.get(1)) - 1)).length()) + "\n" +
                "Sobre mim: " + sobreMim + "\n";
    }

    //public void excecoesCaracter(String nome, String curso) throws ExcecaoCaracter {
       // if(Character.isDigit(nome);
    //}

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
        return listaDeGostos;
    }

    public void setGostos(List<String> gostos) {
        this.listaDeGostos = gostos;
    }

    public String getSobreMim() {
        return sobreMim;
    }

    public void setSobreMim(String sobreMim) {
        this.sobreMim = sobreMim;
    }
}