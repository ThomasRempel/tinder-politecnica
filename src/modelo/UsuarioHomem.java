package modelo;

import java.util.List;

public class UsuarioHomem extends Usuario {
    public UsuarioHomem(String nome, String senha, int idade, String curso, int periodo, List<String> gostos, String sobreMim) {
        super(nome, senha, idade, curso, periodo, gostos, sobreMim);
    }
}
