package Example23;

public class TestPolymorphism {

    public static void main(String[] args) {
        // TODO 1. Uncomment the methods that you can execute.
        A a1 = new C();
        //a1.apple();
        //a1.orange();
        //a1.toString();

        // TODO 2. Predict what you will see when a2.toString()
        Object a2 = new D();
        System.out.println(a2.toString());

        // TODO 3. Write code to downcast a2 to type D 

    }
}
