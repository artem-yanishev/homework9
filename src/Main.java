public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int[] arr1 = {10000, 10500, 12300, 23400, 5000};
        int sum = 0;
        for (int index = 0; index < arr1.length; index++) {
            sum += arr1[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задача 2.");
        int[] arr2 = {10000, 10500, 12300, 23400, 5000};
        int max = arr2[0];
        for (final int current : arr2) {
            if (current > max) {
                max = current;
            }
        }
        int min = arr2[0];
        for (final int current : arr2) {
            if (current < min) {
                min = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println("Задача 3.");
        int[] arr3 = {10000, 10500, 12300, 23400, 5000};
        double averageAmount;
        sum = 0;
        for (int index = 0; index < arr3.length; index++) {
            sum += arr1[index];
        }
        averageAmount = sum / arr3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");
        System.out.println("Задача 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int start = 0;
        int end = reverseFullName.length - 1;
        while (start < end) {
            char result = reverseFullName[start];
            reverseFullName[start] = reverseFullName[end];
            reverseFullName[end] = result;
            start++;
            end--;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}