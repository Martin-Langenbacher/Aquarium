import java.util.ArrayList;

public class Aquarium {

	//attributes
	private int hight;
	private int length;
	private String aquariumString;
	
	
	//constructor
	public Aquarium() {
		this.hight = 1;
		this.length = 20;
		this.aquariumString = " ";
	}
	

	public Aquarium(int hight, int length, String aquariumString) {
		this.hight = hight;
		this.length = length;
		this.aquariumString = aquariumString;
	}

	
	
	//getters and setters
	public String getAquariumString() {
		return aquariumString;
	}
	
	public void setAquariumString(String aquariumString) {
		this.aquariumString = aquariumString;
	}
		
	

	public int getHeight() {
		return hight;
	}


	public void setHeight(int hight) {
		this.hight = hight;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}
	
	
	
	
	//Methode erstelle das leere Aquarium:
	void emptyAquarium(int n) {
		String corner = "+";
		String bottom = "-";
		String wall = "|";
		String empty = " ";
		if (n > 0) {
			setAquariumString(wall +empty.repeat(this.getLength()) + wall);
		} else {
			setAquariumString(corner + bottom.repeat(this.getLength()) + corner);
		}
		
		
	}
		
		
			
			/*
			int counter = 1;
			for (Fisch fisch : fische) {
				
				System.out.println(fisch.getName() +"; Position of the Fisch:" +fisch.getyPos() + "höhen-Level: " +this.hight);
				if (fisch.getyPos() == counter) {
					System.out.println("yPos =" +fisch.getyPos());
				} else {
					System.out.println("nicht counter" + counter);
				}
				counter++;
			}
			System.out.println("******");
			*/
			
					
		
		
		
	

		
		
	
	
	
	/*
	
	//Methode: Zeige Aquarium:
	void zeigeAquarium() {
		System.out.println("Test: Hier bin ich in der Methode Zeige Aquarium! ");
		
		int m = getHeight();
		System.out.println(getHeight());
		do {
			m--;

			System.out.println(this.nWalls);
			
		} while (m>0);
		System.out.println(this.oneBottom);
				
	  }
	
	
	
	
	
	
	
	//Methode erstellen: --> Zeige Aquarium
			void showAquarium(ArrayList<Fisch> fische) {
				String zeile = "";
				String corner = "+";
				String bottom = "-";
				String wall = "|";
				String empty = " ";
				int fishPosX;
				int fishPosY;
				String beforeFish;
				String afterFish;
				String stringFish;
				
				int m = getHeight();
				do {
					m--;

					fishPosX = fische.get(m).getxPos();
					fishPosY = fische.get(m).getyPos();
					/*System.out.println("X: " + fishPosX);
					System.out.println(">>> Start:========================================");
					System.out.println(m + "(m): fishPosY: " + fishPosY);
					//System.out.println("Fisch 3: " + fische.get(3).getName());
					System.out.println("Y0: " + fische.get(0).getyPos());
					System.out.println("Y1: " + fische.get(1).getyPos());
					System.out.println("Y2: " + fische.get(2).getyPos());
					System.out.println("Y3: " + fische.get(3).getyPos());
					System.out.println("Y4: " + fische.get(4).getyPos());
					System.out.println("Y5: " + fische.get(5).getyPos());
					System.out.println("Y6: " + fische.get(6).getyPos());
					System.out.println("Y7: " + fische.get(7).getyPos());
					
					
					
					/*
					System.out.println("Zähler m3: " + 3);
					System.out.println("========================================");
					
					System.out.println(fische.get(m).getName());
					System.out.println("Y: " + fishPosY);
					System.out.println("Zähler m: " + m);
					System.out.println("========================================Ende"); 
					
					beforeFish = empty.repeat(fishPosX);
						if (fische.get(m).isDirectionRight()) {
							stringFish = fische.get(m).getFishR();
						} else {
							stringFish = fische.get(m).getFishL();
						}
					afterFish = empty.repeat(this.getLength()-fische.get(m).getLengthOfFish()-fishPosX);
					
					zeile = wall + beforeFish + stringFish + afterFish + wall;
					
					System.out.println(zeile);
					
				} while (m>0);
				
				zeile = corner + bottom.repeat(this.getLength()) + corner;
				System.out.println(zeile);
				
				
				*/
			  


	
}
