package Lab6.task3;

public class Main {
    public static void main(String[]args){
        Animal[] Animals = new Animal[3];

        Animals[0] = new Animal("Макака", "Уа, уа, уа");
        Animals[1] = new Animal("Вівця", "Бєєєє");
        Animals[2] = new Animal("Півень", "Кукарікуу");

        for (Animal animal : Animals) {
            animal.makeSound();
        }
    }
}
