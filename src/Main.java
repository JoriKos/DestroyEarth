import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] vragenGoed = new String[10];
        String[] vragenSlecht = new String[10];
        boolean run = true;
        Scanner s = new Scanner(System.in);
        String antwoord;
        int score = 0;
        vragenGoed[0] = "";
        vragenGoed[1] = "";
        vragenGoed[2] = "";
        vragenGoed[3] = "";
        vragenGoed[4] = "";
        vragenGoed[5] = "";
        vragenGoed[6] = "";
        vragenGoed[7] = "";
        vragenGoed[8] = "";
        vragenGoed[9] = "";


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
                "\n \n Welkom bij de quiz. Antwoord de volgende vragen om te kijken of je weet wat goed is voor het milieu" + "\n Type 'meer' of 'minder'");


        while(run){
            for (int i = 0; i < vragenGoed.length; i++) {
                System.out.println("Kies één van de twee:");
                System.out.println(vragenGoed[i]);
                System.out.println();
                antwoord = s.nextLine();
                antwoord = antwoord.toLowerCase();
                if(i >= 0 && i <= 3){
                    if(antwoord.equals("meer")){
                        score = score + 1;
                    } else{
                        score = score - 1;
                    }

                } else if(i == 4){
                    if(antwoord.equals("minder")){
                        score = score + 1;
                    } else{
                        score = score - 1;
                    }

                } else if(i == 5){
                    if(antwoord.equals("meer")){
                        score = score + 1;
                    } else{
                        score = score - 1;
                    }

                } else if(i == 6){
                    if(antwoord.equals("minder")){
                        score = score + 1;
                    } else{
                        score = score - 1;
                    }

                } else if(i == 7){
                    if(antwoord.equals("meer")){
                        score = score + 1;
                    } else{
                        score = score - 1;
                    }

                } else if(i >= 8 && i <= 9){
                    if(antwoord.equals("minder")){
                        score = score + 1;
                    } else{
                        score = score - 1;
                    }

                } else if(i == 10){
                    if(antwoord.equals("meer")){
                        score = score + 1;
                    } else{
                        score = score - 1;
                    }

                }

            }
            run = false;
        }
        if(score >= 7 && score <= 10){
            System.out.println("Je bent goed geïnformeerd over het milieu");
        } else if(score <=7 && score >= 5){
            System.out.println("Je bent redelijk goed geïnformeerd over het milieu");
        } else{
            System.out.println("Je bent niet goed geïnformeerd over het milieu");
        }
    }
}