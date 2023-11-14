import java.util.ArrayList;
import java.util.List;

public class Cars {
    public static Object carList;
    String regNum;
    String color;
    String brand;

    

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

    public String showCar(){
        return "Bil nr " + carList + "Bilmärke: " + brand + "\nReg.nr: " + regNum + "\nFärg: " + color;
    }
    
}
