import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void isLeap(int year) {

        if (year < 1584) { /// Проверка что бв не был введен год меньше 1584 согласно условию задачи
            System.out.println("в данном году еще не было введено понятие о високосном годе");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { /// проверка на високосность, если условие выполнено выводим сообщение
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    } /// Method for the Task 1

    public static void installOsSystem(int clientOS, int clientDeviceYear) {

        String msg = clientDeviceYear <= 2015 ? "облегченную " : ""; //Тернарный оператор, немного сокращает объе кода

        if (clientOS == 0 || clientOS == 1) {
            String operationSystem = clientOS == 0 ? "iOS" : "Android"; //Тернарный оператор, немного сокращает объе кода
            System.out.println("Установите " + msg + "версию приложения для " + operationSystem + " по ссылке.");
        } else {
            System.out.println("Неизвестная ошибка");
        }
    } /// Method for the Task 2

    public static void countDays(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime++;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
    } //// Method for the Task 3

    public static void main(String[] args) {

        //// Task 1
        System.out.println("Task 1");

        Scanner read = new Scanner(System.in);

        System.out.print("Введите год для проверки - ");
        int year = read.nextInt();
        isLeap(year);

        //// Task 2
        System.out.println();
        System.out.println("Task 2");

        int clientOs = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        installOsSystem(clientOs, clientDeviceYear);

        //// Task 3
        System.out.println();
        System.out.println("Task 3");

        int deliveryDistance = 103;
        countDays(deliveryDistance);

        read.close();
    }
}