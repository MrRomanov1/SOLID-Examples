package single_responsibility_principle.incorrect;

public class Account {
    public String firstName;
    public String lastName;
    public int id;
    public String email;

    public Account(String firstName, String lastName, int id, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.email = validateEmail(email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String validateEmail(String email) {
        //validation code goes here
        return email;
    }
}
