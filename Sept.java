/**
 * Sept
 */
import java.util.*;

class Sept {

    
    public static void main(String[] args) {
        
        int[] scores = new int[2]; 
        boolean stop;
        int score;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {

            stop = false;
            score = 0; 
            System.out.println("It's the turn of player " + (i + 1));
    
            while (stop == false ){
                System.out.println("Do you want to play? (y/n)");
                String answer = scan.nextLine();
            
                if (answer.equals("y")){
                    stop = false;
                    score = play();
                } else {
                    stop = true;
                }
                
                if (score == 0){
                    scores[i] = 0;
                    System.out.println("The score of player " + (i + 1) + " is: " + scores[i]);
                    break;
                } else {
                    scores[i] += score;
                }
                System.out.println("The score of player " + (i + 1) + " is: " + scores[i]);
            }
            
            
        }
        if (scores[0] > scores[1]){
            System.out.println("The winner is player 1");
        } else if (scores[0] < scores[1]) {
            System.out.println("The winner is player 2");
        }else{
            System.out.println("You have the same score!!");
        }
        
    }    


    public static int play() {

        Random randomNumberGenerator = new Random();
        int[] dices = randomNumberGenerator.ints(2, 1, 7).toArray();
        
        System.out.println(Arrays.toString(dices));
        int total =  dices[0] + dices[1];
        System.out.println(total);
        if (total == 7){
            return 0;
        }
        return total; 
    }

}