import java.util.Arrays;

class AlienPack {
	private static final int ALIEN_COUNT = 3;
	private Alien[] _aliens;
	AlienPack() {
		_aliens = new Alien[ALIEN_COUNT];
		for (Alien alien : _aliens) 
			alien = new Alien();
	}
	AlienPack(Alien[] aliens) {
		setAliens(aliens);
	}

	int calculateDamage() {
		int damage = 0;
		for (Alien alien : _aliens) 
			damage += alien.damage();
		return damage;
	}
	// getters 
	Alien[] aliens() {
		Alien[] aliens = new Alien[ALIEN_COUNT];
		for (int x = 0;x < ALIEN_COUNT;x++) 
			aliens[x] = _aliens[x].copy();
		return aliens;
	}
	// setters 
	void setAliens(Alien[] aliens) {
		boolean validArray = true;
		for (Alien alien : aliens) 
			if (alien == null)
				validArray = false;
		if (validArray)
			_aliens = aliens;
	}
	void setAlienAtIndex(Alien alien,int index) {
		if (index >= 0 && index < _aliens.length)
			_aliens[index] = alien;
	}
	public String toString() {
		return Arrays.toString(_aliens);
	}
}