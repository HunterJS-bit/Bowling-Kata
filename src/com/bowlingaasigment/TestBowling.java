package com.bowlingaasigment;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.Before;



// This is used for testing the Bowling Game

public class TestBowling {

	
	
	private BowlingGame game;
	
	@Before
	public void setingUp(){
		game = new BowlingGame();
	}
	
	
	// these are all test cases
	
	
	//simple game with all throw with 3 pins down, total score is 60
	@Test
	public void canScore60(){
		game.roll(3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3);
		assertThat(game.score(), is(60));
		
	}
	

	//perfect game with all strike, total score is 300
	@Test
	public void canScorePerfect(){
		game.roll(10,10,10,10,10,10,10,10,10,10,10,10);
		assertThat(game.score(), is(300));
		
	}
	
	
	
	//simple game with one spare (4/6) in the middle, and others are 3 pins down, total score is 67

	@Test
	public void canScore67(){
		game.roll(3,3,3,3,3,3,3,3,4,6,3,3,3,3,3,3, 3,3, 3,3);
		assertThat(game.score(), is(67));
		
	}
	
	
	//simple game with two continued spares (4/6) in the middle and others are 3 pins down, 
	//total score is 75
	@Test
	public void canScore75(){
		game.roll(3,3,3,3,3,3,3,3,4,6,4,6,3,3,3,3, 3,3, 3,3);
		assertThat(game.score(), is(75));
		
	}
	
	
	//simple game with one strike in the middle and others are 3 pins down,
	//total score is 70

	@Test
	public void canScore70(){
		game.roll(3,3,3,3,3,3,3,3,10,3,3,3,3,3,3, 3,3, 3,3);
		assertThat(game.score(), is(70));
		
	}
	
	
	
	//simple game with two continued strikes in the middle and others are 3 pins down,
	//total score is 87
	@Test
	public void canScore87(){
		game.roll(3,3,3,3,3,3,3,3,10,10,3,3,3,3,3, 3,3, 3,3);
		assertThat(game.score(), is(87));
		
	}
	
	
	//simple game with one spare in the tenth frame, bonus is 10,
	//and others are 3 pins down, total score is 70 (tenth frame is 10, then 3, then 3)

	@Test
	public void canScore70with10(){
		game.roll(3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,10,3,3);
		assertThat(game.score(), is(70));
		
	}
	
	
	
	//simple game with one strike in the tenth frame, each bonus is 10 and others are 3 pins down,
	//total score is 84
	@Test
	public void canScore84(){
		game.roll(3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,10,10,10);
		assertThat(game.score(), is(84));
		
	}
	
	
	//a game with all spare (3/7) total score is 130

	@Test
	public void canScoreWith3and7(){
		game.roll(3,7,3,7,3,7,3,7,3,7,3,7,3,7,3,7,3,7,3,7,3);
		assertThat(game.score(), is(130));
		
	}
	
	
	
	
	
	
	
	
	
	//Test wrong input
	//with 15 for one throw
	@Test(expected = IllegalArgumentException.class)
	public void cantScoreMoreThan10Points() {
	    game.roll(15,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3);
	}
	
	//Test wrong input
	//with 15 for two throws
	@Test(expected = IllegalArgumentException.class)
	public void cantScoreMorewithTwo15() {
	    game.roll(15,15,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3);
	    
	    
	}
	
	//Test wrong input
	//with letter input
	@Test (expected = IllegalArgumentException.class)
	public void testingLetter() {
	    char c = 'c';
	    game.roll(c);
	   
	}
	
	//Test wrong input
	//with two throws in the same frame bigger than 10
	@Test (expected = IllegalArgumentException.class)
	public void testFrames(){
		game.roll(8,8,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3);
		game.score();
	}
	
	
}
