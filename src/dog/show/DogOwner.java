package dog.show;

import java.util.ArrayList;

public class DogOwner extends Person {

    private ArrayList<Dog> dogs;

    public DogOwner(String name, String email, String phone) {
        super(name, email, phone);
        this.dogs = new ArrayList<>();
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public String getDogList() {
        String dogList = "";
        for (Dog dog : dogs) {
            dogList += dog.getNameAndBreed() + " ";
        }
        return dogList;
    }

    @Override
    public String toString() {
        return "DogOwner{" + "name=" + getName() + ", email=" + getEmail() + ", phone=" + getPhone() + '}';
    }

    public String getOwnerDetails() {
        return getName() + " owns these dogs: " + getDogList();
    }

}
