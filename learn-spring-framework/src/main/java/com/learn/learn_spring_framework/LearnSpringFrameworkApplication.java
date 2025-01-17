package com.learn.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learn.learn_spring_framework.game.GameRunner;
import com.learn.learn_spring_framework.game.GamingConsole;
import com.learn.learn_spring_framework.game.MarioGame;
import com.learn.learn_spring_framework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = applicationContext.getBean(GameRunner.class);
//		GamingConsole game = new MarioGame();
//		GamingConsole game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);		
		runner.run();

	}

}
