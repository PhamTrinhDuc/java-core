package OOP_Bai7;

public class Customer {
    private int ID;
    private int discount;
    private String name;

    public Customer(String name, int ID, int discount) {
        this.name = name;
        this.ID = ID;
        this.discount = discount;
    }

    public int getDiscount() {
        return this.discount;
    }

    public int getID() {
        return this.ID;
    }

    public String toString() {
        return "Customer ID : " + ID + "\n" + this.name + "\n";
    }
}
