package com.bowlingaasigment;


/*
 * Assignment 1
COSC3506/ITEC3506: Assignment #1

 * 
 */
public class BowlingGame {

	
	
	private int roll = 0;
	//this is the number of frames
	private int [] rolls = new int[21];
	
	
	public void roll(int...rolls){
		for(int pinsDown:rolls){
			
			roll(pinsDown);
			
		}
		
	}
	
	//this method gives error if num of pins is greater than 10 because we cannot
	//knock more than 10 pins in one throw
	public void roll(int pinsDown){
		 if(pinsDown > 10 ){
		        throw new IllegalArgumentException("illegal argument ");
		    }
		rolls[roll++] =pinsDown;
	}
	
	
	//this calculates the total score for all frames
	public int score(){
		int score = 0;
		int cursor = 0;
		
		for(int frame = 0;frame<10;frame++){
			
			
			
			 if(rolls[cursor]==10){ // check if it is strike
				score+=10 + rolls[cursor+1] + rolls[cursor+2];
				cursor++;
			}else if(rolls[cursor] + rolls[cursor+1]==10){ // check if it is spare
				score+=10 + rolls[cursor+2];
				cursor+=2;
			}else if(rolls[cursor]+rolls[cursor+1]<10){
				score+=rolls[cursor] + rolls[cursor+1];
				cursor+=2;
			}else if(rolls[cursor]+rolls[cursor+1]>10){ // check if it is illegal throw
				
				throw new IllegalArgumentException();
				
			}
		}
		return score;
		
			
	}
	
	
	
	
	
}
