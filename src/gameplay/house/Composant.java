package gameplay.house;

import java.io.Serializable;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import gameplay.interfaces.Rendering;
import ressources.Ressources;

public abstract class Composant implements Serializable, Rendering
{
	private static final long serialVersionUID = 13241936481135654L;
	private int bonusPV;
	private int prix;
	protected Image texture;
	private Tier tier;
	
	
	public Composant(int prix, String texture, Tier tier)
	{
		this.tier = tier;
		bonusPV = this.tier.getPV();
		this.prix = prix;
		this.texture = Ressources.SPRITES.get(texture);
		
	}
	
	public int getBonusPV()
	{
		return bonusPV;
	}
	
	public int getPrix()
	{
		return prix;
	}
	

	public Tier getTier()
	{
		return tier;
	}
	
	public Image getTexture()
	{
		return texture;
	}
}
