import java.util.ArrayList;
import java.util.Random;


public class die {
    public static void main(String[] args) {
        int wins = 0;
        int losses = 0;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i <1000000; i++) {
            if (random.nextInt(6) + 1 == 6) wins++; else losses++;     
        }

        for (int j = 1; j <= wins; j++) {
            list.add(wins);
            sum += j;
        }

         double mean = sum/(float)list.size();
         double std = Math.sqrt(mean);
         double variance = 0;
         for (int b = 0; b < wins; b++) {
            variance += Math.pow(wins - mean, 2);
         }
        
        int total = wins - losses;
        System.out.println("Wins with single dice: " + wins + ", losses with single: " + losses + " Your money total is: $" + total + " the mean is: " + sum/(float)list.size() + " the Standard Deviation is: " + std + "and the variance: " + variance);
        int wins2 = 0;
        int losses2 = 0;
        for (int k = 0; k < 1000000; k++) {
            int num = 0;
            for (int a = 0; a < 24; a++) {
                if(random.nextInt(6) + 1 == 6){num++;}
                if (num > 1) {
                    wins2++;
                    break;
                }
            } if (num < 2) losses2++;
        }

        for (int a = 0; a <= wins2; a++) {
            list.add(wins2);
            sum += a;
        }

        double mean2 = sum/(float)list.size();
        double std2 = Math.sqrt(mean2);
        double variance2 = 0;
         for (int b = 0; b < wins; b++) {
            variance2 += Math.pow(wins2 - mean2, 2);
         }

        int total2 = wins2 - losses2;
        System.out.println("Wins with 2 dice: " + wins2 + ", losses with 2 dice: " + losses2 + " Your money total is: $" + total2 + " the mean is: " + sum/(float)list.size() + " the Standard Deviation is: " + std2 + "and the variance: " + variance2);
    }    
}
