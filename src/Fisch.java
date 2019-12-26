import java.util.ArrayList;

public abstract class Fisch {

	//attributes
	private int number;
	private String name;
	private int xPos;
	private int yPos;
	private boolean directionRight;
	private String fishL;
	private String fishR;
	private int lengthOfFish;
	private int probabilityOfChange;
	
	
	//constructor
	public Fisch(int number, String name, String fishR, String fishL, int probabilityOfChange) {
		this.number = number;
		this.name = name;
		this.fishR = fishR;
		this.fishL = fishL;
		this.directionRight = true;
		this.lengthOfFish = fishL.length();
		this.probabilityOfChange = probabilityOfChange;
	}
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	
	public String getFishR() {
		return fishR;
	}


	public String getFishL() {
		return fishL;
	}


	public int getLengthOfFish() {
		return lengthOfFish;
	}


	public int getxPos() {
		return xPos;
	}


	public void setxPos(int xPos) {
		this.xPos = xPos;
	}


	public int getyPos() {
		return yPos;
	}


	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getprobabilityOfChange() {
		return probabilityOfChange;
	}


	public void setprobabilityOfChange(int probabilityOfChange) {
		this.probabilityOfChange = probabilityOfChange;
	}
	
	
	public boolean isDirectionRight() {
		return directionRight;
	}


	public void setDirectionRight(boolean directionRight) {
		this.directionRight = directionRight;
	}



//=======================================================================
	
	//Methode erstellen: --> Fische schwimmen... (zur nächsten Position)
		void fishSwim(Aquarium aquarium) {
		    // right or left direction?	
			
			if (this.getxPos() < (aquarium.getLength() - this.getLengthOfFish()) && this.isDirectionRight()) {
				setxPos(this.getxPos()+1);
			} else if (this.getxPos() > (this.lengthOfFish - this.getLengthOfFish()) && !(this.isDirectionRight())) {
				setxPos(this.getxPos()-1);
			}
			else {
				this.setDirectionRight(!this.directionRight);
			}		
			
		  }
		
		
		
		
//=======================================================================
		
	//Methode erstellen: --> schwimmen die Fische nach oben oder nach unten?	
		void fishUpOrDown(Aquarium aquarium) {
			
			// random: Fish changes position?
			boolean changeYPos = false;
			int randomChangeYPos = (int )(Math.random() * probabilityOfChange + 1);
			if (randomChangeYPos == 1) {
				changeYPos = true;
			}
			
			if (changeYPos && this.getyPos() == aquarium.getHeight()-1) {
				// wenn ich ganz oben bin, dann schwimme runter...
				setyPos(this.getyPos()-1);
			} else if (changeYPos && this.getyPos() == 0) {
				// wenn ich ganz unten bin, dann schwimme nach oben...
				setyPos(this.getyPos()+1);
			} else if (changeYPos) {
				// random: up or down?
				int upOrDown = (int )(Math.random() * 2 + 1);
				if (upOrDown == 1) {
					setyPos(this.getyPos()-1);
				} else {
					setyPos(this.getyPos()+1);
				}
				
			}
			else {

			}
			
		}
		
		
		
		//Methode: Fülle Aquarium:
				void fillAquarium(Aquarium aquarium) {
					String workingString = aquarium.getAquariumString();	
							
					char resultChar = 0;
					String togetherString = "";
					
					int counter = 0;
					int switchCase = 1;
					
					do {
						//System.out.println(counter);
						
						switch (switchCase) {
						case 1:
							resultChar = workingString.charAt(counter); 
							if (counter == 0 || counter == aquarium.getLength()+1) {
								togetherString = togetherString + "|";
							} else {
								togetherString = togetherString + " ";
								}
							
							counter++;
							break;
							
						case 2:
							if (this.directionRight) {
									for (int j = 0; j < this.lengthOfFish; j++) {
										resultChar = this.fishR.charAt(j);
										togetherString = togetherString + String.valueOf(resultChar);
										counter++;
										//Herausspringen, sobald der Fisch abgearbeitet ist!============
										if (j == this.lengthOfFish-1) {
											switchCase = 1;
										}
										
										//-Hier eingebaut============
										} 
								} else {
											for (int j = 0; j < this.lengthOfFish; j++) {
												resultChar = this.fishL.charAt(j);
													//System.out.println("j = " +j +"; Zeichen: " +this.fishL.charAt(j));
													//System.out.println("Fisch:: " +this.fishL);
												togetherString = togetherString + String.valueOf(resultChar);
												counter++;
												//Herausspringen, sobald der Fisch abgearbeitet ist!============
												if (j == this.lengthOfFish-1) {
													switchCase = 1;
												}
											}
										}
							break;
							
						default:
							break;
						}
						
						//-Hier eingebaut============
						if (this.xPos == counter) {
							switchCase = 2;
						} 
						//-Hier eingebaut============
						
						
					} while (aquarium.getLength() +2 > counter);
					
					aquarium.setAquariumString(togetherString); 
					
				}
				
		

}


