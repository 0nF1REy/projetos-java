package app;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("Alan");
        funcionarios.add("Sarah");
        funcionarios.add("Stella");

        System.out.println(funcionarios);
        System.out.println("- - -");
        System.out.println(funcionarios.get(1));
        
    }
}
