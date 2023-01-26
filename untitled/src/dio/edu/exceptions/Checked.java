package dio.edu.exceptions;

import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console;

public class Checked {
    public static void main(String[] args) {

        String nomeDoArquivo = "romance-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir! " + e.getCause());
            e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName())); //é uma classe checked pq o FileReader lança throws uma exception, ou seja, eu só consigo rodar esse programa se eu tratar essa exception
        String line = br.readLine();//readLine trhows uma IO

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //abrindo o arquivo

        do {
            bw.write(line);// Tbm lança uma IOException
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush(); //descarregar
        br.close();
    }
}

