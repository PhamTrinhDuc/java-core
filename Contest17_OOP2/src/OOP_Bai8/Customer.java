package OOP_Bai8;

public class Customer {
    private String name, gender, ID;

    public Customer(String name, String ID, String gender) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
    }

    public String toString(){
        return this.ID + "\n" + this.name + "\n" + this.gender + "\n";
    }
}
