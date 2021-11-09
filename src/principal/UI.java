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

    public void bemVindo() {
        System.out.println("Bem vindo ao Tinder da Politécnica! \n");
        System.out.println("Você já tem uma conta? ");
        System.out.println("1- Sim \n2- Não");
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
        System.out.print("Digite \"h\" para homem ou \"m\" para mulher: ");
    }


}
