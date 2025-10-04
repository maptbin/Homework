/*Создать программу, которая реализует работу поликлиники. В программе должна быть иерархия классов для
животных: абстрактный класс Animal в качестве родителя, классы Cat, Dog, Rat в качестве наследников. В класс
Animal добавить поля name (кличка питомца) и age (возраст питомца) и геттеры с сеттерами для них, добавить
абстрактный метод makeNoise(), который в последствии реализовать во всех наследниках и который должен
выводить на экран сообщения, подобающие каждому животному (у котов Мяу, у собак Гав и тд)
 */

public class Main {

    public static void animalInfo(Animal animal) {
        int age = animal.getAge();
        String name = animal.getName();
        String noise = animal.makeNoise();
        System.out.printf("Пациент: %s, Возраст: %d, Звук: %s\n",
                name, age, noise);
    }


    public static void main(String[] args) {
        Animal cat = new Cat("Мурзик", 4);
        Animal dog = new Dog("Рута", 3);
        Animal rat = new Rat("Пикачу", 1);

        animalInfo(cat);
        animalInfo(dog);
        animalInfo(rat);

        cat.setAge(-2);
        dog.setName("Топа");

        System.out.println(cat.getName() + " теперь " + cat.getAge() + " года");
        System.out.println("Пса теперь зовут: " + dog.getName());
        System.out.println(" ");

    }
}