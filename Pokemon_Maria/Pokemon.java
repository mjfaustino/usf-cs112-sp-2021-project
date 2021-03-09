package inClass;

public abstract class Pokemon implements Comparable<Pokemon> {
	 // Can only be accessed by the inherited class
	  protected String name;
	  protected String color;
	  protected boolean hasTrainer;
	  protected String move;
	  protected int height;

	  // Constructor
	  public Pokemon(String nParam, String cParam, String move, int height) {
	    this.name = nParam;
	    this.color = cParam;
	    this.hasTrainer = false;
	    this.move = move;
	    this.height = height;
	  }

	  public Pokemon(String nParam, String cParam, boolean hParam, String move, int height) {
		  this.name = nParam;
		  this.color = cParam;
		  this.hasTrainer = hParam;
		  this.move = move;
		  this.height = height;
	  }
	  
	  // Default constructor
	  public Pokemon() {
		  this.name = "";
		  this.color = "";
		  this.hasTrainer = false;
		  this.move = "";
		  this.height = 0;
	  }
	  
	  // Accessor
	  public String getName() {
	    return this.name;
	  }
	  
	  public String getColor() {
		  return this.color;
	  }
	  
	  public boolean hasTrainer() {
		  return this.hasTrainer;
	  }
	  public String getMove() {
		  return this.move;
	  }
	  public int getHeight() {
		  return this.height;
	  }
	  
	  // Mutator
	  protected void setName(String nParam) {
	    this.name = nParam;
	  }
	  
	  public void setColor(String cParam) {
		  this.color = cParam;
	  }
	  
	  public void setHasTrainer(boolean hParam) {
		  this.hasTrainer = hParam;
	  }
	  public void height(int height) {
		  this.height = height;
	  }
	  public abstract void move(String move);
	  public abstract void speak();
	  
//	  Alice B
//	  public abstract void catchPokemon();
//	  public abstract void releasePokemon();
	  
	  public boolean equals(Object obj) {
		  if (obj instanceof Pokemon) {
			  Pokemon other = (Pokemon) obj;
			  if (this.name == other.getName() && 
					  this.color == other.getColor() && 
					  this.hasTrainer == other.hasTrainer() &&
					  this.move == other.getMove())
				  return true;
		  } return false;
		 
	  }

	  // Method
	  public String toString() {
	    return "I am a Pokemon: " + this.name + " : " + this.color + " : " + this.hasTrainer() + ":" + this.move ;
	  }

	  public int compareTo(ThunderPokemon2 otherPokemon) {
			return this.height - otherPokemon.getHeight();
					
		}
	

}
