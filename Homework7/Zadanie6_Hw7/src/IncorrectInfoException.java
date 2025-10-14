public class IncorrectInfoException extends Exception {
    private String name;
        private int age;

    public IncorrectInfoException(String name, String message, int age) {
        super(message);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "IncorrectInfoException: " + getMessage() + " Введенные ФИО: " + name +
                " Введенный возраст: " + age;
    }
}
