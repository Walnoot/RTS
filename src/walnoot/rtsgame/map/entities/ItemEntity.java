package walnoot.rtsgame.map.entities;

import java.awt.Graphics;

import walnoot.rtsgame.map.Map;
import walnoot.rtsgame.screen.SPGameScreen;

public abstract class ItemEntity extends Entity {
	
	public ItemEntity(SPGameScreen screen,Map map, int xPos, int yPos, int ID){
		super(map, xPos, yPos, ID,screen);
	}
	
	public void update(){
		
	}
	
	public void render(Graphics g){
	}
	
	public int getMaxHealth(){
		return 0;
	}
}
