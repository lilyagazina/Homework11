
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        int year = 2067;
        paymentHighYear(year);
    }

    public static void paymentHighYear(int year) {
        if ((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0)){
            System.out.println( year + " год является високосным");
        } else {
            System.out.println( year + " год не является високосным");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int year1 = 2010;
        appUpdate(clientOS, year1);
    }
    public static void appUpdate( int clientOS, int year1) {
        int yearReleasePhone = 2015;
        if (clientOS == 0 && year1 < yearReleasePhone) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year1 < yearReleasePhone) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && year1 >= yearReleasePhone) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year1 >= yearReleasePhone) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 85;
        int days = numberDeliveryDays(deliveryDistance);
        if (days > 3) {
            System.out.println("Доставки нет");
        }else {
            System.out.println("Потребуется дней: " + days);
        }
    }
    public static int numberDeliveryDays(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance > 20) {
            days ++;
        }
        if (deliveryDistance > 60) {
            days ++;
        }
        if (deliveryDistance > 100) {
            days ++;
        }
        return days;
    }
}
