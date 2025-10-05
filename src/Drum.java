public class Drum implements Instrument{
private int size;
public Drum(int size){
    this.size=size;
}

    @Override
    public void play(){
        System.out.println("Играет барабан в тональности "+KEY+", с характеристиками " +
                ": размер "+size);
    }
}
