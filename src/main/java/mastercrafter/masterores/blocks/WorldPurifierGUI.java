package mastercrafter.masterores.blocks;

import net.minecraft.client.gui.GuiScreen;


public class WorldPurifierGUI extends GuiScreen {

public void intiGUI()
	{
	this.buttonList.clear();
	}

public boolean doesGuiPaseGame()
	{
		return false;
	}

public void drawScreen(int l, int j, float f)
	{
	drawDefaultBackground();
	}

}