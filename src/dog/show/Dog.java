package dog.show;

import java.util.ArrayList;

public class Dog implements Comparable<Dog> {

    private String name;
    private String breed;
    private ArrayList<Integer> scores;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.scores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setBreed(String breed) {
        this.breed = breed;
        return breed;
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public double getAverageScore() {
        if (scores.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    public String getNameAndBreed() {
        return name + " (" + breed + ")";
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + '}';
    }

    @Override
    public int compareTo(Dog dog) {
        if (this.getAverageScore() > dog.getAverageScore()) {
            return 1;
        } else if (this.getAverageScore() < dog.getAverageScore()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.addScore(8);
        dog.addScore(9);
        dog.addScore(10);
        System.out.println(dog);
        System.out.println(dog.getAverageScore());
    }
}
