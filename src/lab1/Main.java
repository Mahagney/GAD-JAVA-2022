package lab1;

public class Main {
    public static void main(String[] args) {
        byte a1 = 56;
        byte a2 = 12;
        int a3 = a1 + a2;
        System.out.println("a3=" + a3);
        repeat();
    }

    public static void repeat(){
        System.out.println("a1");
        repeat();
    }
}
