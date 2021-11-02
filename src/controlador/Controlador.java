package controlador;

import modelo.Usuario;
import principal.UI;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    //inicia a lista de gostos para perguntar para o usuario
    private List<String> listaDeGostosDaAplicacao = new ArrayList<>();

    UI ui = new UI();

    //tudo o que iniciar por primeiro deve estar neste método
    public void iniciaConfiguracoes() {
        ui.iniciaAplicacao();
        adicionarGostos();
    }

    public void adicionarGostos() {
        this.listaDeGostosDaAplicacao.add("1- Cozinhar");
        this.listaDeGostosDaAplicacao.add("2- Música");
        this.listaDeGostosDaAplicacao.add("3- Animais");
        this.listaDeGostosDaAplicacao.add("4- Livros");
        this.listaDeGostosDaAplicacao.add("5- Esportes");
        this.listaDeGostosDaAplicacao.add("6- Filmes e séries");
    }


    public String cadastrar(String nome, String senha, int idade, String curso, int periodo, List<String> gostos, String sobreMim) {
        Usuario usuario = new Usuario(nome, senha, idade, curso, periodo, gostos, sobreMim);
        return "Logou com sucesso!";
    }

    public List<Usuario> buscarPretendenteAleatoria() {
        return null;
    }

    public List<Usuario> buscarPretendenteEspecifico() {
        return null;
    }

    public void darMatch() {

    }

}
