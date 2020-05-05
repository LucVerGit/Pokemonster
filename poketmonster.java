package apppoket;

public class pokemonster {
	private String Name;
	private float HP;
	private int XP;
	private float Attack;
	private float Defense;
	private int Level;
	
	public pokemonster(String name)
	{
		this.setName(name);
		this.setHP(100);
		this.setXP(10);
		this.setAttack(1);
		this.setDefense(1);
		this.setLevel(1);
		
		
	}
	
	public void showstat() /// afficher les carateristique du pokemon
	{
		System.out.println("les stat de "+this.getName()+"\n"+" sa vie "+this.getHP()+"\n"+" l'experiance:"+this.getXP()+"\n"+" sont attack:"+this.getAttack()+"\n"+" ça defence:"+this.getDefense()+"\n"+" le level:"+this.getLevel()+"\n");
	}
	
	public void combat(pokemonster monster) 
	{
		System.out.println(this.getName()+" va combatre"+monster.getName());
		monster.setHP(monster.getHP() - this.getAttack());
		this.setXP(getXP()+1);
		
	}
	
	
	private int getLevel() {
		return Level;
	}
	private void setLevel(int level) {
		Level = level;
	}
	private String getName() {
		return Name;
	}
	private void setName(String name) {
		Name = name;
	}
	private float getHP() {
		return HP;
	}
	private void setHP(float hP) {
		HP = hP;
	}
	private int getXP() {
		return XP;
	}
	private void setXP(int xP) {
		XP = xP;
	}
	private float getAttack() {
		return Attack;
	}
	private void setAttack(float attack) {
		Attack = attack;
	}
	private float getDefense() {
		return Defense;
	}
	private void setDefense(float defense) {
		Defense = defense;
	}
	
	

}
