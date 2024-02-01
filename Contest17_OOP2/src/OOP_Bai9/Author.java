package OOP_Bai9;

import java.util.ArrayList;

public class Author {
    private String name, mail, gender;


    public Author(String name, String mail, String gender) {
        this.name = name;
        this.mail = mail;
        this.gender = gender;
    }

    public String toString() {
        return "Name : " + this.name + "\n" + "Email : " + this.mail + "\n" + "Gender : " + this.gender + "\n";
    }
}
