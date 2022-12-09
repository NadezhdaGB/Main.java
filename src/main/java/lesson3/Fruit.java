package lesson3;

public abstract class Fruit {
    private String name;
    float fruitWeight;

    public Fruit(String name, float fruitWeight) {
        this.name = name;
        this.fruitWeight = fruitWeight;
    }

    public String getName() {
        return name;
    }

    public float getFruitWeight() {
        return fruitWeight;
    }
}
