package cp2406;

public class Ch4e3 {
    public static void main(String[] args) {
        int numRolls;
        numRolls = countRolls(2);
        System.out.println("It took " + numRolls + " rolls to get snake eyes");
    } // end of main

    public static int countRolls(int total) {
        if ( total < 2 || total > 12 ) {
            throw new IllegalArgumentException("Impossible total for two dice.");
        }
        int die1, die2;         // The values rolled on two dice.
        int countRolls = 0;     // Count the number of rolls.
        while(true){
            die1 = (int)(Math.random()*6) + 1;
            die2 = (int)(Math.random()*6) + 1;
            countRolls++;
//            System.out.println(die1 + " " + die2);
            if ((die1 + die2) == total) {
                break;
            }
        }
        return countRolls;

    }  // end countRolls
}
