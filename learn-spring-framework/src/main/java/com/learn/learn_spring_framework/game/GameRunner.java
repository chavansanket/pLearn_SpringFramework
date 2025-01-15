package com.learn.learn_spring_framework.game;

public class GameRunner {
	private MarioGame game;
	
	public GameRunner(MarioGame game) {
		this.game = game;
	}

	public void run() {
//		System.out.println(game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}
	
	
	
	

}
