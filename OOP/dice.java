import java.util.Random;
public class dice{

    int i,k=0,a=0;
    int roll=0;
    int rollNum;

    /*I made a dice object and get random numbers from 1 to 10 in this part. 
     * Array "face" is for keeping the values for each roll.*/
    public void rollDice(){
        Random dice = new Random();
        int[] face = new int[rollNum];

        for(i=0; i <rollNum; i++){
            face[i] = dice.nextInt(10)+1;
        }

        /* In this part i made an array called "sum" so that i can keep the
         * values for each surface of the dice. */

        int[] sum = new int[]{0,0,0,0,0,0,0,0,0,0};
        while(k<10){
            for(i=0;i<rollNum;i++){
                if(face[i]==k+1){
                    sum[k]++;
                }
            }
            System.out.println(k+1 + ":>" +sum[k]);
            k++;
        }
    }

    public int number(int yournum){
        rollNum+=(roll+yournum);
        return rollNum;
    }

    public static void main(String[] args){
        dice d1 = new dice();
        d1.number(30);
        System.out.println("\nDice has been rolled " +d1.rollNum + " times.");
        d1.rollDice();
    }
}
