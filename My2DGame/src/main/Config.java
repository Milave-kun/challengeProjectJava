package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Config {

	GamePanel gp;
	
	public Config(GamePanel gp) {
		this.gp = gp;
	}
	
	public void saveConfig() {
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"));
			
			// Full Screen
			if(gp.fullScreenOn == true) {
				bw.write("On");
			}
			if(gp.fullScreenOn == false) {
				bw.write("Off");
			}
			bw.newLine();
			
			// Music Volume
			bw.write(String.valueOf(gp.music.volumeScale));
			bw.newLine();
			
			// SE Volume
			bw.write(String.valueOf(gp.se.volumeScale));
			bw.newLine();
			
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadConfig() {
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("config.txt"));
			
			String e = br.readLine();
			
			// Full screen
			if(e.equals("On")) {
				gp.fullScreenOn = true;	
			}
			if(e.equals("Off")) {
				gp.fullScreenOn = false;
			}
			
			// Music volume
			e = br.readLine();
			gp.music.volumeScale = Integer.parseInt(e);
			
			// SE volume
			e = br.readLine();
			gp.se.volumeScale = Integer.parseInt(e);
			
			br.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}
}
