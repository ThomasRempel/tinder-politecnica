package principal;

public class UI {
    public UI() {
    }

    public void iniciaAplicacao() {
        System.out.println("==============================");
        System.out.println("Iniciando aplicação...");
        System.out.println("==============================");

        //limpaConsole();

    }

    public void jaTemConta() {
        System.out.println("Você já tem uma conta? ");
        System.out.println("1- Sim \n2- Não");
    }

    public void boasVindas() {
        System.out.println("==============================\n" + "Bem vindo ao Tinder da Politécnica! " + "\n==============================");
    }



    public void limpaConsole() {
        for(int i = 0; i < 100; i++) {
            System.out.println("");
        }
    }

    public void pedirNome() {
        System.out.print("Insira seu nome: ");

    }

    public void pedirSenha() {
        System.out.print("Insira sua senha: ");
    }

    public void homemOuMulher() {
        System.out.println("Qual o seu sexo?");
        System.out.print("Digite \"M\" para homem ou \"F\" para mulher: ");
    }

    public void oqueVoceEstaBuscando(){
        System.out.println("Você prefere homem ou mulher?");
        System.out.println("Digite \"H\" para homem ou \"M\" para mulher: ");
    }

    public void verPerfilOuBuscarPretendentes() {
        System.out.println("1- Buscar outros usuários");
        System.out.println("2- Ver perfil");
    }

    public void editarPerfilOuVoltar() {
        System.out.println("1- Editar perfil");
        System.out.println("2- Voltar");
    }

    public void editarPerfil() {
        System.out.println("O que você deseja alterar?");
        System.out.println("1- Nome");
        System.out.println("2- Senha");
        System.out.println("3- Idade");
        System.out.println("4- Curso");
        System.out.println("5- Período");
        System.out.println("6- Gostos");
        System.out.println("7- Sobre mim");
        System.out.println("8- Voltar");
    }


}
