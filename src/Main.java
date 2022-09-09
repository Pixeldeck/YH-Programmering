import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String again;

        // Main

        do {



            System.out.println("Vad vill du göra?");
            System.out.println("1. Addera två tal.");
            System.out.println("2. Räkna bokstäver i en sträng.");
            System.out.println("3. Spegelvänd en sträng.");
            System.out.println("4. Summera alla tal i en sträng.");

            System.out.println("Skriv ditt val: ");

            String val = sc1.nextLine();


            if (val.equals("1")) {

                System.out.println("Skriv in första siffran:");
                double nummer1 = sc1.nextDouble();
                System.out.println("Skriv in den andra siffran");
                double nummer2 = sc1.nextDouble();


                double plus = plusFunk(nummer1, nummer2);
                System.out.println("Resultatet: " + plus);

                again = sc1.nextLine();

            } else if (val.equals("2")) {
                dubbletter(sc1);


            } else if (val.equals("3"))  {

                System.out.println("Skriv in ett ord: ");

                String input = sc1.nextLine();

                boolean answer = isPalindromReversedString(input);
                System.out.println("Ordet bakvänt: " + answer);
            }


            System.out.println("Vill du se menyn igen?  (j = ja, e = nej) (j/e) ");

            again = sc1.nextLine();


        } while (again.equals("j"));
    }


    // Funktioner

    static double plusFunk(double nummer1, double nummer2) {
        double plus = nummer1 + nummer2;
        return plus;
    }

    private static void dubbletter(Scanner userInput) {
        userInput.nextLine();

        System.out.print("Ange ordet du vill leta i: ");
        String ord = userInput.nextLine();
        System.out.print("Ange bokstaven du vill leta efter: ");
        char bokstav = userInput.nextLine().charAt(0);

        int antal = 0;
        for (int i = 0; i < ord.length(); i++)
        {
            if (ord.charAt(i) == bokstav)
            {
                antal++;
            }
        }

        System.out.format("Det finns %dx %s i ordet %s.\n", antal, bokstav, ord);






    }

    static boolean isPalindromReversedString(String input)  {
        StringBuilder builder = new StringBuilder();

        builder.append(input);
        String reversedString = builder.reverse().toString();

        return input.equals(reversedString);


    }


}


