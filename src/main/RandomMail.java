package main;

import java.util.ArrayList;
import java.util.Random;

public class RandomMail {
    public static void main(String[] args) {
        // Initialisation du dictionnaire d'adresse-mails
        String tabMail[] = {"@free.fr", "@orange.fr", "@gmail.com", "@outlook.fr", "@laposte.net"};

        // Génération d'un nombre pour choisir le prestataire
        int rnd = new Random().nextInt(tabMail.length);

        // Initialisation de l'alphabet pour générer les noms aléatoirement
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 7;

        // Génération du premier nom aléatoire
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();

        // Initialisation du tableau ou se trouverons toutes les adresses mails générées
        String tabRandMail[] = new String[100];

        // Boucle pour assembler, générer et entrer les adresses mails dans le tableau
        for (int e = 0; e < 100; e++) {
            tabRandMail[e] = (randomString + tabMail[rnd]);
            sb.delete(0, 7);
            // Génération aléatoire d'un autre nom aléatoire
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(alphabet.length());
                char randomChar = alphabet.charAt(index);
                sb.append(randomChar);
            }
            randomString = sb.toString();

            // Génération d'un nouveaux nombre pour choisir le prestataire
            rnd = new Random().nextInt(tabMail.length);
        }

        // Initialisation des variables pour compter
        int free = 0;
        int orange = 0;
        int gmail = 0;
        int outlook = 0;
        int laposte = 0;

        // Boucle (foreach) pour compter les données
        for (String value : tabRandMail) {
            if (value.contains(tabMail[0])) {
                free++;
            } else if (value.contains(tabMail[1])) {
                orange++;
            } else if (value.contains(tabMail[2])) {
                gmail++;
            } else if (value.contains(tabMail[3])) {
                outlook++;
            } else if (value.contains(tabMail[4])) {
                laposte++;
            }
        }

        // Affichage des adresses mails
        System.out.println("Liste des adresses mail générés aléatoirement :");
        for (String s : tabRandMail) {
            System.out.println(s);
        }

        // Affichage des données finales relatives au prestataires
        System.out.println("Données relative au prestataires :");
        System.out.println("Free : " + ((free * 100) / tabRandMail.length) + "%");
        System.out.println("Orange : " + ((orange * 100) / tabRandMail.length) + "%");
        System.out.println("Gmail : " + ((gmail * 100) / tabRandMail.length) + "%");
        System.out.println("Outlook : " + ((outlook * 100) / tabRandMail.length) + "%");
        System.out.println("Laposte : " + ((laposte * 100) / tabRandMail.length) + "%");
    }
}
