import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] vragenGoed = new String[10]; // initialized variabelen
        String[] vragenSlecht = new String[10];
        boolean run = true;
        boolean spelcheck;
        Scanner s = new Scanner(System.in);
        String antwoord;
        int score = 0;
        //Zet vragen in een array
        vragenGoed[0] = "\n Moet er meer of minder Nucleaire energie worden gebruikt? "; //vraag 1, meer
        vragenGoed[1] = "\n Moet er meer of minder vlees gegeten worden? "; //vraag 2, minder
        vragenGoed[2] = "\n Moet er meer of minder zonnepanelen worden geplaatst of daken? ";//vraag 3, meer
        vragenGoed[3] = "\n Moet er meer of minder Productie van vlees komen? ";//vraag 4, minder
        vragenGoed[4] = "\n Moet er meer of minder geïnvesteerd worden in biomassa? ";//vraag 5, meer
        vragenGoed[5] = "\n Moet er meer of minder uitlaat gassen van fabrieken in de lucht? ";//vraag 6, minder
        vragenGoed[6] = "\n Moet er meer of minder afval worden gescheden? ";//vraag 7, meer
        vragenGoed[7] = "\n Moet er meer of minder fossiele brandstoffen worden verbrand? ";//vraag 8, minder
        vragenGoed[8] = "\n Moet er meer of minder afval worden verbrand? "; //vraag 9, minder
        vragenGoed[9] = "\n Moet er meer of minder herbruikbare energie worden gebruikt? ";//vraag 10, meer


        System.out.println(" .----------------.  .----------------.  .----------------.  .----------------. \n" +
                "| .--------------. || .--------------. || .--------------. || .--------------. |\n" +
                "| |    ___       | || | _____  _____ | || |     _____    | || |   ________   | |\n" +
                "| |  .'   '.     | || ||_   _||_   _|| || |    |_   _|   | || |  |  __   _|  | |\n" +
                "| | /  .-.  \\    | || |  | |    | |  | || |      | |     | || |  |_/  / /    | |\n" +
                "| | | |   | |    | || |  | '    ' |  | || |      | |     | || |     .'.' _   | |\n" +
                "| | \\  `-'  \\_   | || |   \\ `--' /   | || |     _| |_    | || |   _/ /__/ |  | |\n" +
                "| |  `.___.\\__|  | || |    `.__.'    | || |    |_____|   | || |  |________|  | |\n" +
                "| |              | || |              | || |              | || |              | |\n" +
                "| '--------------' || '--------------' || '--------------' || '--------------' |\n" +
                " '----------------'  '----------------'  '----------------'  '----------------' " +
                "\n \n Welkom bij de quiz. Antwoord de volgende vragen om te kijken of je weet wat goed is voor het milieu" + "\n Type 'meer' of 'minder' (check je spelling) \n");

        while(run){
            for (int i = 0; i < vragenGoed.length; i++) { // For loop om vragen te stellen
                System.out.println(vragenGoed[i]);
                spelcheck = true;
                antwoord = "hoi";
                while(spelcheck){
                    antwoord = s.nextLine();
                    antwoord = antwoord.toLowerCase(); // Kijkt naar antwoord en maakt het lowercase
                    if(antwoord.contains("meer") || antwoord.contains("minder")) {
                        spelcheck = false;
                    }else{
                        System.out.println("Typ 'meer' of 'minder'");
                            spelcheck = true;
                        }

                    }
                if(i == 0 || i == 2 || i == 3 || i == 6 || i == 9){
                    if(antwoord.contains("meer")){ // if statement om antwoord te checken
                        score = score + 1;
                        System.out.println("Je antwoord was goed je krijgt 1 punt");
                        System.out.println("Je score is nu " + score);

                    } else{
                        score = score - 1;
                        System.out.println("Je antwoord was fout er gaat 1 punt af");
                        System.out.println("Je score is nu " + score);
                    }

                } else{
                    if(antwoord.equals("minder")){
                        score = score + 1;
                        System.out.println("Je antwoord was goed je krijgt 1 punt");
                        System.out.println("Je score is nu " + score);

                    } else{
                        score = score - 1;
                        System.out.println("Je antwoord was fout er gaat 1 punt af");
                        System.out.println("Je score is nu " + score);
                    }}



            }
            run = false; // sluit programma af nadat alle vragen zijn gesteld en beantwoord
        }
        if(score >= 7 && score <= 10){ // checkt je score en geeft aan of je goed geïnformeerd bent
            System.out.println("\n Je bent goed geïnformeerd over het milieu \n Je score is " + score);
        } else if(score <=7 && score >= 5){
            System.out.println("\n Je bent redelijk goed geïnformeerd over het milieu \n Je score is " + score);
        } else{
            System.out.println("\n Je bent niet goed geïnformeerd over het milieu \n Je score is " + score);
        }
    }
}