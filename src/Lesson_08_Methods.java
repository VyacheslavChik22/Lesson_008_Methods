import java.util.Arrays;

public class Lesson_08_Methods {
// ������� 1
    /*
    ���������� �����, ������� �������� � �������� ��������� ���, � ����� ���������, �������� �� �� ����������,
    � ������� ��������� � �������.
     */


    public static void �alculationLeapYears(int actualYear) {
        if (actualYear % 4 == 0 && actualYear % 100 != 0 || actualYear / 400 == 0) {
            System.out.println(actualYear + " ��� �������� ����������.");
        } else {
            System.out.println(actualYear + " ��� �� �������� ����������.");
        }
    }

    // ������� 2
    /*
    �������� �����, ���� �������� ��� ���������: ��� ������������ ������� (��) ( 0 � iOS ��� 1 � Android�)
    � ��� ������� ����������.
     */
    public static void installationOS(int iosOS, int androidOS) {
        int currentYear = 2020;
        if (iosOS == 0 && currentYear >= 2022) {
            System.out.println("���������� ������ ���������� ��� IOS �� ������");
        } else if (iosOS == 0 && currentYear < 2022) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        }
        if (androidOS == 1 && currentYear >= 2022) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        }
        if (androidOS == 1 && currentYear < 2022) {
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        }

    }

// ������� 3
    /*
   ���� ������ �������� �����, ������� �� ���� ��������� ��������� � ���������� ��������
    ���������� ���� �������� ���������� �����.
     */


    public static void deliveryTimeCalculation(int deDistance, int deTime) {
        if (deDistance > 0) {
            if (deDistance <= 20) {
                System.out.println("��� �������� ����� ���������� ����� ����������� " + deTime + " ����.");
            } else if (deDistance > 20 && deDistance < 60) {
                System.out.println("��� �������� ����� ���������� ����� ����������� " + (deTime + 1) + " ��� ");
            } else {
                System.out.println("��� �������� ����� ���������� ����� ����������� " + (deTime + 2) + " ��� ");
            }
        }
        if (deDistance < 0) {
            System.out.println("������� ��������� ���������� �� ������ ��������");
        }
    }

// ������� 4

    /*�������� �����, ������� � ���� ��������� ��������� ��������������� ������.
� ������� ����� ���������, ��� � ������ ��� ������, � �������� � ������� ��������� �� ����.
���� ����� ������, ����� �������� ����� �� ��������� �������� � ������� ��������� � ����������� �����,
������ � ���������, ����� ������ ������ ������������. ����� ����� �� �������� ���������� ������.
*/
    public static void arrayCheck(String[] arrSortArrays) {
        System.out.println(Arrays.toString(arrSortArrays));
        outterLoop:
        for (int i = 0; i < arrSortArrays.length; i++) {   // ������� ����� ��� �������� �����: outterLoop:
            for (int j = i + 1; j < arrSortArrays.length; j++) {
                if (arrSortArrays[j] == arrSortArrays[i]) {
                    System.out.println(arrSortArrays[j] + " - ������ ������������� �������");
                    break outterLoop;                                // ���������� ��������� �����, ������� �� �����.
                }
            }

        }
    }

// ������� 5
     /*
    �������� �����, ������� �������� �� ���� ������ � ������������ ��� ��� �������� � �������� �������.
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
        System.out.println("*** ������� 1 \n");

        int year = 1900;                      // ����� ����� ��� � ������ ���������� �� ��!
        �alculationLeapYears(year);

//2
        System.out.println("\n*** ������� 2 \n");

        int phoneIOS = 0;
        int phoneAndroid = 1;
        installationOS(phoneIOS, phoneAndroid);

//3
        System.out.println("\n*** ������� 3 \n");

        int deliveryDistance = 75; // ��������� �� �������
        int deliveryTime = 1;      // ����� ��������
        deliveryTimeCalculation(deliveryDistance, deliveryTime);

//4
        System.out.println("\n*** ������� 4 \n");

        String[] arrAlphabet = {"z", "g", "f", "s", "s", "t", "y", "j", "s", "a", "e", "r", "y", "m", "y", "u"};
        Arrays.sort(arrAlphabet);
        arrayCheck(arrAlphabet);

//5
        System.out.println("\n*** ������� 5 \n");

        int[] arrNum = {3,2,1,6,5};
        expendArr(arrNum);
    }

}
