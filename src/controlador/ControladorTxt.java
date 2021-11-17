package controlador;
import modelo.UsuariaMulher;
import modelo.Usuario;
import modelo.UsuarioHomem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ControladorTxt{

    public static void ControladorTxt(String conteudo, String nomeArquivo) {
        try {
            Writer bw;
            bw = new BufferedWriter(new FileWriter(nomeArquivo, true));
            bw.write(conteudo + "\n");
            bw.close();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static Usuario login(String nome, String senha) throws Exception {
        Usuario usuarioLogado = null;
        String linha;

        BufferedReader leArquivoFem = new BufferedReader(
                new InputStreamReader(new FileInputStream("C:\\Windows\\Temp\\perfisFem.txt"), "UTF-8"));
        BufferedReader leArquivoMasc = new BufferedReader(
                new InputStreamReader(new FileInputStream("C:\\Windows\\Temp\\perfisMasc.txt"), "UTF-8"));

        while ((linha = leArquivoFem.readLine()) != null) {
            String [] logins = linha.split(";");
            if(nome.equals(logins[0]) && senha.equals(logins[1])) {
                usuarioLogado = recebeDadosDoUsuario(logins, 'F');
                System.out.println("Logado com sucesso!");
                return usuarioLogado;
            }
        }
        while ((linha = leArquivoMasc.readLine()) != null) {
            String [] logins = linha.split(";");
            if(nome.equals(logins[0]) && senha.equals(logins[1])) {
                usuarioLogado = recebeDadosDoUsuario(logins, 'M');
                System.out.println("Logado com sucesso!");
                return usuarioLogado;
            }
        }
        System.out.println("Login ou senha incorretos.");
        leArquivoFem.close();
        leArquivoMasc.close();
        return null;
    }

    private static Usuario recebeDadosDoUsuario(String[] logins, char sexo) {
        List<String> gostos = new ArrayList<>();
        gostos.add(logins[5]);
        gostos.add(logins[6]);

        if (sexo == 'F') {
            Usuario usuariaMulher = new UsuariaMulher(logins[0], logins[1], Integer.parseInt(logins[2]), logins[3], Integer.parseInt(logins[4]),
                    gostos, logins[6]);
            return usuariaMulher;
        }
        else {
            Usuario usuarioHomem = new UsuarioHomem(logins[0], logins[1], Integer.parseInt(logins[2]), logins[3], Integer.parseInt(logins[4]),
                    gostos, logins[6]);
            return usuarioHomem;
        }
    }
}

