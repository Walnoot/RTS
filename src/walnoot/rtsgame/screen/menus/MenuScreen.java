package walnoot.rtsgame.screen.menus;

import java.awt.Graphics;

import walnoot.rtsgame.InputHandler;
import walnoot.rtsgame.RTSComponent;
import walnoot.rtsgame.screen.Screen;

public abstract class MenuScreen extends Screen {
	protected int selectedButton = 0;
	
	public MenuScreen(RTSComponent component, InputHandler input){
		super(component, input);
	}
	
	public void render(Graphics g){
		for(MenuButton b: getButtons()){
			b.render(g);
		}
		super.render(g);
	}
	
	public void update(){
		super.update();
		if(popup != null)return;
		for(MenuButton b: getButtons()){
			b.setMouseLocation(super.getMouseLocation(), super.input.LMBTapped());
		}
	}
	
	protected abstract MenuButton[] getButtons();
	
	public abstract void buttonPressed(MenuButton menuButton);
	
}
