public class Pipes {

    private double diameter;
    private double length;
    
    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString(){
        return "\nDiameter: " + diameter +"\nLength: " + length;
    }
}
