public class Cars {
    
    private String regNum;
    private String color;
    private String brand;

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString(){
        return "\nCarbrand: " + brand +"\nRegistration number: " + regNum + "\nColor: " + color;
    }
}
