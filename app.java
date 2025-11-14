import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*8===================================================8*\r\n" +  
                        "        _____           .__                  .__   \r\n" + 
                        "       /  _  \\    ____  |__|  _____  _____   |  |\r\n" + 
                        "      /  /_\\  \\  /    \\ |  | /     \\ \\__  \\  |  |\r\n" + 
                        "     /    |    \\|   |  \\|  ||  Y Y  \\ / __ \\_|  |__\r\n" + 
                        "     \\____|__  /|___|  /|__||__|_|  /(____  /|____/\r\n" + 
                        "             \\/      \\/           \\/      \\/\r\n" + 
                        "      __________                            .___\r\n" + 
                        "      \\______   \\_______   ____   ____    __| _/\r\n" + 
                        "       |    |  _/\\_  __ \\_/ __ \\_/ __ \\  / __ |\r\n" + 
                        "       |    |   \\ |  | \\/\\  ___/\\  ___/ / /_/ |\r\n" + 
                        "       |______  / |__|    \\___  >\\___  >\\____ |\r\n" + 
                        "             \\/              \\/     \\/      \\/\r\n" + 
                        "\r\n" +
                        "                  by The Missionaries                 \r\n" +
                        "*8===================================================8*\n");

        int opt;

        do {
            // Show menu
            System.out.println("                        [1] Play\n");
            System.out.println("                    [2] How to Play\n");
            System.out.println("                        [3] Exit\n");
            System.out.println("*8===================================================8*\n");

            System.out.print("Enter Your Selection: ");
            opt = sc.nextInt();


            switch (opt) {
                case 1:
                    play();
                    break;
                case 2:
                    rules();
                    break;
                case 3:
                    System.out.println("Thanks for playing!!");
                    break;
                default:
                    System.err.println("Invalid Input. Please choose 1-3.");
                    break;
            }

        } while (opt < 1 || opt > 3);

        sc.close();
    }

    public static void play() {
        System.out.println("Placeholder");
    }

    public static void rules() {
        System.out.println("Placeholder2");
    }
}
