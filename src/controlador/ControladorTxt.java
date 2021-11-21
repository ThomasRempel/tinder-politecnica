package controlador;

import modelo.UsuariaMulher;
import modelo.Usuario;
import modelo.UsuarioHomem;
import principal.UI;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ControladorTxt {
    private static Controlador controlador;
    UI ui = new UI();


    public static void ControladorTxt(String conteudo, String nomeArquivo) {
        try {
            Writer bw;
            bw = new BufferedWriter(new FileWriter(nomeArquivo, true));
            bw.write("\n" + conteudo);
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
            String[] logins = linha.split(";");
            if (nome.equals(logins[0]) && senha.equals(logins[1])) {
                usuarioLogado = recebeDadosDoUsuario(logins, 'F');
                return usuarioLogado;
            }
        }
        while ((linha = leArquivoMasc.readLine()) != null) {
            String[] logins = linha.split(";");
            if (nome.equals(logins[0]) && senha.equals(logins[1])) {
                usuarioLogado = recebeDadosDoUsuario(logins, 'M');
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
                    gostos, logins[7]);
            return usuariaMulher;
        } else {
            Usuario usuarioHomem = new UsuarioHomem(logins[0], logins[1], Integer.parseInt(logins[2]), logins[3], Integer.parseInt(logins[4]),
                    gostos, logins[7]);
            return usuarioHomem;
        }
    }

    public static void buscarPretendente(List<String> listaDeGostosUsuarioPrincipal) {
        controlador = new Controlador();
        String linha;
        boolean deuMatch = false;
        String sexo = controlador.perguntaPreferencia();

        if (sexo.toLowerCase().equals("h")) {
            try {
                //varre a lista
                for (String gosto : listaDeGostosUsuarioPrincipal) {
                    BufferedReader leArquivoMasc = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Windows\\Temp\\perfisMasc.txt"), "UTF-8"));
                    while ((linha = leArquivoMasc.readLine()) != null) {
                        if (deuMatch == false) {
                            String[] bot = linha.split(";");
                            if (((listaDeGostosUsuarioPrincipal.get(0).equals(bot[5]) || (listaDeGostosUsuarioPrincipal.get(0).equals(bot[6])))
                                    || (listaDeGostosUsuarioPrincipal.get(1).equals(bot[6]) || listaDeGostosUsuarioPrincipal.get(1).equals(bot[5])))) {
                                System.out.println(bot[0] + " ; " + bot[2] + " ; " + bot[3] + " ; " + bot[4] + " ; " + "Gostos: " + controlador.getListaDeGostosDaAplicacao().get(Integer.parseInt(bot[5]) - 1).substring(3,
                                        controlador.getListaDeGostosDaAplicacao().get(Integer.parseInt(bot[5]) - 1).length()) + " , " +
                                        controlador.getListaDeGostosDaAplicacao().get(Integer.parseInt(bot[6]) - 1).substring(3, controlador.getListaDeGostosDaAplicacao().get(Integer.parseInt(bot[6]) - 1).length())
                                        + " ; " + bot[7]);
                                if (controlador.darMatch()) {
                                    deuMatch = true;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (sexo.toLowerCase().equals("m")) {
            try {
                for (String gosto : listaDeGostosUsuarioPrincipal) {
                    BufferedReader leArquivoFem = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Windows\\Temp\\perfisFem.txt"), "UTF-8"));
                    while ((linha = leArquivoFem.readLine()) != null) {
                        if (deuMatch == false) {
                            String[] bot = linha.split(";");
                            if (((listaDeGostosUsuarioPrincipal.get(0).equals(bot[5]) || (listaDeGostosUsuarioPrincipal.get(0).equals(bot[6])))
                                || (listaDeGostosUsuarioPrincipal.get(1).equals(bot[6]) || listaDeGostosUsuarioPrincipal.get(1).equals(bot[5])))) {
                                System.out.println(bot[0] + " ; " + bot[2] + " ; " + bot[3] + " ; " + bot[4] + " ; " + "Gostos: " + controlador.getListaDeGostosDaAplicacao().get(Integer.parseInt(bot[5]) - 1).substring(3,
                                        controlador.getListaDeGostosDaAplicacao().get(Integer.parseInt(bot[5]) - 1).length()) + " , " +
                                        controlador.getListaDeGostosDaAplicacao().get(Integer.parseInt(bot[6]) - 1).substring(3, controlador.getListaDeGostosDaAplicacao().get(Integer.parseInt(bot[6]) - 1).length())
                                        + " ; " + bot[7]);
                                if (controlador.darMatch()) {
                                    deuMatch = true;
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

