public class TestChallenge {
    public static void main(String[] args) {

        // Person
        Person person = new Person();
        person.greet();

        // Calculator
        Calculator calc = new Calculator();
        System.out.println("O dobro de 7 é: " + calc.doubleNumber(7));
        System.out.println();

        // Music
        Music music = new Music("Imagine", "John Lennon", 1971);
        music.rate(10);
        music.rate(8);
        music.showTechnicalSheet();

        // Car
        Car car = new Car("Ford Mustang", 2015, "Vermelho");
        car.showTechnicalSheet();

        // Student
        Student student = new Student("Alan Ryan", 21);
        student.showInformation();
    }
}
