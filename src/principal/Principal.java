package principal;

import controlador.Controlador;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Inicia as configurações da aplicação
        Controlador controlador = new Controlador();
        controlador.iniciaConfiguracoes();



        sc.close();
    }
}
