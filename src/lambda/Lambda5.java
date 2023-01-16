package lambda;

public class Lambda5 {
    interface ArgumentI {
        String function(String str);
    }

    // static function with interface type variable as a parameter
    static String someFunc(ArgumentI arg, String str) {
        return arg.function(str);
    }

    public static void main(String[] args) {
        // providing lambda as an argument to someFunc function
        String after = someFunc((str) -> {
            char[] chars = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    chars[i]++;
                }
            }
            return String.valueOf(chars);
        }, "Ala has a cat!");

        System.out.println(after); // print Blb iat b dau!

        // declare interface type variable and initialize (first assignment) with function
        ArgumentI iFunction = str -> {
            char[] chars = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    chars[i]--;
                }
            }
            return String.valueOf(chars);
        };

        after = someFunc(iFunction, after);
        System.out.println(after); // print Ala has a cat!

        // throwing NullPointerException, can not use interface variable type without assignment
        try {
            ArgumentI iFunctionEmpty = null;
            someFunc(iFunctionEmpty, "Empty function");
        } catch (Exception e) {
            System.out.println("Catch");
        }
        System.out.println("Still working");
    }
}
