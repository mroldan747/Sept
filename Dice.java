import java.util.*;
class Dice {
    private int total; 
    private int faces;

    public Dice(int faces){
        this.faces = faces;
        this.total = 0;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * @param faces the faces to set
     */
    public boolean setFaces(int faces) {
        if (faces < 3) {
            return false;
        }
        this.faces = faces;
        return true;
    }

    public int rollOne() {
        Random randomNumberGenerator = new Random();
        int[] dices = randomNumberGenerator.ints(1, 1, this.faces).toArray();
        this.total = dices[0];
        return this.total;
    }

    public int rollTwo() {
        Random randomNumberGenerator = new Random();
        int[] dices = randomNumberGenerator.ints(2, 1, this.faces).toArray();
        
        
        this.total =  dices[0] + dices[1];

        if (this.total == 7){
            this.total = 0;
        }
        return this.total;
    }


    
}