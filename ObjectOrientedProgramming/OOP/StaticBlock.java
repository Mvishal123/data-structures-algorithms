package OOP;

public class StaticBlock {
    static int a = 10;
    static int b;

    static{
        System.out.println("Static block has run");
        b = a * 10;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);

        StaticBlock.b += 20;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+ " "+ StaticBlock.b);

    }
}
