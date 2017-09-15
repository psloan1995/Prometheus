/*This is the sub class for the orc_Class. 
 * This is where I add some return statements. */
public class method_Orc {
	
	character_Class Orc = new character_Class();
	
	public int health ,boost,magic;
	String user;
	
	public String speak(){
		return "I am a Orc! ";
	}
	
	public String speak2(){
		return "I do: ";
	}
	
	public String speak3(){
		return "I have: ";
	}
	
	public String getUserOrc(){  
		Orc.setName("Orc");
		return user = Orc.getName();
	}
	
	public int healthOrc(){		
		Orc.setHealth(100);
		return health = Orc.getHealth();
	}
	
	public int boostOrc(){
		Orc.setBoost(30);
		return boost = Orc.getBoost();
	}
	
	
}