package Classes;

public class Cat4 {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + lastName;
        this.fullName = fullName;
    }

    public String getName() {
        return fullName;
    }
    //implement this method that it sets up fullName of class field
}



