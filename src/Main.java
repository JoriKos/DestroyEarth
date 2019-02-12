import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean run = true; // variabalen aanmaken
        boolean start = true;
        String lc;
        Scanner s = new Scanner(System.in);
        System.out.println("Type start");
        String startgame;

        while(start){
           startgame = s.nextLine(); // Checkt wat er getypt word
            lc = startgame.toLowerCase();
        if(lc.equals("start")){ // Checkt of er start is getypt
            start = false;


            while(run){
            System.out.println("Kies één van de twee:");


        }}
        else{
            System.out.println("Type start");
        }}

    }
}
