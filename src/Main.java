public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {

        System.out.println("ЗАДАЧА 1");
        int[] number = new int[3];
        double[] weight = {1.57, 7.654, 9.986};
        int[] month = new int[12];
        }


    public static void task2() {

        System.out.println("ЗАДАЧА 2");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.print(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
        System.out.println();
        double[] weight = {1.57, 7.654, 9.986};
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.print(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        System.out.println();
        int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < month.length; i++) {
            if (i == month.length - 1) {
                System.out.print(month[i]);
                break;
            }
            System.out.print(month[i] + ", ");
        }
    }

    public static void task3() {

        System.out.println("ЗАДАЧА 3");
}



