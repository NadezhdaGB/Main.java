package lesson2;

public class Main {
    public static String[][] arrayCorrect = {{"2", "15", "3", "5"}, {"4", "8", "2", "20"}, {"3", "55", "1", "12"}, {"62", "6", "7", "9"}};
    public static String[][] arrayWrongSize = {{"3", "69"}, {"22", "1"}, {"5", "5"}, {"6", "42"}};
    public static String[][] arrayWrongData = {{"8", "15", "3", "5"}, {"4", "surprise", "2", "20"}, {"3", "55", "1", "12"}, {"62", "6", "7", "9"}};
    public static int sizeI = 4;
    public static int sizeJ = 4;

    public static void main(String[] args) {
        try {
            System.out.println("Сумма значений массива: " + changeToIntGetSumArray(arrayCorrect));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма значений массива: " + changeToIntGetSumArray(arrayWrongSize));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма значений массива: " + changeToIntGetSumArray(arrayWrongData));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkSize(String[][] array) throws MyArraySizeException {
        if (array.length != sizeI || array[0].length != sizeJ) throw new MyArraySizeException("Размер массива не 4х4.");
    }


    public static Integer changeToIntGetSumArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        checkSize(array);
        int sum = 0;
        int i = 0;
        int j = 0;
        try {
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[i].length; j++) {
                    sum = sum + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Некорректный формат данных в ячейке " + i + "," + j);
        }
        return sum;
    }
}
