/**
 * Sept
 */
import java.util.*;

class Sept {

    
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("How many players are playing ?");
        int numPlayers = scan.nextInt();
        String name = "";

        /* Each player name and creating each player obj */
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter the name of the " + (i + 1) + " player");
            name = scan.next();
            players.add(new Player(name));
        }

        /* Specify the number of faces of the dice */
        System.out.println("How many faces would you want to have your dice?");
        int faces = scan.nextInt();
        while (faces < 3) {
            System.out.println("Try again! The value should be higher than 3");
            faces = scan.nextInt();
        }
        Dice dices = new Dice(faces);
        
        
        
        /* Roll of each player and order of the players */
        System.out.println("\nNow We will choose the first player, by rolling a dice each and the order will be ascending");

        for (Player player : players) {
            System.out.println(player.getName() + " rolls the dice");
            player.firstPlayer(dices);
            System.out.println(player.getName() + "'s score is: " + player.getScore() + "\n");
        }
        Collections.sort(players);


        System.out.println("The order of the player will be :");
        int o = 1;
        for (Player player : players) {
            System.out.println(o + ". " + player.getName());
            player.setScore(0);
            o++;
        }


        System.out.println("\nLet's  Start the game\n");
        for (Player player : players) {
            System.out.println("It's the turn of " + player.getName());
            player.playing(dices);
        }


        Collections.sort(players);
        System.out.println("\n And the winner is...");
        System.out.println(players.get(0).getName());
        

        
    }    



}