package Example23;

public class A {

    A(){}

    public void apple(){
        System.out.println("apple");
    }

    @Override
    public String toString() {
        return "Class A";
    }
}

class B extends A {

    public void orange(){
        System.out.println("orange");
    }

}

class C extends B{
    @Override
    public String toString() {
        return "Class C";
    }
}

class D extends C{

}

