package com.leonious;

public class IfElse {
    public static void main (String [] args){

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);



    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus){


        if(!gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println(" Your final score " + finalScore);
            return finalScore;
        }
        return -1;
    }









    public static void displayHighScorePosition (String playerName, int highScorePosition ){
        System.out.println(playerName + "managed to get into position" + highScorePosition + "on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore>1000){
            return 1;
        } else if(playerScore > 500 && playerScore <1000){
            return 2;
        } else if(playerScore >100 && playerScore <500){
            return 3;
        }else{
            return 4;
        }
    }

}
