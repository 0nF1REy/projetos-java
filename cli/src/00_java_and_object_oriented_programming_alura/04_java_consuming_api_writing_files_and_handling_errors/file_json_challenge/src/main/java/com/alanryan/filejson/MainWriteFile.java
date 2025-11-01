package com.alanryan.filejson;

import java.io.FileWriter;
import java.io.IOException;

public class MainWriteFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write("Conteúdo a ser gravado no arquivo.");
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gravar o arquivo.");
            System.out.println(e.getMessage());
        }
    }
}
