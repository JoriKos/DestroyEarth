import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] vragenGoed = new String[10];
        String[] vragenSlecht = new String[10];
        boolean run = true;
        Scanner s = new Scanner(System.in);
        String antwoord;
        int score = 0;
        vragenGoed[0] = "Moet er meer of minder Nucleaire energie worden gebruikt? ";
        vragenGoed[1] = "Moet er meer of minder vlees gegeten worden? ";
        vragenGoed[2] = "Moet er meer of minder zonnepanelen worden geplaatst of daken? ";
        vragenGoed[3] = "Moet er meer of minder Productie van vlees komen? ";
        vragenGoed[4] = "Moet er meer of minder geïnvesteerd worden in biomassa? ";
        vragenGoed[5] = "Moet er meer of minder uitlaat gassen van fabrieken in de lucht? ";
        vragenGoed[6] = "Moet er meer of minder afval worden gescheden? ";
        vragenGoed[7] = "Moet er meer of minder fossiele brandstoffen worden verbrand? ";
        vragenGoed[8] = "Moet er meer of minder afval worden verbrand? ";
        vragenGoed[9] = "Moet er meer of minder herbruikbare energie worden gebruikt? ";


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
                "\n \n Welkom bij de quiz. Antwoord de volgende vragen om te kijken of je weet wat goed is voor het milieu" + "\n Type 'meer' of 'minder' \n");

        while(run){
            for (int i = 0; i < vragenGoed.length; i++) {
                System.out.println(vragenGoed[i]);
                antwoord = s.nextLine();
                antwoord = antwoord.toLowerCase();
                if(i >= 0 && i <= 3){
                    if(antwoord.equals("meer")){
                        score = score + 1;
                        System.out.println("Je antwoord was goed je krijgt 1 punt");
                        System.out.println("Je socre is nu " + score);

                    } else{
                        score = score - 1;
                        System.out.println("Je antwoord was Fout er gaat 1 punt af");
                        System.out.println("Je socre is nu " + score);
                    }

                } else if(i == 4){
                    if(antwoord.equals("minder")){
                        score = score + 1;
                        System.out.println("Je antwoord was goed je krijgt 1 punt");
                        System.out.println("Je socre is nu " + score);
                    } else{
                        score = score - 1;
                        System.out.println("Je antwoord was Fout er gaat 1 punt af ");
                        System.out.println("Je socre is nu " + score);
                    }

                } else if(i == 5){
                    if(antwoord.equals("meer")){
                        score = score + 1;
                        System.out.println("Je antwoord was goed je krijgt 1 punt");
                        System.out.println("Je socre is nu " + score);
                    } else{
                        score = score - 1;
                        System.out.println("Je antwoord was Fout er gaat 1 punt af ");
                        System.out.println("Je socre is nu " + score);
                    }

                } else if(i == 6){
                    if(antwoord.equals("minder")){
                        score = score + 1;
                        System.out.println("Je antwoord was goed je krijgt 1 punt");
                        System.out.println("Je socre is nu " + score);
                    } else{
                        score = score - 1;
                        System.out.println("Je antwoord was Fout er gaat 1 punt af  ");
                        System.out.println("Je socre is nu " + score);
                    }

                } else if(i == 7){
                    if(antwoord.equals("meer")){
                        score = score + 1;
                        System.out.println("Je antwoord was goed je krijgt 1 punt");
                        System.out.println("Je socre is nu " + score);
                    } else{
                        score = score - 1;
                        System.out.println("Je antwoord was Fout er gaat 1 punt af  ");
                        System.out.println("Je socre is nu " + score);
                    }

                } else if(i >= 8 && i <= 9){
                    if(antwoord.equals("minder")){
                        score = score + 1;
                        System.out.println("Je antwoord was goed je krijgt 1 punt");
                        System.out.println("Je socre is nu " + score);
                    } else{
                        score = score - 1;
                        System.out.println("Je antwoord was Fout er gaat 1 punt af");
                        System.out.println("Je socre is nu " + score);
                    }

                } else if(i == 10){
                    if(antwoord.equals("meer")){
                        score = score + 1;
                        System.out.println("Je antwoord was goed je krijgt 1 punt");
                        System.out.println("Je socre is nu " + score);
                    } else{
                        score = score - 1;
                        System.out.println("Je antwoord was Fout er gaat 1 punt af   ");
                        System.out.println("Je socre is nu " + score);
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