package br.com.controle_aereo_deev.radar;
import net.bootsfaces.component.canvas.Drawing;

public class Radar extends Drawing {
	
	
	
	public Radar(int x, int y)
	{ //  text(805+210+10, 470, "innovative", "16px Arial");
		
		
		
		    circle(x, y, 420);
		    circle(x, y, 315);
		    circle(x, y,  210);
		    circle(x, y,  105);
		    line(x-y, y, x+y, y);
		    line(x, 0, x, 900);
		    
		    
		    
		    //botar riscos X
		    int interador = 10;
		    for(int i = 0; i < 43; i++)
		    {
		    	 line(x+interador, y-5, x+interador, y+5);
		    	 line(x-interador, y-5, x-interador, y+5);
		    	 interador += 10;
		    	
		    }
		    
		  //botar riscos Y
		    interador = 10;
		    for(int i = 0; i < 43; i++)
		    {
		    	 line(x-5, y+interador, x+5, y+interador);
		    	 line(x-5, y-interador, x+5, y-interador);
		    	 interador += 10;
		    }
		   
		 
		    filledCircle(805+40+70, 470-105-20,5, "green");
		
		    
		    filledCircle(805+70+105, 470-210-10,5, "blue");

		    
		    
		    
	}
	
	
	
	

}
