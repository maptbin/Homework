public class IncorrectInfoException {
    private String name;
    private String allarm;
    private int age;

    public IncorrectInfoException(String name, String allarm, int age){
        this.name=name;
        this.allarm=allarm;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public String getAllarm(){
        return allarm;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "IncorrectInfoException: "+allarm+" Введенные ФИО: "+name+
                " Введенный возраст: "+age;
    }
}
