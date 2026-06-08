public static void main(String[] args) {
    //1. Калькулятор возраста

    /*System.out.println("Please put your age:");

    Scanner console = new Scanner(System.in);

    if (console.hasNextInt()) {
        int age = console.nextInt();

        if (age < 0) {
            System.out.println("The age must be over from 0!");
        } else if (age > 100) {
            System.out.println("The age must be less than 100!");
        } else {
            if (age < 18) {
                System.out.println("You're not adult");
            } else
                System.out.println("You're adult");
        }
    }
    else
        System.out.println("Your age is not integer!");*/

    //2. Проверка чётности и знака

    /*System.out.println("Введите число:");

    Scanner console = new Scanner(System.in);

    if (console.hasNextInt()) {
        int number = console.nextInt();
        if (number == 0) {
            System.out.println("Введен ноль");
            System.out.println("Ноль - четное число");
        } else if (number > 0) {
            System.out.println("Введенное число: "+number+" - положительное");
            if (number % 2 == 0) {
                System.out.println("Введенное число четное");
            } else
                System.out.println("Введенное число нечетное");
        } else {
            System.out.println("Введенное число: "+number+" - отрицательное");
            if (number % 2 == 0) {
                System.out.println("Введенное число четное");
            } else
                System.out.println("Введенное число нечетное");
        }
    } else
        System.out.println("Введенное число - не целое!");
     */

    //3. Минимум из трех

    System.out.println("Введите три числа:");

    Scanner console = new Scanner(System.in);

    String s1 = console.next();
    String s2 = console.next();
    String s3 = console.next();

    boolean isValid1 = s1.matches("-?\\d+");
    boolean isValid2 = s2.matches("-?\\d+");
    boolean isValid3 = s3.matches("-?\\d+");

    if (isValid1 && isValid2 && isValid3) {
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        if (a < b && a < c) {
            System.out.println(a + " - минимальное число");
        } else if (b < a && b < c) {
            System.out.println(b + " - минимальное число");
        } else if (c < a && c < b) {
            System.out.println(c + " - минимальное число");
        } else if (a == b && a < c) {
            System.out.println(a + " и " + b + " равны и минимальны");
        } else if (a == c && a < b) {
            System.out.println(a + " и " + c + " равны и минимальны");
        } else if (b < a) {
            System.out.println(b + " и " + c + " равны и минимальны");
        } else {
            System.out.println("Все числа равны между собой");
        }
    }
    else {
        System.out.println("Ошибка: нужно ввести три целых числа!");
    }
}