package main;

import entity.NPC_OldMan;
import monster.MON_GreenSlime;
import object.OBJ_Axe;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;
import tile_interactive.IT_DryTree;

public class AssetSetter {

	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	 
	public void setObject() {
 
		int mapNum = 0;
		int i = 0;
		gp.obj[mapNum][i] = new OBJ_Chest(gp, new OBJ_Key(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*12;
		gp.obj[mapNum][i].worldY = gp.tileSize*8;
		i++;
		gp.obj[mapNum][i] = new OBJ_Door(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*12;
		gp.obj[mapNum][i].worldY = gp.tileSize*12;
		i++;
		gp.obj[mapNum][i] = new OBJ_Chest(gp, new OBJ_Axe(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*38;
		gp.obj[mapNum][i].worldY = gp.tileSize*7;
		i++;
		mapNum = 1;
		gp.obj[mapNum][i] = new OBJ_Chest(gp, new OBJ_Key(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*12;
		gp.obj[mapNum][i].worldY = gp.tileSize*7;
		i++;
	}
	public void setNPC() {
		
		int mapNum = 0;
		int i = 0;
		gp.npc[mapNum][i] = new NPC_OldMan(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize*39;
		gp.npc[mapNum][i].worldY = gp.tileSize*7;
		i++; 
		mapNum = 1;
		gp.npc[mapNum][i] = new NPC_OldMan(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize*13;
		gp.npc[mapNum][i].worldY = gp.tileSize*7;
		i++;
	}
	public void setMonster() {
		
		int mapNum = 0;
		int i = 0;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*23;
		gp.monster[mapNum][i].worldY = gp.tileSize*36;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*23;
		gp.monster[mapNum][i].worldY = gp.tileSize*37;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*24;
		gp.monster[mapNum][i].worldY = gp.tileSize*37;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*34;
		gp.monster[mapNum][i].worldY = gp.tileSize*42;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*38;
		gp.monster[mapNum][i].worldY = gp.tileSize*42;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*12;
		gp.monster[mapNum][i].worldY = gp.tileSize*32;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*11;
		gp.monster[mapNum][i].worldY = gp.tileSize*32;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*10;
		gp.monster[mapNum][i].worldY = gp.tileSize*30;
		i++;
		
		mapNum = 1;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*10;
		gp.monster[mapNum][i].worldY = gp.tileSize*10;
		i++;
		gp.monster[mapNum][i] = new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*14;
		gp.monster[mapNum][i].worldY = gp.tileSize*11;
		i++;
	}
	public void setInteractiveTile() {
		
		int mapNum = 0;
		int i = 0;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 31, 21);i++;
		
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 12);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 28, 12);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 12);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 12);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 31, 12);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 32, 12);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 33, 12);i++;
		
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 40);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 14, 40);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 15, 40);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 16, 40);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 17, 40);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 18, 40);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 40);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 41);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 11, 41);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 41);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 41);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 36, 30);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 40);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 22, 35);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 23, 35);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 24, 35);i++;
		
	}
	
}
