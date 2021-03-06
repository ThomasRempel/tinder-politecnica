package controlador;

import modelo.UsuariaMulher;
import modelo.Usuario;
import modelo.UsuarioHomem;
import principal.UI;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ControladorTxt {
    UI ui = new UI();

    public static void insereUsuario(String conteudo, String nomeArquivo) {
        try {
            Writer criandoLinhaTxt;
            criandoLinhaTxt = new BufferedWriter(new FileWriter(nomeArquivo, true));
            criandoLinhaTxt.write("\n" + conteudo);
            criandoLinhaTxt.close();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.getMessage();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.getMessage();
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
                leArquivoFem.close();
                leArquivoMasc.close();
                return usuarioLogado;
            }
        }
        while ((linha = leArquivoMasc.readLine()) != null) {
            String[] logins = linha.split(";");
            if (nome.equals(logins[0]) && senha.equals(logins[1])) {
                usuarioLogado = recebeDadosDoUsuario(logins, 'M');
                leArquivoFem.close();
                leArquivoMasc.close();
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

    /*public static void atualizaDadosDeLoginNoArquivo(Usuario usuarioDesatualizado, Usuario usuarioAtualizado) throws Exception {
        Writer bw = null;
        boolean existeRegistroNoArquivo = false;
        File arquivoAntigo = null;
        File arquivoNovo = null;
        String linha;

        BufferedReader leArquivoFem = new BufferedReader(
                new InputStreamReader(new FileInputStream("C:\\Windows\\Temp\\perfisFem.txt"), "UTF-8"));
        BufferedReader leArquivoMasc = new BufferedReader(
                new InputStreamReader(new FileInputStream("C:\\Windows\\Temp\\perfisMasc.txt"), "UTF-8"));

        while ((linha = leArquivoFem.readLine()) != null) {
            arquivoNovo = new File("C:\\Windows\\Temp\\perfisFemTemp.txt");
            bw = new BufferedWriter(new FileWriter("C:\\Windows\\Temp\\perfisFem.txt", true));
            String[] usuarioLido = linha.split(";");

            //verifica se o usuario logado esta nesse arquivo
            if (!(usuarioDesatualizado.getNome().equals(usuarioLido[0]) && usuarioDesatualizado.getSenha().equals(usuarioLido[1]) && usuarioDesatualizado.getIdade() == Integer.parseInt(usuarioLido[2]))) {
                bw.write(linha);
            }
            else {
                bw.write(usuarioAtualizado.getNome() + ";" + usuarioAtualizado.getSenha()
                        + ";" + usuarioAtualizado.getIdade() + ";" + usuarioAtualizado.getCurso() + ";" + usuarioAtualizado.getPeriodo()
                        + ";" + usuarioAtualizado.getGostos().get(0) + ";" + usuarioAtualizado.getGostos().get(1) + ";" + usuarioAtualizado.getSobreMim());
                existeRegistroNoArquivo = true;
            }
        }
        if (existeRegistroNoArquivo) {
            bw.flush();
            arquivoAntigo = new File("C:\\Windows\\Temp\\perfisFem.txt");
        }

        //resetando o valor da variavel
        existeRegistroNoArquivo = false;

        while ((linha = leArquivoMasc.readLine()) != null) {
            arquivoNovo = new File("C:\\Windows\\Temp\\perfisMascTemp.txt");
            bw = new BufferedWriter(new FileWriter("C:\\Windows\\Temp\\perfisMascTemp.txt", true));
            String[] usuarioLido = linha.split(";");

            //verifica se o usuario logado esta nesse arquivo
            if (!(usuarioDesatualizado.getNome().equals(usuarioLido[0]) && usuarioDesatualizado.getSenha().equals(usuarioLido[1]) && usuarioDesatualizado.getIdade() == Integer.parseInt(usuarioLido[2]))) {
                bw.write(linha);
                bw.flush();
            }
            else {
                bw.write(usuarioAtualizado.getNome() + ";" + usuarioAtualizado.getSenha()
                        + ";" + usuarioAtualizado.getIdade() + ";" + usuarioAtualizado.getCurso() + ";" + usuarioAtualizado.getPeriodo()
                        + ";" + usuarioAtualizado.getGostos().get(0) + ";" + usuarioAtualizado.getGostos().get(1) + ";" + usuarioAtualizado.getSobreMim());
                existeRegistroNoArquivo = true;
            }
        }
        if (existeRegistroNoArquivo) {
            bw.close();
            leArquivoMasc.close();
            leArquivoFem.close();
            arquivoAntigo = new File("C:\\Windows\\Temp\\perfisMasc.txt");
            //if (arquivoAntigo.exists()) {
            //    arquivoAntigo.delete();
            //}
            boolean sucesso = arquivoNovo.renameTo(arquivoAntigo);
            System.out.println(sucesso);
        }
    } */
    public static void buscarPretendente(List<String> listaDeGostosUsuarioPrincipal) {
        Controlador controlador = new Controlador();
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
                            logicaDoMatch(listaDeGostosUsuarioPrincipal, bot, controlador);

                            if (darMatch(controlador)) {
                                deuMatch = true;
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
                            logicaDoMatch(listaDeGostosUsuarioPrincipal, bot, controlador);
                            if (darMatch(controlador)) {
                                deuMatch = true;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*Tivemos que colocar este m??todo aqui por conta de problemas de instancia????o do Controlador para o ControladorTxt, sendo assim
    instanciamos o Scanner dentro do m??todo */
    public static boolean darMatch(Controlador controlador) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voc?? gostou deste usu??rio ?");
        System.out.println("1 - Sim");
        System.out.println("2 - N??o");
        System.out.println("3 - Voltar para o menu");
        int opcaoEscolhida = sc.nextInt();

        if (opcaoEscolhida == 1) {
            UI.darMatch();
            return true;
        } else if (opcaoEscolhida == 3) {
            controlador.iniciaProgramaPrincipal();
        }
        return false;
    }

    private static void logicaDoMatch(List<String> listaDeGostosUsuarioPrincipal, String[] bot, Controlador controlador) {
        if (((listaDeGostosUsuarioPrincipal.get(0).equals(bot[5]) || (listaDeGostosUsuarioPrincipal.get(0).equals(bot[6])))
                || (listaDeGostosUsuarioPrincipal.get(1).equals(bot[6]) || listaDeGostosUsuarioPrincipal.get(1).equals(bot[5])))) {
            System.out.println(bot[0] + " ; " + bot[2] + " ; " + bot[3] + " ; " + bot[4] + " ; " + "Gostos: " + controlador.getListaDeGostosDaAplicacao()
                    .get(Integer.parseInt(bot[5]) - 1).substring(3, controlador.getListaDeGostosDaAplicacao().get(Integer.parseInt(bot[5]) - 1).length())
                    + " , " + controlador.getListaDeGostosDaAplicacao().get(Integer.parseInt(bot[6]) - 1).
                    substring(3, controlador.getListaDeGostosDaAplicacao().get(Integer.parseInt(bot[6]) - 1).length())
                    + " ; " + bot[7]);
        }
    }


}


