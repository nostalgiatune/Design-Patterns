
import java.util.Scanner;



class ConcreteGame extends Game {
    
    public static void main(String[] args) {
        Game game = new ConcreteGame();
        game.playOneGame(2);
    }
    
    Scanner scanner;

 /* Implementation of necessary concrete methods */

    void initializeGame() {
        System.out.println("Pelin tavoitteena on kasvattaa omaa lukua joka vuorolla mielivaltaisella luvulla. "
                + "Se kumpi rikkoo ensimmäisenä 1000, voittaa. Poikkeuksen aiheuttamalla häviää!\n\n");
        scanner = new Scanner(System.in);
        player1number = 0;
        player2number = 0;
    }

    void makePlay(int player) {
        System.out.println("Tilanne: pelaaja0: " + player1number + " | pelaaja1: " + player2number);
        
        System.out.print("Pelaaja " + player + ": Paljonko kasvatetaan: ");
        Scanner scanner = new Scanner(System.in);
        int vastaus = 0;
        try {
            vastaus = scanner.nextInt();
        }catch (Exception e) {
            System.out.println("Pelaaja numero " + player + " aiheutti poikkeuksen "
                    + "ja hävisi pelin");
            System.exit(0);
        }
        
        if(player==0) {
            player1number += vastaus;
        }else {
            player2number += vastaus;
        }
    }

    boolean endOfGame() {
        return (player1number > 1000 || player2number > 1000);
    }

    void printWinner() {
        System.out.println("Tilanne: pelaaja1: " + player1number + " | pelaaja2: " + player2number);
        System.out.print("Voittaja: ");
        if (player1number > player2number)
            System.out.print("Player 0\n");
        else if (player2number > player1number)
            System.out.print("Player 1\n");
        else
            System.out.print("Tasapeli");
    }
    
    private int turnNumber;
    int player1number;
    int player2number;
    
 } 