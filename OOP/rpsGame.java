
//200029850 Sena Yolcuoğlu

import java.util.Random;

public class rpsGame {
    Boolean finish=true;
    int[] player = new int[2];
    String[] yourMove= new String[2];
    int i;
    Random which =new Random();

        public void playGame(){
            while(finish){                               // Starting the game
                while(i<2){                              // Generating random numbers for the players
                    player[i] = which.nextInt(3);
                                                         // Giving String values {rock,paper,scissors} to rondom numbers we got from previous step.
                    if(player[i]==0){
                        yourMove[i]= "Rock";
                        i++;
                    }
                    else if(player[i]==1){
                        yourMove[i]= "Paper";
                        i++;
                    }
                    else if(player[i]==2){
                        yourMove[i]= "Scissors";
                        i++;
                    }
                }
                                                        // First we get the output of the values which each player got randomly
                for(int i=0;i<=1;i++){
                    System.out.println("Player " + (i+1) + ": " + yourMove[i]);
                }
                                                        //After that we are comparing the values so that we can see the result of the game
                    if(yourMove[0] == "Rock" && yourMove[1] == "Scissors" || yourMove[0] == "Paper" && yourMove[1] == "Rock"  || yourMove[0] == "Scissors" && yourMove[1] == "Paper" ){
                        System.out.println("Player 1 won!");
                        finish=false;
                    }
                    else if(yourMove [0] == yourMove[1]){
                        System.out.println("It's a draw!");
                        finish=false;
                    }
                    else{
                        System.out.println("Player 2 won!");
                        finish=false;
                    }
                }                              //ending the game!
            }
        public static void main(String[] args){
            rpsGame game1 = new rpsGame();
            game1.playGame();
        }  
}
