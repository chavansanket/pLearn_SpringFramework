package com.learn.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//	private MarioGame game;
	@Autowired
	private GamingConsole gameInterface;
	
	public GameRunner(GamingConsole game) {
		this.gameInterface = game;
	}

	public void run() {
//		System.out.println(game);
		gameInterface.up();
		gameInterface.down();
		gameInterface.left();
		gameInterface.right();
		
	}
	
	
	
	

}
