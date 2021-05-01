package thirdpackage;

public class LoopPractice {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("I love Java");

        }

        for (int i = 0; i < 10; i++) {
            System.out.println("I love Java" + i);

        }

        for (int i = 10; i > -5; i--) {
            System.out.println("I love Python" + i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Shahlla" + i);

            for (int j = 0; j < 2; j++) {
                System.out.println("Kamal");

                for (int k = 0; k < 2; k++) {
                    System.out.println("Zahra" + k);
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("java");
            } else if (i == 6) {
                System.out.println("selenium");
            } else {
                System.out.println("python");
            }
        }

        String country1 = "USA";
        String country2 = "USA";

        if (country1.equals(country2)) {
            System.out.println("countries are the same");
        } else {
            System.out.println("countries are different");
        }
    }
}



