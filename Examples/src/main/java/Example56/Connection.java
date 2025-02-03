package Example56;

public class Connection {


    //TODO 1 Make the constructor private
    Connection(){
    }

    // static factory method (factory - make objects)
    private static Connection connection;

    /* TODO 2 If connection is null, instantiate and return
     else, just return */
    public static Connection getInstance(){
        if( connection  == null){
            connection = new Connection();
            return connection;
        }else{
            return connection;
        }

    }

    // Rest of the class
    public String getData(){
        return "here's some data";
    }
}
