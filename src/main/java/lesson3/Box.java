package lesson3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private T[] fruitBox;

    public Box(T[] fruitBox) {
        this.fruitBox = fruitBox;
    }

    public float getWeight() {
        float sumWeight = 0;
        for (T t: getFruitBox()) {
            float value = t.getFruitWeight();
            sumWeight = fruitBox.length * value;
        }
        return sumWeight;
    }


    public boolean compare(Box<? extends Fruit> another) {
        if (this.getWeight() == another.getWeight()) return true;
        return false;
    }

    public void toAnotherBox(Box<T> another) {
        System.out.println("Вес текущей коробки до пересыпания " + another.getWeight());
        System.out.println("Вес другой коробки до пересыпания " + this.getWeight());
        if (this.getFruitBox().length < another.getFruitBox().length) {
            for (int i =0; i < this.getFruitBox().length; i++) {
                another.getFruitBox()[i] = this.getFruitBox()[i];
                another.getFruitBox()[i] = null;
            }
        }
        System.out.println("Вес текущей коробки после пересыпания " + this.getWeight());
        //System.out.println("Вес другой коробки после пересыпания " + another.getWeight());


    }

    public T[] getFruitBox() {
        return fruitBox;
    }


}
