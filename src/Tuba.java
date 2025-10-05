public class Tuba implements Instrument {
    private int diameter;

    public Tuba(int diameter) {
        this.diameter = diameter;
    }
    @Override
    public void play(){
        System.out.println("Играет туба в тональности "+KEY+", с характеристиками " +
                ": диаметр "+diameter);
    }
}
