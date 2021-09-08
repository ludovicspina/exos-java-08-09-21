package main;

public class Main {
    public static void main(String[] args) {
        String tab[] = {"mail@free.fr", "mail@free.fr", "mail@free.fr", "mail@gmail.fr", "mail@orange.fr", "mail@orange.fr", "mail@orange.fr", "mail@orange.fr", "mail@orange.fr", "mail@orange.fr"};
        int free = 0;
        int gmail = 0;
        int orange = 0;

        for (String element : tab
        ) {
            if (element.contains("@free.")) {
                free++;
            } else if (element.contains("@gmail.")) {
                gmail++;
            } else if (element.contains("@orange.")){
                orange++;
            }
        }

        System.out.println("free : " + ((free * 100) / tab.length) + "%");
        System.out.println("gmail : " + ((gmail * 100) / tab.length) + "%");
        System.out.println("orange : " + ((orange * 100) / tab.length) + "%");
    }
}
