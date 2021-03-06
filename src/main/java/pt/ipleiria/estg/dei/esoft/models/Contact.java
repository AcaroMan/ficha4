package pt.ipleiria.estg.dei.esoft.models;
import java.util.Date;
import java.util.Objects;

public class Contact {
    private String firstName;
    private String lastName;
    private Date birthday;
    private String phone;
    private String email;



    public Contact(String firstName, String phone) {
        this.firstName = firstName;
        this.phone = phone;
    }

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Contact(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public Contact(String firstName, String lastName, String phone, String email, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }

    // TODO Generate getters and setters

    public String getFirstName(){
        return firstName;
    }

    public  String getLastName(){
        return lastName;
    }

    public String getPhone(){
        return phone;
    }

    public  String getEmail(){
        return email;
    }

    public  Date getBirthday(){
        return birthday;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean matches(String term) {
        var termLowerCase = term.toLowerCase();
        if (termLowerCase.isBlank()) return false;

        if (this.firstName != null && this.firstName.toLowerCase().contains(term)) return true;
        if (this.lastName != null && this.lastName.toLowerCase().contains(term)) return true;
        if (this.phone != null && this.phone.toLowerCase().contains(term)) return true;
        if (this.email != null && this.email.toLowerCase().contains(term)) return true;
        if (this.birthday != null && this.birthday.toString().contains(term)) return true;

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthday, phone, email);
    }


}
