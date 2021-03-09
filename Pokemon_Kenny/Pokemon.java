package class0225;

public class Pokemon {
  // Can only be accessed by the inherited class
  private String name;
  private String color;
  private boolean hasTrainer;

  // Constructor
  public Pokemon(String nParam, String cParam) {
    this.name = nParam;
    this.color = cParam;
    this.hasTrainer = false;
  }

  public Pokemon(String nParam, String cParam, boolean hParam) {
	  this.name = nParam;
	  this.color = cParam;
	  this.hasTrainer = hParam;
  }
  
  // Default constructor
  public Pokemon() {
	  this.name = "";
	  this.color = "";
	  this.hasTrainer = false;
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
  
  // Mutator
  public void setName(String nParam) {
    this.name = nParam;
  }
  
  public void setColor(String cParam) {
	  this.color = cParam;
  }
  
  public void setHasTrainer(boolean hParam) {
	  this.hasTrainer = hParam;
  }

  // Method
  public String toString() {
    return "I am a Pokemon: " + this.name + " : " + this.color + " : " + this.hasTrainer();
  }
  
  public void declare() {
	  System.out.println("Pokemon type");
  }
  
  //Override
  public void move (String word) {
	  System.out.println("'super' Pokemon move");
  }
  
  //equals
  public boolean equals (Object obj) {
		if (obj instanceof Pokemon) {
			Pokemon other = (Pokemon) obj;
			if(obj != null && obj.getClass() == getClass()) {
				return true;
			}
		}
		return false;
	}

//	clean and oraganized code! (sample comment for in class assignment)
  
}
