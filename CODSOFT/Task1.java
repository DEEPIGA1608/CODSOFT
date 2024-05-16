import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + minRange + " and " + maxRange + ". Can you guess it?");

        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = minRange + (int)(Math.random() * ((maxRange - minRange) + 1));
            int attempts = 0;
            boolean guessedCorrectly = false;

            while (!guessedCorrectly && attempts < attemptsLimit) {
                System.out.print("Enter your guess (between " + minRange + " and " + maxRange + "): ");
                int guess = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                attempts++;

                if (guess < minRange || guess > maxRange) {
                    System.out.println("Your guess is out of range. Please enter a number between " + minRange + " and " + maxRange + ".");
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += attempts;
                    guessedCorrectly = true;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + randomNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.nextLine().trim().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }

        System.out.println("Your total score is: " + score);
        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
