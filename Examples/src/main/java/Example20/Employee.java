package Example20;

public class Employee {
    private String name;
    private int id;

    Employee(){
        System.out.println("Employee No-Arg Constructor");
        this.name = "Default";
        this.id = 0;
    }

    Employee(String name, int id){
        System.out.println("Employee Two-Arg Constructor");
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    private void apple(){
        System.out.println("do something");
    }

    public String getBasicInformation(){
        return "Company Employee " + name;
    }

    @Override
    public String toString() {
        return String.format("Employee %s ID %d",name,id);
    }
}
