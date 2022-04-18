import java.util.Arrays;

public class Lesson_08_Methods {
// Задание 1
    /*
    Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным,
    и выводит результат в консоль.
     */


    public static void сalculationLeapYears(int actualYear) {
        if (actualYear % 4 == 0 && actualYear % 100 != 0 || actualYear / 400 == 0) {
            System.out.println(actualYear + " год является високосным.");
        } else {
            System.out.println(actualYear + " год не является високосным.");
        }
    }

    // Задание 2
    /*
    Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android )
    и год выпуска устройства.
     */
    public static void installationOS(int iosOS, int androidOS) {
        int currentYear = 2020;
        if (iosOS == 0 && currentYear >= 2022) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (iosOS == 0 && currentYear < 2022) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (androidOS == 1 && currentYear >= 2022) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (androidOS == 1 && currentYear < 2022) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

// Задание 3
    /*
   Наша задача написать метод, который на вход принимает дистанцию и возвращает итоговое
    количество дней доставки банковской карты.
     */


    public static void deliveryTimeCalculation(int deDistance, int deTime) {
        if (deDistance > 0) {
            if (deDistance <= 20) {
                System.out.println("Для доставки вашей банковской карты потребуется " + deTime + " день.");
            } else if (deDistance > 20 && deDistance < 60) {
                System.out.println("Для доставки вашей банковской карты потребуется " + (deTime + 1) + " дня ");
            } else {
                System.out.println("Для доставки вашей банковской карты потребуется " + (deTime + 2) + " дня ");
            }
        }
        if (deDistance < 0) {
            System.out.println("Введите корректно расстояние до адреса доставки");
        }
    }

// Задание 4

    /*Напишите метод, который в виде параметра принимает отсортированную строку.
С помощью цикла проверьте, что в строке нет дублей, и выведите в консоль сообщение об этом.
Если дубль найден, нужно прервать поиск по остальным символам и вывести сообщение о присутствии дубля,
причем с указанием, какой именно символ задублирован. Затем сразу же прервать выполнение метода.
*/
    public static void arrayCheck(String[] arrSortArrays) {
        System.out.println(Arrays.toString(arrSortArrays));
        outterLoop:
        for (int i = 0; i < arrSortArrays.length; i++) {   // создаем метку для внешнего цикла: outterLoop:
            for (int j = i + 1; j < arrSortArrays.length; j++) {
                if (arrSortArrays[j] == arrSortArrays[i]) {
                    System.out.println(arrSortArrays[j] + " - Первый повторяющийся элемент");
                    break outterLoop;                                // Прекращаем дальнеший поиск, выходим по метке.
                }
            }

        }
    }

// Задание 5
     /*
    Напишите метод, который получает на вход массив и переставляет все его элементы в обратном порядке.
     */
    public static void expendArr(int[]numArr) {
        System.out.print(Arrays.toString(numArr));
        System.out.println("\n");
        for (int i = numArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numArr[i] + " ");
            } else {
                System.out.print(numArr[i] + ", ");
            }
        }
    }


    public static void main(String[] args) {
// 1
        System.out.println("*** Задание 1 \n");

        int year = 1900;                      // Пишем любой год и узнаем високосный ли он!
        сalculationLeapYears(year);

//2
        System.out.println("\n*** Задание 2 \n");

        int phoneIOS = 0;
        int phoneAndroid = 1;
        installationOS(phoneIOS, phoneAndroid);

//3
        System.out.println("\n*** Задание 3 \n");

        int deliveryDistance = 75; // Дистанция до клиента
        int deliveryTime = 1;      // Время доставки
        deliveryTimeCalculation(deliveryDistance, deliveryTime);

//4
        System.out.println("\n*** Задание 4 \n");

        String[] arrAlphabet = {"z", "g", "f", "s", "s", "t", "y", "j", "s", "a", "e", "r", "y", "m", "y", "u"};
        Arrays.sort(arrAlphabet);
        arrayCheck(arrAlphabet);

//5
        System.out.println("\n*** Задание 5 \n");

        int[] arrNum = {3,2,1,6,5};
        expendArr(arrNum);
    }

}
