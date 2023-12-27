package Summer_2022.Q1.c;

public class StaticBlock {
    public static int a = 5, b;
    public static int c; //c must be static because it is in static block
    static {
        b = c * 4; //in every static block every variable should be static
    }
    static {
        c = 5;
    }
    public static void main(String[] args) {
        new StaticBlock();
    }
}
