import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tangentbord = new Scanner(System.in);

        Tamagochi tamagochi = new Tamagochi();
        tamagochi.name = "Bob";

        boolean startGame = false;

        System.out.println("Tryck 1 för att starta spelet");

        String input1 = tangentbord.nextLine();

        if (input1.equals("1")) {
            startGame = true;
            System.out.println("Spelet har börjat! Du kontrollerar " + tamagochi.name);
        }

        while (startGame) {
            System.out.println("\nVad vill du göra?");
            System.out.println("1. Lära ett nytt ord");
            System.out.println("2. Mata Tamagotchi");
            System.out.println("3. Säg hej");
            System.out.println("4. Visa status");
            System.out.println("5. Gör inget");
            System.out.println("6. Avsluta");

            String choice = tangentbord.nextLine();

            switch (choice)
            {
                case "1":
                    System.out.println("Vilket ord vill du lära " + tamagochi.name + "?");
                    String wordToTeach = tangentbord.nextLine();
                    tamagochi.teachWord(wordToTeach);
                    tamagochi.tick();
                    break;

                case "2":
                    tamagochi.feed();
                    tamagochi.tick();
                    break;

                case "3":
                    tamagochi.hi();
                    tamagochi.tick();
                    break;

                case "4":
                    tamagochi.printStats();
                    tamagochi.tick();
                    break;

                case "5":
                    System.out.println("Gör inget");
                    tamagochi.tick();
                    break;

                case "6":
                    System.out.println("Spelet avslutas.");
                    startGame = false;
                    break;

                default:
                    System.out.println("Ogiltigt val, försök igen.");
                    break;
            }

            if (tamagochi.hunger == 10 || tamagochi.boredom == 10)
            {
                tamagochi.isAlive = false;
            }

            if(!tamagochi.isAlive)
            {
                startGame = false;
                System.out.println(tamagochi.name + " har dött");
            }
        }

        tangentbord.close();
    }
}
