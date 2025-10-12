public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number=number;
        this.model=model;
        this.weight = weight;
        System.out.println("Вызван конструктор с тремя параметрами");
    }

    public Phone(String number, String model) {
        this(number, model, 125.0);
        System.out.println("Вызван конструктор с двумя параметрами. Параметр \"Weight\" по умолчанию.");
    }

    public Phone() {
        System.out.println("Вызван конструктор без параметров");
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, String number) {
        System.out.println("Перегруженный метод; Звонит " + name + " Номер телефона: " + number);
    }

    public String getNumber() {
        return this.number;
    }



    public void sendMessage(String... phoneNumber) {
        System.out.println("Сообщение отправлено с номера ");
        if (phoneNumber.length == 0) {
            System.out.println("Номер не указан.");
            return;
        }
        for (String numb : phoneNumber) {
            System.out.println("- " + numb);
        }
    }

    public void printInf() {
        System.out.println("Модель: " + this.model + ", Номер: " + this.number + ", Вес: " + this.weight);
    }


    }

