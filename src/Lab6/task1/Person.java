package Lab6.task1;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
        public void introduce() {
            System.out.println("Привіт! Мене звати " + name + ", мені " + age + " років.");
        }
}
