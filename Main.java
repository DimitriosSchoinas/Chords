import java.util.Scanner;



public class Main {
	private static final String TRP = "TRP";
	private static final String MAJ = "MAJ";
	private static final String MIN = "MIN";
	private static final String UNI = "UNI";
	private static final String OCT = "OCT";
	private static final String POP = "POP";
	private static final String SAIR = "SAIR";
	 private static  Chord getChord(int N, Chord acorde1,  Chord acorde2,  Chord acorde3,  Chord acorde4) {
		 switch (N) {
			case 1:
			return acorde1;
			case 2:
				return acorde2;
			case 3:
				return acorde3;
			case 4:
				return acorde4;
				default:
					
					
					return null;
	 }
		 }
	 private static  Chord getChord2(int M, Chord acorde1,  Chord acorde2,  Chord acorde3,  Chord acorde4) {
		 switch (M) {
			case 1:
			return acorde1;
			case 2:
				return acorde2;
			case 3:
				return acorde3;
			case 4:
				return acorde4;
				default:
				
					
				 return null;
	 }
		 }
	 private static  Chord getChord3(int S, Chord acorde1,  Chord acorde2,  Chord acorde3,  Chord acorde4) {
		 switch (S) {
			case 1:
			return acorde1;
			case 2:
				return acorde2;
			case 3:
				return acorde3;
			case 4:
				return acorde4;
		 default:
			 
			 
			 return null ;
		 }
		 
	 }
		 

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int first = in.nextInt();
		int second = in.nextInt();
		int third = in.nextInt();
		in.nextLine();
		Chord acorde1 = new Chord(first, second, third);
		
		 first = in.nextInt();
		 second = in.nextInt();
		 third = in.nextInt();
		in.nextLine();
		Chord acorde2 = new Chord(first, second, third);
		
		first = in.nextInt();
		 second = in.nextInt();
		 third = in.nextInt();
		in.nextLine();
		Chord acorde3 = new Chord(first, second, third);
		
		 first = in.nextInt();
		 second = in.nextInt();
		 third = in.nextInt();
		in.nextLine();
		Chord acorde4 = new Chord(first, second, third);
	
		//while(option != "EXIT") {executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );}
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );

		executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );
		
		
	     
	     
	   
	     //String option;
		//	do{option = getOption(in);executarOpcao(in, acorde1, acorde2, acorde3, acorde4 );}while(!option.equals( "EXIT"));
	//in.close();
	}	
	///private static String getOption(Scanner in){
	 	
 		//return in.next();}
		//	private static void saida(Scanner in) {
		//String option = in.next();
	//	in.nextLine();
	//	return option;
	//}

		
	//}
	
	//}
	


	
	
  
	
	
	
	private static void executarOpcao(Scanner in, Chord acorde1, Chord acorde2, Chord acorde3, Chord acorde4) {
		
		
	
	String option = in.next();
		switch (option) {
		case "TRP":
			processTransposto(in, acorde1, acorde2, acorde3, acorde4);
			break;
		case "MAJ":
			processMaior(in, acorde1, acorde2, acorde3, acorde4);
			break;
		case "MIN":
			processMenor(in, acorde1, acorde2, acorde3, acorde4);
			break;
		case "UNI":
			processUnicero(in, acorde1, acorde2, acorde3, acorde4);
			break;
		case "OCT":
			processOitava(in, acorde1, acorde2, acorde3, acorde4);
			break;
		case "POP":
			processPOP(in, acorde1, acorde2, acorde3, acorde4);
			break;
	    case "SAIR":
				System.exit(0);
			break;
			
				
				
		}

		
	}
	
	
	

	private static void processPOP(Scanner in, Chord acorde1, Chord acorde2, Chord acorde3, Chord acorde4) {
		in.nextLine();
		
		Chord selecionarAcorde =  acorde1;
		Chord selecionarAcorde2 =  acorde2;
		Chord selecionarAcorde3 = acorde3;
		Chord selecionarAcorde4 = acorde4;
		
		
		if(selecionarAcorde.isPopProgression(selecionarAcorde2, selecionarAcorde3, selecionarAcorde4) == true) {System.out.println("É um exemplo da progressão pop.");}
		else {
			System.out.println("Não é um exemplo da progressão pop.");
			
	}
	}
	

	

	private static void processOitava(Scanner in, Chord acorde1, Chord acorde2, Chord acorde3, Chord acorde4) {
		int N = in.nextInt();
		int M = in.nextInt();
		in.nextLine();
		
		Chord selecionarAcorde = getChord(N, acorde1, acorde2, acorde3, acorde4);
		Chord selecionarAcorde2 = getChord2(M, acorde1, acorde2, acorde3, acorde4);
		
		//&&((M>=1)&&(M<=4))
		//if (((N<1)||(N>4))&&((M<1)||(M>4))){System.out.println("Primeiro acorde inexistente.");}
		 if (((N<1)||(N>4))){System.out.println("Primeiro acorde inexistente.");}
		else if (((N>=1)&&(N<=4))&&((M<1)||(M>4))){System.out.println("Segundo acorde inexistente.");}
		else if(selecionarAcorde.formsTwoOctave(selecionarAcorde2) == true ) {System.out.println("As notas formam um acorde de duas oitavas.");}
			else if(selecionarAcorde.formsTwoOctave(selecionarAcorde2) == false ) {
				System.out.println("As notas não formam um acorde de duas oitavas.");}
			
		
	}

	private static void processUnicero(Scanner in, Chord acorde1, Chord acorde2, Chord acorde3, Chord acorde4) {
		int N = in.nextInt();
		int M = in.nextInt();
		in.nextLine();
		
		Chord selecionarAcorde = getChord(N, acorde1, acorde2, acorde3, acorde4);
		Chord selecionarAcorde2 = getChord2(M, acorde1, acorde2, acorde3, acorde4);
		
		//if (((N<1)||(N>4))&&((M<1)||(M>4))){System.out.println("Primeiro acorde inexistente.");}
		 if (((N<1)||(N>4))){System.out.println("Primeiro acorde inexistente.");}
		else if (((N>=1)&&(N<=4))&&((M<1)||(M>4))){System.out.println("Segundo acorde inexistente.");}
		else if(selecionarAcorde.isUnisonoro(selecionarAcorde2) == true) {System.out.println("Os acordes são uníssonos.");}
			else if(selecionarAcorde.isUnisonoro(selecionarAcorde2) == false){
				System.out.println("Os acordes não são uníssonos.");
			}
		
	}

	private static void processMenor(Scanner in, Chord acorde1, Chord acorde2, Chord acorde3, Chord acorde4) {
		int S = in.nextInt();
		in.nextLine();
		
		Chord selecionarAcorde = getChord3(S, acorde1, acorde2, acorde3, acorde4);
		
		if (((S<1)||(S>4))){System.out.println("Acorde inexistente.");}
		else if(selecionarAcorde.isMinor() == true) {System.out.println("O acorde " + S +  " é um acorde menor.");}
			else if (selecionarAcorde.isMinor() == false){
				System.out.println("O acorde " + S +  " não é um acorde menor.");
			}
		
	}

	private static void processMaior(Scanner in, Chord acorde1,Chord acorde2, Chord acorde3,Chord acorde4) {
	int S = in.nextInt();
	in.nextLine();
	
	Chord selecionarAcorde = getChord3(S, acorde1, acorde2, acorde3, acorde4);
	
	if (((S<1)||(S>4))){System.out.println("Acorde inexistente.");}
	else if(selecionarAcorde.isMajor() == true) {System.out.println("O acorde " + S +  " é um acorde maior.");}
		else if (selecionarAcorde.isMajor() == false){
			System.out.println("O acorde " + S +  " não é um acorde maior.");
		}
	}

	private static void processTransposto(Scanner in, Chord acorde1, Chord acorde2, Chord acorde3, Chord acorde4) {
		
		int S = in.nextInt();
		int halfSteps = in.nextInt();
		in.nextLine();
		
		Chord selecionarAcorde = getChord3(S, acorde1, acorde2, acorde3, acorde4);
		
		
		
		if (((S<1)||(S>4))){System.out.println("Acorde inexistente.");}
		//else if (((S<1)||(S>4))&&(halfSteps > 0)){System.out.println("Acorde inexistente.");}
		else if(((S<=4)&&(S>=1))&& (halfSteps <= 0)){System.out.println("Número de semitons inválido.");}
		
 if (((S<=4)&&(S>=1))&& halfSteps > 0 &&selecionarAcorde.isTranspose(halfSteps)== false ) {System.out.println("Transposição inválida.");}
	else if (((S<=4)&&(S>=1))&&(halfSteps > 0)&&selecionarAcorde.isTranspose(halfSteps)== true){ selecionarAcorde.transpose( halfSteps); System.out.println("O acorde " + S + " foi transposto " + halfSteps + " semitons.");}
 
	
	}
	}

	
	
	
	
	

