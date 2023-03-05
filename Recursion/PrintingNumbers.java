public class PrintingNumbers {
    public static void main(String[] args) {
        System.out.println("---WITHOUT RECURSION---");
        print1(1);  //without recursion
        System.out.println("---USING RECURSION---");
        recursion(1);
    }

    static void recursion(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recursion(n+1);
    }

    static void print1(int n){
        System.out.println(n);
        print2(n+1);
    }

    static void print2(int n){
        System.out.println(n);
        print3(n+1);
    }

    static void print3(int n){
        System.out.println(n);
        print4(n+1);
    }

    static void print4(int n){
        System.out.println(n);
        print5(n+1);
    }

    static void print5(int n){
        System.out.println(n);
    }
}

