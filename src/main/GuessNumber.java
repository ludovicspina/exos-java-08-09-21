package main;

import java.time.LocalTime;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Génération du nombre à deviner
        double numberToGuess = Math.round(Math.random() * 1000);
        System.out.print("L'ordinateur a choisit un nombre, essaie de le deviner :");

        // Initialisation de la récuperation d'entrées utilisateur
        String userInput;
        Scanner sc;
        sc = new Scanner(System.in);
        userInput = sc.nextLine();

        // Initialisation du timer
        LocalTime startTime;
        LocalTime endTime;
        startTime = LocalTime.now();
        int startSeconds = startTime.toSecondOfDay();
        double userNumber = Double.parseDouble(userInput);
        int score = 1;

        // Comparaison entre le nombre de l'utilsateur et celui à trouver et comptage des coups
        while (userNumber != numberToGuess) {
            // Incrémentation du score
            score++;
            // Comparaison des nombres
            if (userNumber > numberToGuess) {
                System.out.print("C'est moins!");
            } else {
                System.out.print("C'est plus!");
            }
            // Récupèration de l'entrée utilisateur
            sc = new Scanner(System.in);
            userInput = sc.nextLine();
            userNumber = Double.parseDouble(userInput);
        }

        // Fin du compteur de temps
        endTime = LocalTime.now();

        // Calcul de la durée en convertissant en seconde
        int endSeconds = endTime.toSecondOfDay() - startTime.toSecondOfDay();
        System.out.print("Bravo! Tu as trouvé le nombre en " + score + " coups et en " + endSeconds + " secondes.");
    }
}
