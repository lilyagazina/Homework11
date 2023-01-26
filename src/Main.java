
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2067;
        paymentHighYear(year);
        System.out.println("Задача 2");
        int clientOS = 1;
        int year1 = 2013;
        appUpdate(clientOS, year1);
        System.out.println("Задача 3");
        int deliveryDistance = 185;
        numberDeliveryDays(deliveryDistance);
    }

    public static void paymentHighYear(int year) {
        if ((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0)){
            System.out.println( year + " год является високосным");
        } else {
            System.out.println( year + " год не является високосным");
        }
    }
    public static void appUpdate( int clientOS, int year1) {
        if (clientOS == 0 && year1 < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year1 < 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && year1 > 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year1 > 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void numberDeliveryDays(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance <= 20) {
            days += 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance <= 60) {
            days = days + 2;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance <= 100) {
            days = days + 3;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }
}
