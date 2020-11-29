package lab5;

/**
 * The Author class model a book's author.
 */
public class Author {
    // The private instance variables
    private String name;
    private String email;
    private char gender;   // 'm' or 'f'

    /** Constructs a Author instance with the given inputs */
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // The public getters and setters for the private instance variables.
    // No setter for name and gender as they are not designed to be changed.
    /** Returns the name */
    public String getName() {
        return name;
    }
    /** Returns the gender */
    public char getGender() {
        return gender;
    }
    /** Returns the email */
    public String getEmail() {
        return email;
    }
    /** Sets the email */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Returns a self-descriptive String */
    public String toString() {
        System.out.println("Test constructor and toString() ");
        return "Name: " + name + " Gender: " + gender + " Email: " + email ;


    }
}

class TestAuthor {
    public static void main(String[] args) {
        Author subarna = new Author("Subarna Basnet", "2019008144.subarna@ug.sharda.ac.in", 'm');
        System.out.println(subarna);
        subarna.setEmail("subarnabasnetkaji@gmail.com");
        System.out.println("Name is: " + subarna.getName());
        System.out.println("Gender is: " + subarna.getGender());
        System.out.println("Email is: " + subarna.getEmail());
    }
}