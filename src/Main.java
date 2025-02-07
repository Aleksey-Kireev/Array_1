import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        ----- =====   Задание № 1   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 1   ===== -----");
        int[] arrayInt = new int[]{1, 2, 3};
        float[] arrayFloat = {1.57f, 7.654f, 9.986f};
        int size = 3;           // Задаем размер массива
        char[] arrayChar = new char[size];
        arrayChar[0] = 'a';
        arrayChar[1] = 'b';
        arrayChar[2] = 'c';
        System.out.println("----- Массивы инициализированы и заполнены -----");

//        ----- =====   Задание № 2   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 2   ===== -----");

//        Для тренировки применим разные методы вывода и проверки

        for (int i = 0; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1) {            //Проверка методом равентства
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");
        }
        for (int i = 0; i < arrayFloat.length; i++) {
            if (i != arrayFloat.length - 1) {          // проверка методом НЕравенства
                System.out.print(arrayFloat[i] + ", ");
            } else {
                System.out.println(arrayFloat[i]);
            }
        }
//        Для разнообразия использовал тернарный оператор
        String result;
        for (int i = 0; i < arrayChar.length; i++) {
            result = (i != arrayChar.length - 1) ? arrayChar[i] + ", " : (arrayChar[i] + "" + '\n');
            System.out.print(result);
        }

//        ----- =====   Задание № 3   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 3   ===== -----");

//        Для тренировки применим разные методы вывода и проверки

        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (i == 0) {            //Проверка методом равентства
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");
        }
        for (int i = arrayFloat.length - 1; i >= 0; i--) {
            if (i != 0) {          // проверка методом НЕравенства
                System.out.print(arrayFloat[i] + ", ");
            } else {
                System.out.println(arrayFloat[i]);
            }
        }
//        Для разнообразия использовал тернарный оператор

        for (int i = arrayChar.length - 1; i >= 0; i--) {
            result = (i != 0) ? arrayChar[i] + ", " : (arrayChar[i] + "" + '\n');
            System.out.print(result);
        }

//        ----- =====   Задание № 4   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 4   ===== -----");
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));


    }
}