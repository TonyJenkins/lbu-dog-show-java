package dog.show;

public class Main {

    public static void main(String[] args) {

        Dog fido = new Dog("Fido", "Golden Retriever");
        Dog lassie = new Dog("Lassie", "Collie");

        DogOwner doris = new DogOwner("Doris Jones", "doris@outlook.com", "555-1234");

        doris.addDog(fido);
        doris.addDog(lassie);

        System.out.println(doris);
        System.out.println(doris.getOwnerDetails());
    }
}
