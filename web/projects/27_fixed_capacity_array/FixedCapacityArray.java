public class FixedCapacityArray {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        System.out.println("Operação concluída! Verifique o estado do vetor para mais detalhes.");
    }
}

class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

     /*public void adiciona(String elemento) {
        for (int i=0; i<this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
     }*/

     /*public void adiciona(String elemento) throws Exception {

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
        }
     }*/

    public boolean adiciona(String elemento) {

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
}
