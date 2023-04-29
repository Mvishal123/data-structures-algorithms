package OOP.SingletonClass;

public class SingletonMainClass {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance("vishal");
        Singleton obj2 = Singleton.getInstance("Vaibhav");
        Singleton obj3 = Singleton.getInstance("Mahesh");

        System.out.println(obj1.name);
    }
}
