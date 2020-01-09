package exercises;

import java.util.ArrayList;

public class SumArrayList {
    public static Double sumEvenNumbs(ArrayList<Double> numbs) {
        double sum = 0;
        for (Double numb : numbs){
            if(numb % 2 == 0){
                sum += numb;
            }
        }
        return sum;
    }
}
