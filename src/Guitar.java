public class Guitar implements Instrument {
    private int numberOfStrings;

    public Guitar(int numberOfStrings){
        this.numberOfStrings=numberOfStrings;
    }
@Override
    public void play(){
    System.out.println("Играет гитара в тональности "+KEY+", с характеристиками " +
            ": количество струн "+numberOfStrings);
}

}