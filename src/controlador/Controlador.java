package controlador;

import modelo.UsuariaMulher;
import modelo.Usuario;
import modelo.UsuarioHomem;
import principal.UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Controlador {
    Scanner sc = new Scanner(System.in);

    //inicia a lista de gostos para perguntar para o usuario
    private List<String> listaDeGostosDaAplicacao = new ArrayList<>();

    List<String> listaNova; //Sei la pra que serve


    UI ui = new UI();

    //tudo o que iniciar por primeiro deve estar neste método
    public void iniciaConfiguracoes() {
        ui.iniciaAplicacao();
        adicionarGostos();
        ui.bemVindo();
        possuiConta();
    }

    public void possuiConta() {
        int opcaoEscolhida = sc.nextInt();

        if (opcaoEscolhida == 1) {
            logar();
        }
        else if (opcaoEscolhida == 2) {
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
        String nome = sc.nextLine();
        sc.nextLine();
        ui.pedirSenha();
        String senha = sc.nextLine();
        try{
            if(validarLogin(nome, senha)){
                iniciaProgramaPrincipal();
            }
        }
        catch (Exception e) {

        }
    }

    private void iniciaProgramaPrincipal() {
        System.out.println("Pograma Principal");
    }

    private boolean validarLogin(String nome, String senha) throws Exception{
        return ControladorTxt.leLinha(nome, senha);
    }

    public void cadastrar() {
        ui.homemOuMulher();
        sc.nextLine();
        String sexo = sc.nextLine();

        if (sexo.toLowerCase().equals("m")) {
            cadastrarHomem();
        }
        else if (sexo.toLowerCase().equals("f")){
            cadastrarMulher();
        }
    }

    private void cadastrarHomem() {
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
        escolheGosto(gosto1);
        System.out.println("Digite o que você mais gosta: ");
        int gosto2 = sc.nextInt();
        escolheGosto(gosto2);

        System.out.print("Digite algo sobre você: ");
        sc.nextLine();
        String sobreMim = sc.nextLine();

        String cadastro = nome +";" + senha + ";" + idade + ";" + curso + ";" + periodo + ";" + gosto1 + ";" + gosto2 + ";"  + sobreMim;

        ControladorTxt controladorTxt = new ControladorTxt();
        ControladorTxt.ControladorTxt(cadastro, "C:\\Windows\\Temp\\perfisMasc");

        UsuarioHomem usuarioHomem = new UsuarioHomem(nome, senha, idade, curso, periodo, listaNova, sobreMim);

        System.out.println("Logou com sucesso!");
    }

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
        escolheGosto(gosto1);
        System.out.println("Digite o que você mais gosta: ");
        int gosto2 = sc.nextInt();
        escolheGosto(gosto2);

        System.out.print("Digite algo sobre você: ");
        sc.nextLine();
        String sobreMim = sc.nextLine();

        String cadastro = nome +";" + senha + ";" + idade + ";" + curso + ";" + periodo + ";" + gosto1 + ";" + gosto2 + ";"  + sobreMim;
        ControladorTxt controladorTxt = new ControladorTxt();
        ControladorTxt.ControladorTxt(cadastro, "C:\\Windows\\Temp\\perfisFem");

        UsuariaMulher usuariaMulher = new UsuariaMulher(nome, senha, idade, curso, periodo, listaNova, sobreMim);
        System.out.println("Logou com sucesso!");
    }

    private void listaGostos() {
        for (String gosto : this.listaDeGostosDaAplicacao) {
            System.out.println(gosto);
        }
    }

    public void escolheGosto(int gosto){
       if((gosto<6 && gosto>0)){
            List<String> listaNova = getListaDeGostosDaAplicacao(gosto - 1);
           //System.out.println(listaNova);
       }
    }


    public List<String> getListaDeGostosDaAplicacao(int gosto) {
        return listaDeGostosDaAplicacao;
    }

    public void setListaDeGostosDaAplicacao(List<String> listaDeGostosDaAplicacao) {
        this.listaDeGostosDaAplicacao = listaDeGostosDaAplicacao;
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
