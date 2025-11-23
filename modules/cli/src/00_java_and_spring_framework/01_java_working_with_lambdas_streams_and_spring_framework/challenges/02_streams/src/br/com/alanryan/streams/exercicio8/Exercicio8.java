package br.com.alanryan.streams.exercicio8;

import br.com.alanryan.streams.util.Produto;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio8 {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
            new Produto("Smartphone", 800.0, "Eletrônicos"),
            new Produto("Notebook", 1500.0, "Eletrônicos"),
            new Produto("Teclado", 200.0, "Eletrônicos"),
            new Produto("Cadeira", 300.0, "Móveis"),
            new Produto("Monitor", 900.0, "Eletrônicos"),
            new Produto("Mesa", 700.0, "Móveis")
        );

        List<Produto> tresMaisBaratos = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos"))
                .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .limit(3)
                .collect(Collectors.toList());

        tresMaisBaratos.forEach(System.out::println);
    }
}
