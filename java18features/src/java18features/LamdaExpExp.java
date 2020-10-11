package com.learn;

interface Game
{
	void play(String str);
}

public class LamdaExpExp {
	
	public static void main(String[] args) {
		
		Game game = new Game() {
		 public void play(String str) {
			 System.out.println("Favorite Game " + str);	
		 }
		};
		game.play("volleyball");
		
		Game gameusinglamdaexp= (str)-> System.out.println("Favorite Game " + str);
		gameusinglamdaexp.play("volleyball");	

	}

}
