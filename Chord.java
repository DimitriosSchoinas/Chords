
public class Chord {
	
	
	private int root, second, third;
	public Chord(int first, int second, int third) {
		this.root = first;
		this.second = second;
		this.third = third;
		
		if ((this.root >88 || this.root <1)||(this.second >88 || this.second <1)||(this.third >88 || this.third <1)||(this.root >= this.second)||(this.second >= this.third)){//||(this.second >= this.third)||(this.second <= this.root)||(this.third <= this.root)||(this.third <= this.second)){
		System.out.println("Acorde inválido."); System.exit(0);
		}
		
	}
	

	public boolean isMajor() {
		int intervalo1 = Math.abs(root - second);
		int intervalo3 = Math.abs(root - third);
		if((intervalo1 == 4) && (intervalo3 == 7)) {return true;}
		else {return false;}
	}
	public boolean isMinor() {
		int intervalo1 = Math.abs(root - second);
		int intervalo3 = Math.abs(root - third);
		if((intervalo1 == 3) && (intervalo3 == 7)) {return true;}
		else {return false;}
	}
	public boolean isUnisonoro(Chord other) {
		int n1a1 = root; int r1a2 = other.root;
		int n2a1 = second; int r2a2 = other.second;
		int n3a1 = third; int r3a2 = other.third;
		if((n1a1 == r1a2) && (n2a1 == r2a2) &&(n3a1 == r3a2)){
			return true;}
		else {return false;}
	}
		
	public boolean formsTwoOctave(Chord other) {
		int n1a1 = root; int r1a2 =  other.root;
		int n2a1 = second; int r2a2 =  other.second;
		int n3a1 = third; int r3a2 =  other.third;
		if((Math.abs(n1a1 - r1a2)== 12) && (Math.abs(n2a1 - r2a2) == 12) &&(Math.abs(n3a1 - r3a2) ==12)){
			return true;}
		else {return false;}
	}
	public boolean isPopProgression(Chord acorde2, Chord acorde3, Chord acorde4) {
		int intervalo1 = Math.abs(root - acorde2.root);
		int intervalo2 = Math.abs(root - acorde3.root);
		int intervalo3 = Math.abs(root - acorde4.root);
		
		int intervalo4 = Math.abs(root - second);
		int intervalo5 = Math.abs(root - third);
		int intervalo6 = Math.abs(acorde2.root - acorde2.second);
		int intervalo7 = Math.abs(acorde2.root - acorde2.third);
		int intervalo8 = Math.abs(acorde4.root - acorde4.second);
		int intervalo9 = Math.abs(acorde4.root - acorde4.third);
		int intervalo10 = Math.abs(acorde3.root - acorde3.second);
		int intervalo11 = Math.abs(acorde3.root - acorde3.third);
		
		
		if((intervalo1 == 7) && (intervalo2 == 9) && (intervalo3 == 5)&&(intervalo4 == 4) && (intervalo5 == 7) && (intervalo6 == 4)&&(intervalo7 == 7) && (intervalo8 == 4) && (intervalo9 == 7)&&(intervalo10 == 3) && (intervalo11 == 7)) {return true;}
		else {return false;}
		
	}
	public void transpose(int halfSteps) { 
		root = root + halfSteps; 
		second = second + halfSteps;
		third = third + halfSteps;
		
		
		
	//d
		
		
		
	}
	
	public boolean isTranspose(int halfSteps) {
		if(((this.root + halfSteps <1)||(this.root + halfSteps>88)||(this.second + halfSteps<1)||(this.second +halfSteps >88)||(this.third + halfSteps<1)||(this.third+ halfSteps >88))) {
			return false; }
		else {return true;}
	}
}


