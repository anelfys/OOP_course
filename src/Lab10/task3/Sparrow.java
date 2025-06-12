package Lab10.task3;

class Sparrow extends Bird implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("Chiric chiric");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
