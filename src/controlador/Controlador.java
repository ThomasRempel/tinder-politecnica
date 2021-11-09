package controlador;

import modelo.Usuario;
import principal.UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Controlador {
    Scanner sc = new Scanner(System.in);

    //inicia a lista de gostos para perguntar para o usuario
    private List<String> listaDeGostosDaAplicacao = new ArrayList<>();

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
        ui.pedirSenha();
        String senha = sc.nextLine();

        validarLogin(nome, senha);
    }

    private void validarLogin(String nome, String senha) {

    }

    public void cadastrar() {
        ui.homemOuMulher();
        sc.nextLine();
        String sexo = sc.nextLine();

        if (sexo.toLowerCase().equals("m")) {
            //implementar aqui um novo método para cadastrar caso o usuário seja homem
        }
        else if (sexo.toLowerCase().equals("f")){
            //implementar aqui um novo método para cadastrar caso a usuária seja mulher
        }


        /*          pode utilizar este cadastro como parte da implementação ;)
        System.out.print("Digite seu nome:");
        //printando sc.nextLine() para não bugar
        sc.nextLine();
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

        String cadastro = "@" + nome +"@" + ""+ "%" + senha + "%" + "" + "&" + idade + "&"+ "" + "$" + curso + "$" + "" + "!" + periodo + "!" + "" + "*" + "Gosto1" +"," + "gosto2" + "*" + "#" + "preferencia" + "#" + "" +  "'" + "Sobre Mim" + "'";
                //Usuario usuario = new Usuario(nome, senha, idade, curso, periodo, gostos, sobreMim);
        System.out.println("Logou com sucesso!");
*/

      //  ControladorTxt controladorTxt = new ControladorTxt();
       // ControladorTxt.ControladorTxt(cadastro, "C:\\Windows\\Temp\\perfisFem");



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
