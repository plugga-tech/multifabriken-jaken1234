public class Candy {

    private String taste;
    private int quantity;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return "\nTaste: " + taste +"\nQuantity: " + quantity;
    }
}
