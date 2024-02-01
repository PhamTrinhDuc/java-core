package OOP_Bai5;

import java.util.Scanner;

public class Author {
    private String name, email, gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return "Author Information :\n" + this.name + "\n" + this.email + "\n" +
                this.gender + "\n" + "--------------------";
    }

}
