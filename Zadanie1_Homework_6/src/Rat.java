public class Rat extends Animal {
    public Rat(String name, int age){
        super(name, age);

    }

    @Override
    public String makeNoise() {
        return "Пик";
    }
}
