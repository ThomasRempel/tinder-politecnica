package principal;

import controlador.Controlador;
import controlador.ControladorTxt;
import java.util.Scanner;




// Alunos: Enzo Falvo | Mikael da Silva | Thomas Rempel

public class Principal {
    public static void main(String[] args) {
        //Inicia as configurações da aplicação
        Controlador controlador = new Controlador();
        controlador.iniciaConfiguracoes();
    }
}