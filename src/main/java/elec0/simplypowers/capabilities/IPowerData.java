package elec0.simplypowers.capabilities;

import elec0.simplypowers.powers.IPower;

public interface IPowerData 
{
	// Category (Mover, Shaker, etc)
	public void setTypes(int primary, int secondary);
	public void setTypes(int[] types);
	// Specific power ID
	public void setPowers(IPower primary, IPower secondary);
	public void setPowers(IPower[] powers);
	public void setPowerIDs(int primary, int secondary);
	public void setPowerIDs(int[] powerIDs);
	// Power intensity/levels
	public void setLevels(int primary, int secondary);
	public void setLevels(int[] levels);
	// Which powers are active
	public void setActives(int primary, int secondary);
	public void setActives(int[] actives);
	// Progression of powers
	public void setProgression(int primary, int secondary);
	public void setProgression(int[] progression);

	public int[] getTypes();
	public IPower[] getPowers();
	public int[] getPowerIDs();
	public int[] getLevels();
	public int[] getActives();
	public int[] getProgression();
	
	public void genObjects();
	public void generatePowers();
}
