import java.util.ArrayList;

public class AquariumMain {

	public static void main(String[] args) throws InterruptedException {
		
		int amountOfdifferentFish = 4;
		int numberOfFishes;
		int aquariumHeight = 5;
		int aquariumLength = 140;
		numberOfFishes = aquariumHeight;
		
		
		// generate Aquarium
		ArrayList<Aquarium> myFirstAquarium = new ArrayList<>();
		myFirstAquarium.add(new Aquarium());
		for (int i = 1; i < aquariumHeight+1; i++) {
			myFirstAquarium.add(new Aquarium());
		}
		
		
		
		// Wert der Höhe und Breite an Aquarium übergeben:		
		// Baue Strings: Boden und nWalls...
				for (int i = 0; i < aquariumHeight+1; i++) {
					myFirstAquarium.get(i).setHeight(aquariumHeight);
					myFirstAquarium.get(i).setLength(aquariumLength);
					myFirstAquarium.get(i).emptyAquarium(i);
				}
		
		
		//.....................................................................................
		
		// erstelle Fische
		ArrayList<Fisch> fische = new ArrayList<>();
		for (int i = 0; i < numberOfFishes; i++) {
			
			// random: which fish:
			int randomFish = (int )(Math.random() * amountOfdifferentFish + 1);
			
			switch (randomFish) {
			case 1:
				fische.add(new Hai (i, "HaiFisch"));
				break;
			case 2:
				fische.add(new NormalFisch (i, "NormalFisch"));
				break;
			case 3:
				fische.add(new Kugelfisch (i, "Kugelfisch"));
				break;
			case 4:
				fische.add(new Schwertfisch (i, "Schwertfisch"));
				break;

			default:
				break;
			}
		}
		
		// Starting values: Set additional parameter of the fish
		System.out.println("Number of Fishes in general: " + numberOfFishes);
		
		// Loop over all fishes:
		for (int i = 0; i < numberOfFishes; i++) {
			
			// set Y-Position:
			fische.get(i).setyPos(i+1);
			
			// set X-Position:
			//Generate random int value from -1 to (Aquarium-Länge MINUS Fisch-Länge)			
			int max = aquariumLength -(fische.get(i).getLengthOfFish());
			int random_int = (int)(Math.random() * max +1);
					
			fische.get(i).setxPos(random_int);
			
			// set direction - left or right
			int randomDirection = (int )((Math.random() * 2) + 1);
			if (randomDirection == 1) {
				fische.get(i).setDirectionRight(false);
			}
			
			
			
			/*
			System.out.println("Fisch i: " + i);
			//Fisch-Name, X, Y, Richtung
			System.out.println("Bild: : "+ fische.get(i).getFishR());
			System.out.println("Name des Fisches: "+ fische.get(i).getName());
			System.out.println("X Pos. von i: "+ fische.get(i).getxPos());
			System.out.println("Y Pos. von i: "+ fische.get(i).getyPos());
			System.out.println("Länge des Fisches: " + fische.get(i).getLengthOfFish());
			System.out.println("DirectionRight: " +fische.get(i).isDirectionRight());
			System.out.println("*********************************: ");
			*/
			
		}
		
		
		
		
		
		// Fülle das Aquarium mit den Fischen:
		// Gehe über alle Zeilen... mit allen Fischen...
		
		for (int i = 0; i < numberOfFishes; i++) {
			fische.get(i).fillAquarium(myFirstAquarium.get(i+1));
		}
		
		
		
				
		// Zeige Aquarium:
				
				int k = 0;
				
				do {
					k++;
					//System.out.println("k: " +k);
					System.out.println(" ");
					System.out.println(" ");
					System.out.println(" ");
					
					//Zeige Aquarium --> Strings...
					for (int i = aquariumHeight; i >= 0; i--) {
						System.out.println(myFirstAquarium.get(i).getAquariumString());
					}
					
					
					//Hier baue ich.....
					for (int i = 0; i < numberOfFishes; i++) {
						
						//System.out.println(fische.get(i).getxPos());
						
						if (fische.get(i).getxPos() < aquariumLength - fische.get(i).getLengthOfFish() && fische.get(i).isDirectionRight()) {
							fische.get(i).setxPos(fische.get(i).getxPos()+1);
						} else if (fische.get(i).getxPos() > 1 && !(fische.get(i).isDirectionRight())){
							fische.get(i).setxPos(fische.get(i).getxPos()-1);
						} else {
							fische.get(i).setDirectionRight(!fische.get(i).isDirectionRight());
						}
					}
						
						
						for (int i = 0; i < numberOfFishes; i++) {
							fische.get(i).fillAquarium(myFirstAquarium.get(i+1));
						}
						
						
						//fische.get(i).setxPos(fische.get(i).getxPos()+1);
						//fische.get(i).setxPos(i);
						//System.out.println(fische.get(i).getxPos());
						//fische.get(i).fishSwim2(myFirstAquarium);
						//fische.get(i).setxPos(random_int);
						
						//fische.get(i).fishSwim(myFirstAquarium.get(i+1));
					
					
					
					
					
					//Hier ist das Ende von bauen...
					
					
					
					
					
					
					
					
					
					//workingFish.fishSwim(myFirstAquarium);
					
					// fish up or down ?
					//workingFish.fishUpOrDown(myFirstAquarium);
					
					
					
					
					//slowing down time...
					Thread.sleep(100, 0);
					
				} while (k < 1500);
				
				
				
		
				/*
		
		myFirstAquarium.get(i).
		
		
		// =======================================================================
		// Hier schwimmen die Fische...
		int k = 0;
		do {
			k++;
			System.out.println("k: " +k);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			// 
			// setze die Fische an eine Position in das Aquarium
			for (int i2 = 0; i2 < myFirstAquarium.getHeight(); i2++) {
				Fisch workingFish = fische.get(i2);
				
				workingFish.fishSwim(myFirstAquarium);
				
				// fish up or down ?
				//workingFish.fishUpOrDown(myFirstAquarium);
				
			}
			
			
			// zeige Aquarium
			myFirstAquarium.showAquarium(fische);
			
			myFirstAquarium.zeigeAquarium();
			
			
			//slowing down time...
			Thread.sleep(150, 0);
			
		} while (k  < 1);
		
		*/
		
	}
	
	
	
	
	
}