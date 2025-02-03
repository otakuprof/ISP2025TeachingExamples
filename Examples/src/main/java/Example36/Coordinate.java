package Example36;

//*** Comparable<T> - T, the class that you are comparing to, i.e. yourself
public class Coordinate {

    private double x, y;

    Coordinate(){}

    Coordinate(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(){
        return Math.sqrt( x*x + y*y);
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        String template = "(%f, %f)";
        return String.format( template, x, y);
    }

}