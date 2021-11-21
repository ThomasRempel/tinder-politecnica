package controlador;

import modelo.UsuariaMulher;
import modelo.Usuario;
import modelo.UsuarioHomem;
import principal.UI;
import utils.DadosTxt;
import exception.ExcecaoCaracter;
import exception.ExcecaoNumero;


import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Controlador {
    Scanner sc = new Scanner(System.in);
    UI ui = new UI();
    Usuario usuarioPrincipal = null;
    public int opcaoEscolhida;
    public int match;

    ControladorTxt controladorTxt = new ControladorTxt();

    private static final List<String> listaDeGostosDaAplicacao = new ArrayList<>();

    //tudo o que iniciar por primeiro deve estar neste método
    public void iniciaConfiguracoes() {
        ui.iniciaAplicacao();
        DadosTxt.criaArquivosTxt();
        adicionarGostos();
        ui.jaTemConta();
        possuiConta();
    }

    public void possuiConta() {
        opcaoEscolhida = sc.nextInt();

        if (opcaoEscolhida == 1) {
            logar();
        } else if (opcaoEscolhida == 2) {
            cadastrar();
        }
    }

    public void adicionarGostos() {
        this.listaDeGostosDaAplicacao.add("1- Cozinhar");
        this.listaDeGostosDaAplicacao.add("2- Música");
        this.listaDeGostosDaAplicacao.add("3- Animais");
        this.listaDeGostosDaAplicacao.add("4- Livros");
        this.listaDeGostosDaAplicacao.add("5- Esportes");
        this.listaDeGostosDaAplicacao.add("6- Filmes e séries");
    }

    public void logar() {
        ui.pedirNome();
        sc.nextLine();
        String nome = sc.nextLine();
        ui.pedirSenha();
        String senha = sc.nextLine();
        try {
            if (validarLogin(nome, senha)) {
                iniciaProgramaPrincipal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void iniciaProgramaPrincipal() {
        ui.boasVindas();
        ui.verPerfilOuBuscarPretendentes();
        opcaoEscolhida = sc.nextInt();

        if (opcaoEscolhida == 1) {
            controladorTxt.buscarPretendente(usuarioPrincipal.getGostos());
        } else if (opcaoEscolhida == 2) {
            verPerfil();
        }
    }

    private void verPerfil() {
        System.out.println(usuarioPrincipal.verMeuPerfil());
        ui.editarPerfilOuVoltar();
        opcaoEscolhida = sc.nextInt();

        if (opcaoEscolhida == 1) {
            editarPerfil();
        }
        else if(opcaoEscolhida == 2) {
            iniciaProgramaPrincipal();
        }
    }

    private void editarPerfil() {
        opcaoEscolhida = 0;
        while (opcaoEscolhida != 8) {
            ui.editarPerfil();
            opcaoEscolhida = sc.nextInt();

            if (opcaoEscolhida == 1) {
                editarNome();
            }
            else if (opcaoEscolhida == 2) {

            }
            else if (opcaoEscolhida == 3) {

            }
            else if (opcaoEscolhida == 4) {

            }
            else if (opcaoEscolhida == 5) {

            }
            else if (opcaoEscolhida == 6) {

            }
            else if (opcaoEscolhida == 7) {

            }
        }
        verPerfil();
    }

    private void editarNome() {

    }

    private boolean validarLogin(String nome, String senha) throws Exception {
        if (ControladorTxt.login(nome, senha) != null) {
            usuarioPrincipal = ControladorTxt.login(nome, senha);
            System.out.println("Logado com sucesso!");
            return true;
        }
        return false;
    }

    public void cadastrar() {
        ui.homemOuMulher();
        sc.nextLine();
        String sexo = sc.nextLine();

        if (sexo.toLowerCase().equals("m")) {
            cadastrarHomem();
        } else if (sexo.toLowerCase().equals("f")) {
            cadastrarMulher();
        }
    }

    private void cadastrarHomem() {
        String nome;

        System.out.print("Digite seu nome:");
        nome = sc.nextLine();
        //verificaCaracter(nome);

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        //verificaNumero(idade);

        System.out.print("Digite seu curso: ");
        sc.nextLine();
        String curso = sc.nextLine();
        //verificaCaracter(curso);

        System.out.print("Digite seu período: ");
        int periodo = sc.nextInt();

        listaGostos();
        System.out.println("Digite o que você mais gosta: ");
        int gosto1 = sc.nextInt();
        System.out.println("Digite o que você mais gosta: ");
        int gosto2 = sc.nextInt();
        List<String> listaDeGostos = new ArrayList<>();
        listaDeGostos.add(String.valueOf(gosto1));
        listaDeGostos.add(String.valueOf(gosto2));

        System.out.print("Digite algo sobre você: ");
        sc.nextLine();
        String sobreMim = sc.nextLine();

        String cadastro = nome + ";" + senha + ";" + idade + ";" + curso + ";" + periodo + ";" + gosto1 + ";" + gosto2 + ";" + sobreMim;

        ControladorTxt controladorTxt = new ControladorTxt();
        ControladorTxt.ControladorTxt(cadastro, "C:\\Windows\\Temp\\perfisMasc.txt");

        UsuarioHomem usuarioHomem = new UsuarioHomem(nome, senha, idade, curso, periodo, listaDeGostos, sobreMim);

        System.out.println("Logou com sucesso!");

    }
    /*private void verificaCaracter(String objeto) throws ExcecaoCaracter {
        KeyEvent evt = null;
        String caracteres = "0987654321";// lista de caracters que não devem ser aceitos

        if (caracteres.contains(evt.getKeyChar() + "")) {// se o character que gerou o
            throw new ExcecaoCaracter("Dígito inválido. Use apenas caracteres não numéricos");
        }
    }

    private void verificaNumero(int objeto) throws ExcecaoNumero{
        if (String.valueOf(objeto) == null || String.valueOf(objeto).isEmpty()) {
            throw new ExcecaoNumero("Dígito inválido. Use apenas caracteres numéricos");

        }
    }*/


    private void cadastrarMulher() {
        System.out.print("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.print("Digite sua senha:");
        String senha = sc.nextLine();
        System.out.print("Digite sua idade:");
        int idade = sc.nextInt();
        System.out.print("Digite seu curso:");
        sc.nextLine();
        String curso = sc.nextLine();
        System.out.print("Digite seu período:");
        int periodo = sc.nextInt();

        listaGostos();
        System.out.println("Digite o que você mais gosta: ");
        int gosto1 = sc.nextInt();
        System.out.println("Digite o que você mais gosta: ");
        int gosto2 = sc.nextInt();
        List<String> listaDeGostos = new ArrayList<>();
        listaDeGostos.add(String.valueOf(gosto1));
        listaDeGostos.add(String.valueOf(gosto2));

        System.out.print("Digite algo sobre você: ");
        sc.nextLine();
        String sobreMim = sc.nextLine();

        String cadastro = nome + ";" + senha + ";" + idade + ";" + curso + ";" + periodo + ";" + gosto1 + ";" + gosto2 + ";" + sobreMim;
        ControladorTxt controladorTxt = new ControladorTxt();
        ControladorTxt.ControladorTxt(cadastro, "C:\\Windows\\Temp\\perfisFem.txt");

        UsuariaMulher usuariaMulher = new UsuariaMulher(nome, senha, idade, curso, periodo, listaDeGostos, sobreMim);
        System.out.println("Logou com sucesso!");
    }

    private void listaGostos() {
        for (String gosto : this.listaDeGostosDaAplicacao) {
            System.out.println(gosto);
        }
    }

    public List<String> getListaDeGostosDaAplicacao() {
        return listaDeGostosDaAplicacao;
    }

    public boolean darMatch() {
        System.out.println("Você gostou deste usuário ?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.println("3 - Voltar para o menu");
        opcaoEscolhida = sc.nextInt();

        if (opcaoEscolhida == 1) {
            System.out.println("Parabéns! Aí está o amor da sua vida!");
            return true;
        }else if(opcaoEscolhida == 3){
            iniciaProgramaPrincipal();
        }
        return false;
    }

    public String perguntaPreferencia() {
        ui.oqueVoceEstaBuscando();
        String sexo = sc.nextLine();
        return sexo;
    }
}
