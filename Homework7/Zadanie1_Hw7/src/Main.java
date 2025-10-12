public class Main {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb1.append("3+56=59");
        sb2.append("3-56=53");
        sb3.append("3*56=168");

        sb1.replace(4, 5, "равно");
        sb2.replace(4, 5, "равно");
        sb3.replace(4, 5, "равно");
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
    }


}