package dog.show;

public class Person {

    private String name;
    private String email;
    private String phone;

    public Person() {}

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public String setPhone(String phone) {
        this.phone = phone;
        return phone;
    }

}
