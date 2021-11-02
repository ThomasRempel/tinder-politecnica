package controlador;

import modelo.Usuario;

import java.util.List;

public class Controlador {

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
