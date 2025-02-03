package Example31;

public class TestA {

    public static void main(String[] args) {

        A a = new B();
        // TODO What method can you executed and what will you see?
    }
}

class A{

    public void something(){
        System.out.println("Anya in A");
    }

}

class B extends A{
    @Override
    public void something(){
        System.out.println("Bond In B");
    }

    public void nothing(){
        System.out.println("Nothing here");
    }

}
