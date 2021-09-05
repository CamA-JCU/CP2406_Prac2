package cp2406;

import static cp2406.Ch4e3.countRolls;

public class Ch4e4 {

    public static final int NUMBER_OF_EXPERIMENTS = 1000;

    public static void main(String[] args) {
        double avgRolls;
        System.out.println("Total On Dice     Average Number of Rolls");
        System.out.println("-------------     -----------------------");
        for (int total = 2; total <= 12 ; total++) {
            avgRolls = avgRollCount(total);
            System.out.printf("%7d%22.4f\n",total,avgRolls);
        }
    }   // end of main

    public static double avgRollCount(int total) {
        int experimentRolls;
        int countRolls = 0;
        double avgRollCount;
        for (int i = 0; i < NUMBER_OF_EXPERIMENTS; i++) {
            experimentRolls = countRolls(2);
            countRolls += experimentRolls;
        }
        avgRollCount = ((double)countRolls) / NUMBER_OF_EXPERIMENTS;
        return avgRollCount;
    }   // end of avgRollCount
}
