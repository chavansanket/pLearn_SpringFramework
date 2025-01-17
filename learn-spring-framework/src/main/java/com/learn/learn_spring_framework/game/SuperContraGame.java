package com.learn.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class SuperContraGame implements GamingConsole{
	
	@Override
	public void up() {
		System.out.println("SuperContraGame Up");
	}
	
	@Override
	public void down() {
		System.out.println("SuperContraGame Down");
	}
	
	@Override
	public void left() {
		System.out.println("SuperContraGame Left");
	}
	
	@Override
	public void right() {
		System.out.println("SuperContraGame Right");
	}

}
