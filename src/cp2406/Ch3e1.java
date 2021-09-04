package cp2406;

public class Ch3e1 {

    public static void main(String[] args) {
        rollOnce();
        int numRolls = 100000000;
        double countRolls = 0;
        for (int i = 0; i < numRolls; i++) {
            int[] results = rollOnce();
            if (results[0] == 1 && results[1] == 1) {
                countRolls++;
            }
        }
        System.out.println("Average of getting Snake Eyes = " + countRolls/numRolls);
        double probability = (1./6) * (1./6);
        System.out.println("Probability of getting Snake Eyes = " + probability);
    }

    public static int[] rollOnce() {

        int die1;   // The number on the first die.
        int die2;   // The number on the second die.
        int roll;   // The total roll (sum of the two dice).

        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1 + die2;

//        System.out.println("The first die comes up " + die1);
//        System.out.println("The second die comes up " + die2);
//        System.out.println("Your total roll is " + roll);

        int[] ret = {die1, die2};
        return ret;

    }  // end rollOnce()

}  // end class