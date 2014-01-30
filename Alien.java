class Alien {
	private String _name; 
	private int _damage;
	private int  _health;
	public static final int MAX_HEALTH = 100;

	Alien() {
		this("?",0);
	}
	Alien(String name, int damage) {
		setName(name);
		setDamage(damage);
		setHealth(MAX_HEALTH);
	}
	Alien(Alien alien) {
		setName(alien.name());
		setDamage(alien.damage());
	}
	// setters
	void setName(String name) {
		_name = name;
	}
	void setDamage(int damage) {
		if (damage >= 0) 
			_damage = damage;
	}
	void setHealth(int health) {
		if (health >= 0 && health <= MAX_HEALTH)
			_health = health;
	}

	// getters
	String name() {
		return _name;
	}
	int damage() {
		return _damage;
	}
	int health() {
		return _health;
	}
	// utility
	Alien copy() {
		return new Alien(this);
	}
	public String toString() {
		return String.format("%s:%d",name(),damage());
	}


}