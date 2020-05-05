package apppoket;

public class mainApp {

	public static void main(String[] args) {
		
		pokemonster pikachu = new pokemonster("pika");
		pokemonster miaous = new pokemonster("snowball");
		pikachu.showstat();
		miaous.showstat();
		pikachu.combat(miaous);
	
		pikachu.showstat();
		miaous.showstat();

	}

}
