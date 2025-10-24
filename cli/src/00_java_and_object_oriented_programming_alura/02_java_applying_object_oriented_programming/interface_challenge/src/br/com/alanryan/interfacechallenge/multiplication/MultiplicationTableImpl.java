package br.com.alanryan.interfacechallenge.multiplication;

public class MultiplicationTableImpl implements MultiplicationTable {
    private int number;

    public MultiplicationTableImpl(int number) {
        this.number = number;
    }

    @Override
    public void showTable() {
        System.out.println("Tabuada de multiplicação do número " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
