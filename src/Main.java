import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Условный оператор 2

// Задача 1
        int clientOS = 2; // Операционная система клиента

        if (clientOS == 0) {
            System.out.println("Установите верисю приложения для iOS.");
        }
        else if (clientOS == 1){
            System.out.println("Установите версию приложения для Andorid.");
        }
        else {
            System.out.println("Неизвестная операционная система.");
        }
// Задача 2
        int clientDeviceYear = 2015; // год выпуска устройства
        int newClientOS = 0; // Операционная система клиента

        if (newClientOS == 0) {
            if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");}
            else {
                System.out.println("Установите верисю приложения для iOS.");}
            }
        else if (newClientOS == 1){
            if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");}
            else {
                System.out.println("Установите версию приложения для Andorid.");
            }
        }
        else {
            System.out.println("Неизвестная операционная система.");
        }

// Задача 3
        int year = 2008; // Год

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год високосный.");
        }
        else {
            System.out.println("Год не является високосным.");
        }

// Задача 4
        int deliveryDistance = 95; // Дистанция доставки 95 км

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 день.");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 дня.");
        }
        else if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: 3 дня.");
        }
        else {
            System.out.println("Доставка невозможна");
        }

// Задача 5
        int monthNumber = 12; // Номер месяца

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
    }
}