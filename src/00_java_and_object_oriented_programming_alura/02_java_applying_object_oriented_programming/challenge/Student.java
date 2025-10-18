public class Student {

    // ATRIBUTOS
    private String name;
    private int age;

    // CONSTRUTOR
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Método para exibir informações
    void showInformation() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Student student = new Student("Alan Ryan", 21);
        student.showInformation();
    }
}
