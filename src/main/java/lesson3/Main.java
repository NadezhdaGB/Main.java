package lesson3;

public class Main {

    public static void main(String[] args) {
        String[] array = {"2", "5", "33", "48", "97", "3"}; //массив, в котором надо поменять местами элементы n и m
        //n позиция первого элемента
        //m позиция второго элемента

        Apple[] apples = new Apple[3];
        Orange[] oranges = new Orange[4];
        Apple[] apples1 = new Apple[5];
        Orange[] oranges1 = new Orange[5];



        apples[0] = new Apple(1.0f);
        apples[1] = new Apple(1.0f);
        apples[2] = new Apple(1.0f);
        oranges[0] = new Orange(1.5f);
        oranges[1] = new Orange(1.5f);
        oranges[2] = new Orange(1.5f);
        oranges[3] = new Orange(1.5f);

        apples1[0] = new Apple(0.0f);
        apples1[1] = new Apple(0.0f);
        apples1[2] = new Apple(0.0f);
        apples1[3] = new Apple(0.0f);
        apples1[4] = new Apple(0.0f);

        oranges1[0] = new Orange(0.0f);
        oranges1[1] = new Orange(0.0f);
        oranges1[2] = new Orange(0.0f);
        oranges1[3] = new Orange(0.0f);
        oranges1[4] = new Orange(0.0f);

        Box<Apple> appleBox = new Box<>(apples);
        Box<Orange> orangeBox = new Box<>(oranges);

        Box<Apple> anotherAppleBox = new Box<>(apples1);
        Box<Orange> anotherOrangeBox = new Box<>(oranges1);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));

        appleBox.toAnotherBox(anotherAppleBox);
        //appleBox.toAnotherBox(anotherOrangeBox); тип не подходит

        changeElements(array, 0, 3);

    }

    public static void changeElements(String[] array, int n, int m) {
        String valueN = array[n];
        String valueM = array[m];
        array[n] = valueM;
        array[m] = valueN;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
