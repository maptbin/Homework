/*
Создать интерфейс Instrument и реализующие его классы Guitar, Drum и Tuba.
Интерфейс Instrument содержит метод play() и переменную String KEY = "До мажор".
Guitar содержит переменные класса количество струн, Drum - размер, Tuba - диаметр.
Создать массив типа Instrument, содержащий инструменты разного типа.
В цикле вызвать метод play() для каждого инструмента, который должен выводить
строку "Играет такой-то инструмент, с такими-то характеристиками".
 */
public class Main {
    public static void main(String[] args) {
        Instrument[] orchestra=new Instrument[3];

        orchestra[0]=new Guitar(6);
        orchestra[1]=new Drum(26);
        orchestra[2]=new Tuba(22);

        for (Instrument instrument:orchestra){
            instrument.play();
        }


    }
}