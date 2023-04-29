package OOP;

public class finalizeMethod {
    static class Student{
        String name;
        Student(String name){
            this.name = "Vishal";
        }

        //Whenever garbage collector destroys the objects finalize method is called
        @Override
        protected void finalize() throws Throwable {
            System.out.println("It is destroyed by garbage collector");
        }
    }
     public static void main(String[] args) {
        Student s1 = new Student("Vishal");

        for(int i = 0; i < 100000; i++){
            s1 = new Student("name");
        }
    }
}
