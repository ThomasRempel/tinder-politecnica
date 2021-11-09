package controlador;
import java.io.*;
import java.util.Scanner;

public class ControladorTxt{
    Scanner sc = new Scanner(System.in);
    public static void  ControladorTxt(String conteudo, String nomeArquivo) {
        try {
            Writer bw;
            bw = new BufferedWriter(new FileWriter(nomeArquivo, true));
            bw.write(conteudo + "\n");
            bw.close();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void leLinha(String cadastro) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("C:\\Windows\\Temp\\perfisFem.txt"), "UTF-8"));
        BufferedReader br2 = new BufferedReader(
                new InputStreamReader(new FileInputStream("C:\\Windows\\Temp\\perfisMasc.txt"), "UTF-8"));

        String linha;
        boolean logou = false;

        while ((linha = br.readLine()) != null) {
            if(linha.contains(cadastro)){
                logou = true;
                System.out.println("Logado com sucesso!");
            }
        }
        if (logou == false){
            System.out.println("Login ou senha incorreta");
        }
        br.close();
    }
}
