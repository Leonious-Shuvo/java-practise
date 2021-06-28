package com.leonious;

public class Challenge2 {

    public static void main (String []args){

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(700);
        displayHighScorePosition("Brock", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Leo", highScorePosition);

    }
    public static void displayHighScorePosition (String playerName, int highScorePosition){
        System.out.println(playerName+ " Managed to get into position " + highScorePosition +
                " on the score table");

    }

    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 1000){
//            return 1;
//        }else if(playerScore >= 500 && playerScore <1000){
//            return 2;
//        }else if( playerScore >=100 && playerScore < 500){
//            return 3;
//        }else {
//            return 4;
//        }
        int position = 4;
        if(playerScore >= 1000){
            position =1;
        }else if(playerScore >=500){
            position = 2;
        }else if(playerScore >=100){
            position = 3;
        }
        return position;

    }
}
