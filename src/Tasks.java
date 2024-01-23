public class Tasks {
    public static void task1(int a) {
        if (a == 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }


    }

    public static void task2(int a) {
        if (a > 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    public static void task3(int a) {
        if (a < 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    public static void task4(int a) {
        if (a >= 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    public static void task5(int a) {
        if (a <= 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    public static void task6(int a) {
        if (a != 0) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    public static void task7(Object a) {
        System.out.println(a == "test" ? "Вірно" : "Невірно");
    }

    public static void task8(Object a) {
        System.out.println(a == "1" ? "Вірно" : "Невірно");
    }
    public static void task9_1(boolean test) {
        if (test) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }
    public static void task9_2(boolean test) {
        System.out.println(test ? "Вірно" : "Невірно");
    }
    public static void task10_1(boolean test) {
        if (!test) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }
    public static void task10_2(boolean test) {
        System.out.println(!test ? "Вірно" : "Невірно");
    }
    public static void task11(int a) {
        if (a > 0 && a < 5) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }
    public static void task12(float a) {
        if (a == 0 || a == 2) {
            System.out.println(a+7);
        } else {
            System.out.println(a/10);
        }
    }
    public static void task13(int a, int b) {
        if (a <= 1 && b >= 3) {
            System.out.println(a+b);
        } else {
            System.out.println(a-b);
        }
    }
    public static void task14(int a, int b) {
        if (a > 2 && a < 11 || b >= 6 && b < 14) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }
    public static void task15(int num){
        switch (num){
            case (1):
               String result = "зима";
               break;
            case (2):
                result = "весна";
                break;
            case (3):
                result = "літо";
                break;
            case (4):
                result = "осінь";
                break;

        }
    }
    public static void task16(int a) {
        if (a > 0 && a < 11) {
            int result = 1;
        } else if (a > 10 && a < 21) {
            int result = 2;
        } else if (a > 20 && a < 32) {
            int result = 3;
        }else
            System.out.println("error");
    }
    public static void task17(int a) {
        if (a > 0 && a < 4) {
            String result = "зима";
        } else if (a > 3 && a < 7) {
            String result = "весна";
        } else if (a > 6 && a < 10) {
            String result = "літо";
        }else if (a > 9 && a < 13) {
            String result = "осінь";
        }else
            System.out.println("error");
    }
    public static void task18(String str) {
        var c = str.charAt(0);
        if (c == 'a') {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }


    public static void task20(String str) {
        var i1 = getIntFromString(str, 0);
        var i2 = getIntFromString(str, 1);

        if (i1 == 5) {
            System.out.println("Вірно");
        } else {
            System.out.println("Невірно");
        }
    }

    public static int getIntFromString(String str, int index) {
        var c = str.charAt(index);
        var s = String.valueOf(c);
        int i = Integer.parseInt(s);
        return i;
    }



}