public class Main {
    public static void main(String[] args) {
        System.out.println("Создание трёх экземпляров:");

        Phone phone1 = new Phone("937 - 99 - 92", "iPhone", 237.0);


        Phone phone2 = new Phone("375-21-23", "Xiaomi");


        Phone phone3 = new Phone();

        System.out.println("Вывод значений переменных:");
        phone1.printInf();
        phone2.printInf();
        phone3.printInf();

        System.out.println("Вывод метода receiveCall: ");
        phone1.receiveCall("Вася");
        System.out.println("Номер phone1: " + phone1.getNumber());
        phone2.receiveCall("Олег");
        System.out.println("Номер phone2: " + phone2.getNumber());
        phone3.receiveCall("Марина");
        System.out.println("Номер phone3: " + phone3.getNumber());

        System.out.println("Вызов перегруженного метода receiveCall");
        phone1.receiveCall("Вася", "937-99-92");

        System.out.println("Вызов метода sendMessage");
        phone1.sendMessage("937-99-92");


        phone2.sendMessage("7788");


        phone3.sendMessage();
    }
}
