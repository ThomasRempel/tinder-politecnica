package principal;

public class UI {
    public UI() {
    }

    public void iniciaAplicacao() {
        System.out.println("==============================");
        System.out.println("Iniciando aplicação...");
        System.out.println("==============================");

        //limpaConsole();

        System.out.println("Bem vindo ao Tinder da Politécnica!");
        System.out.println("");
        System.out.println("Bem vindo ao Tinder da Politécnica!");
        System.out.println("Bem vindo ao Tinder da Politécnica!");
    }

    public void limpaConsole() {
        for(int i = 0; i < 100; i++) {
            System.out.println("");
        }
    }
}
