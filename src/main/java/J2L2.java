public class J2L2 {
    public static void main(String[] args) {

        String[][] array = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}

        };

        try {
            try {
                int result = method(array);
                System.out.println(result);
            } catch (MyArraySizeException1 e) {
                System.out.println("Размер массива превышен!");
            }
        } catch (MyArrayDataException1 e) {
            System.out.println("Неправильное значение элемента массива!");
            System.out.println("Ошибка в ячейке: " + (e.i + 1) + "x" + (e.j + 1));
        }
    }

    public static int method(String[][] array) throws MyArraySizeException1, MyArrayDataException1 {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException1();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException1();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException1(i, j);
                }
            }
        }
        return count;
    }
}
