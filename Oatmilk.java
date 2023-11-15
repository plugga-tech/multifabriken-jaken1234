public class Oatmilk {
    
    private double fatcontent;
    private double liter;

    public double getFatcontent() {
        return fatcontent;
    }

    public void setFatcontent(double fatcontent) {
        this.fatcontent = fatcontent;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }

    public String toString(){
        return "\nFetthalt: " + fatcontent +"\nLiter: " + liter;
    }
}
