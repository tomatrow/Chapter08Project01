/* Chapter No. 8 - Project No.  1.
    File Name:          ChapterSevenProjectThree.java
    Programmer:         Andrew Caldwell
    Date Last Modified: Nov. 26, 2013

    Problem Statement:
	Demonstrate subclassing, polyporphism and overriding

    Overall Plan
	* Create base alien class 
		* Subclasses overide damage method

    Classes needed and Purpose
    main class - Chapter07Project06
    System - streams
    String - holding strings
    Alien - base class
    AlienPack - Alien manager/collection
    OgreAlien -  subclass of alien 
    SnakeAlien - subclass of alien 
    MarshmellowAlien - subclass of alien  

*/

class ChapterSevenProjectThree {
	public static void main(String[] args) {
		AlienPack _pack = new AlienPack();
		_pack.setAlienAtIndex(new SnakeAlien(),0);
		_pack.setAlienAtIndex(new OgreAlien(),1);
		_pack.setAlienAtIndex(new MarshmellowManAlien(),2);
		System.out.println("Alien Collection: " + _pack);
		System.out.println("Their damage together: " + _pack.calculateDamage());
	}
}