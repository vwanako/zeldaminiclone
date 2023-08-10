package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	
	public static BufferedImage spritesheet;
	
	public static BufferedImage[] player_front;
	public static BufferedImage wall_tile;
	
	public Spritesheet()
	{
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		player_front = new BufferedImage[2];
		player_front[0] = Spritesheet.getSprite(1, 11, 16, 16);
		player_front[1] = Spritesheet.getSprite(16, 11, 16, 16);
		
		wall_tile = Spritesheet.getSprite(272, 240, 16, 16);
	}

	public static BufferedImage getSprite(int x, int y, int width, int height)
	{
		return spritesheet.getSubimage(x, y, width, height);
	}
	
} 