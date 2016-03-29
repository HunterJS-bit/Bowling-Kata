package com.bowlingaasigment;

//this is the main class

public class Main {

	
	public static void main(String[] args) {
	
		//here we create objects and calculate the total score in all games
		int total = 0;
		
		BowlingGame match1 = new BowlingGame();
		match1.roll(3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3);
		System.out.println("the score for first game "+match1.score());
		
		BowlingGame match2 = new BowlingGame();
		match2.roll(10,10,10,10,10,10,10,10,10,10,10,10);
		System.out.println("the score for second game "+match2.score());
		
		
		BowlingGame match3 = new BowlingGame();
		match3.roll(3,3,3,3,3,3,3,3,4,6,3,3,3,3,3,3, 3,3, 3,3);
		System.out.println("the score for thrid game "+match3.score());
		
		BowlingGame match4 = new BowlingGame();
		match4.roll(3,3,3,3,3,3,3,3,4,6,4,6,3,3,3,3, 3,3, 3,3);
		System.out.println("the score for fourth game "+match4.score());
		
		BowlingGame match5 = new BowlingGame();
		match5.roll(3,3,3,3,3,3,3,3,10,3,3,3,3,3,3, 3,3, 3,3);
		System.out.println("the score for fifth game "+match5.score());
		
		BowlingGame match6 = new BowlingGame();
		match6.roll(3,3,3,3,3,3,3,3,10,10,3,3,3,3,3, 3,3, 3,3);
		System.out.println("the score for sixth game "+match6.score());
		
		BowlingGame match7 = new BowlingGame();
		match7.roll(3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,10,3,3);
		System.out.println("the score for seventh game "+match7.score());
		
		BowlingGame match8 = new BowlingGame();
		match8.roll(3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,10,10,10);
		System.out.println("the score for eight game "+match8.score());
		
		
		BowlingGame match9 = new BowlingGame();
		match9.roll(3,7,3,7,3,7,3,7,3,7,3,7,3,7,3,7,3,7,3,7,3);
		System.out.println("the score for ninth game "+match9.score());
		
		//This runs total calculation
		total = match1.score()+match2.score()+match3.score()+match4.score()+match5.score()+
				match6.score()+match7.score()+match8.score()+match9.score();
		
		System.out.println("The total score for these games is "+total);
		
	
		
		
		
		
		
	
	}
	
}
