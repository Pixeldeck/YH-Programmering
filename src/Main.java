import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String again;


        do {  // Main


            System.out.println("Vad vill du göra?");
            System.out.println("1. Addera två tal.");
            System.out.println("2. Räkna bokstäver i en sträng.");
            System.out.println("3. Spegelvänd en sträng.");
            System.out.println("4. Summera alla tal i en sträng.");

            System.out.println("Skriv ditt val: ");

            String val1 = sc1.nextLine();


            if (val1.equals("1")) {

                System.out.println("Skriv in första siffran:");
                double nummer1 = sc1.nextDouble();
                System.out.println("Skriv in den andra siffran");
                double nummer2 = sc1.nextDouble();


                double plus = plusFunk(nummer1, nummer2);
                System.out.println("Resultatet: " + plus);

                again = sc1.nextLine();

            } else if (val1.equals("2")) {
                dubbletter(sc1);


            }


            System.out.println("Vill du se en tabell till? (j/n) ");
            again = sc1.nextLine();


        } while (again.equals("j"));
    }


    // Funktioner

    static double plusFunk(double nummer1, double nummer2) {
        double plus = nummer1 + nummer2;
        return plus;
    }

    private static void dubbletter(Scanner sc1) {
        sc1.nextLine();

        System.out.print("Ange ordet du vill leta i: ");
        String ord = sc1.nextLine();
        System.out.print("Ange bokstaven du vill leta efter: ");
        char bokstav = sc1.nextLine().charAt(0);

        int antal = 0;
        for (int i = 0; i < ord.length(); i++) {
            if (ord.charAt(i) == bokstav) {
                antal++;
            }


        }


    }

}



