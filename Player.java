import java.util.*;
class Player implements Comparable<Player> {

    private int score;
    private String name;
    
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }


    public int firstPlayer(Dice dices){
        this.score = dices.rollOne();
        return this.score;
    }

    public void playing(Dice dices) {
        boolean stop = false;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("Do you want to play? (y/n)");
            String answer = scan.nextLine();
            
            if (answer.equalsIgnoreCase("y")){
                dices.rollTwo();
                if (dices.getTotal() == 0) {
                    this.score = 0;
                } else {
                    this.score += dices.getTotal();
                }
            } else {
                stop = true;
            }
            System.out.println("The score of player " + this.name + " is: " + this.score);
        } while (!stop && this.score != 0);   
            
    }

    public int compareTo(Player player) {
        return this.score < player.score ? 1 : this.score > player.score ? -1 : 0;
    }
}