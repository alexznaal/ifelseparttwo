public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("tsk1");

        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear > 2014) {
            System.out.println("Установите версию приложения для Android по ссылке");

        } else if(clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear > 2014) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        //tsk3
        System.out.println("tsk3");

        int year = 2021;
        if ((year % 4) == 0 || (year % 100) == 0 && (year % 100) == 0) {
            System.out.println("Год является високосным");

        } else {
            System.out.println("Год не является високосным");
        }

        //task4
        System.out.println("task4");

        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 19 && deliveryDistance < 61) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 59 && deliveryDistance < 101) {
            System.out.println("Потребуется дней: 3");
        }

        //task5
        System.out.println("task5");

        int monthOfYear = 4;

        switch (monthOfYear) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                break;
        }
    }
}