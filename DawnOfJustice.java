import java.io.BufferedReader;
import java.io.InputStreamReader;


public class DawnOfJustice {
	public static void main(String[] args) {

		try{

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			int eleccion = 0;


			String poderS;
			String poderB;
			int nivelS = 0;
			int nivelB = 0;

			int numram = 0;
			int numram2 = 0;
			int numramfin= 0;
			int numbus = 0;

			String nombre;
			String nivelent;

			int i = 0;
			int batm = 0;
			int superm = 0;
			int [] juegoS = new int[10];
			int [] juegoB = new int[10];

			int ganaB = 0;
			int ganaS = 0;
			int puntoB = 0;
			int puntoS = 0;

			while (eleccion != 5){
				System.out.println("Elige una opcion:");

				System.out.println("1. Registrar superheroe");
				System.out.println("2. Mejorar habilidad");
				System.out.println("3. La gran batalla");
				System.out.println("4. El resultado final");
				System.out.println("5. Salir");

				eleccion  = Integer.parseInt(buffer.readLine());
				System.out.println("");

				switch(eleccion){

				case 1:
					System.out.println("Nombre del superheroe: (Batman o Superman)");
					nombre = buffer.readLine();
					nombre = nombre.toLowerCase();
					if (nombre.equals("batman")){
						if (batm < 1){
							System.out.println("Superpoder:");
							poderB = buffer.readLine();
							System.out.println("Nivel actual del superheroe:");
							nivelB = Integer.parseInt(buffer.readLine());
							if (nivelB<0 || nivelB>10){
								System.out.println("El nivel de poder tiene que estar entre 0 y 10.");
								nivelB = 0;								
							}
							else {
								batm++;
								i++;
							}
						}
						else{
							System.out.println("Batman ya se  ha registrado.");
						}
					}
					else if(nombre.equals("superman")){
						if (superm < 1){
							System.out.println("Superpoder:");
							poderS = buffer.readLine();
							System.out.println("Nivel actual del superheroe:");
							nivelS = Integer.parseInt(buffer.readLine());
							if (nivelS<0 || nivelS>10){
								System.out.println("El nivel de poder tiene que estar entre 0 y 10.");
								nivelS = 0;								
							}
							else {
								superm++;
								i++;
							}
						}
						else{
							System.out.println("Superman ya se  ha registrado.");
						}
					}
					else{
						System.out.println("El nombre del superheroe debe ser o Batman o Superman.");
					}
					System.out.println( "");
					break;

				case 2:
					System.out.println("Nombre del superheroe: (Batman o Superman)");
					nombre = buffer.readLine();
					nombre = nombre.toLowerCase();
					if (nombre.equals("batman")){
						if (batm > 0){
							System.out.println("Nivel de entrenamiento: (bajo o alto)");
							nivelent = buffer.readLine();
							nivelent = nivelent.toLowerCase();
							if (nivelent.equals("bajo")){
								numram = (int)Math.floor(Math.random()*(0-(20+1))+(20+1));
								System.out.println("Tienes 5 intentos para encontrar un n�mero aleatorio entre el 0 y el 20.");
								for (int e = 0; e <5;e++){
									System.out.println("Intento numero " + (e+1));
									numbus  = Integer.parseInt(buffer.readLine());
									if( numbus >=0 && numbus <=20){
										if (numbus == numram){
											System.out.println("Felicidades has acertado!");
											if (nivelB < 10){
												System.out.println("Tu nivel ha incrementado en 1.");
												nivelB = nivelB +1;											
											}
											else{
												System.out.println("Pero no puedes tener  un nivel superior a 10.");
											}
											e = 5;
										}
										else if(numbus > numram){
											System.out.println("El n�mero que has escrito es mas grande que el que buscas. Te quedan " + (4-e) +"intentos.");
										}
										else if(numbus < numram){
											System.out.println("El n�mero que has escrito es mas peque�o que el que buscas. Te quedan " + (4-e) +"intentos.");
										}
									}
									else {
										System.out.println("El n�mero debe estar entre el 0 y el 20. Te quedan " + (4-e) +"intentos.");

									}								
								}

							}
							else if (nivelent.equals("alto")){
								System.out.println("No acabado.");
								System.out.println("Intercala los siguientes numeros aleatorios:");
								numram = (int)Math.floor(Math.random()*(1-(1000+1))+(1000+1));
								String numramSt = String.valueOf(numram); 
								numramSt.length();
								numram2 = (int)Math.floor(Math.random()*(1-(1000+1))+(1000+1));
								String numram2St = String.valueOf(numram2); 
								numram2St.length(); 									
								System.out.println("Numero aleatorio 1:" +numram);
								System.out.println("Numero aleatorio 2:" +numram2);
								System.out.println("El numero intercalado es:");
								numbus  = Integer.parseInt(buffer.readLine());
								
							}
							else{
								System.out.println("Solo puede elegir nivel bajo o alto.");
							}
						}
						else{
							System.out.println("Aun no se ha registrado a Batman.");
						}
					}
					if (nombre.equals("superman")){
						if (superm > 0){
							System.out.println("Nivel de entrenamiento: (bajo o alto)");
							nivelent = buffer.readLine();
							nivelent = nivelent.toLowerCase();
							if (nivelent.equals("bajo")){
								numram = (int)Math.floor(Math.random()*(0-(20+1))+(20+1));
								System.out.println("Tienes 5 intentos para encontrar un n�mero aleatorio entre el 0 y el 20.");
								for (int e = 0; e <5;e++){
									System.out.println("Intento numero " + (e+1));
									numbus  = Integer.parseInt(buffer.readLine());
									if( numbus >=0 && numbus <=20){
										if (numbus == numram){
											System.out.println("Felicidades has acertado!");
											if (nivelS < 10){
												System.out.println("Tu nivel ha incrementado en 1.");
												nivelS = nivelB +1;											
											}
											else{
												System.out.println("Pero no puedes tener  un nivel superior a 10.");
											}
											e = 5;
										}
										else if(numbus > numram){
											System.out.println("El n�mero que has escrito es mas grande que el que buscas. Te quedan " + (4-e) +"intentos.");
										}
										else if(numbus < numram){
											System.out.println("El n�mero que has escrito es mas peque�o que el que buscas. Te quedan " + (4-e) +"intentos.");
										}
									}
									else {
										System.out.println("El numero debe estar entre el 0 y el 20. Te quedan " + (4-e) +"intentos.");

									}								
								}

							}
							else if (nivelent.equals("alto")){
								System.out.println("No acabado.");
								System.out.println("Intercala los siguientes numeros aleatorios:");
								numram = (int)Math.floor(Math.random()*(1-(1000+1))+(1000+1));
								String numramSt = String.valueOf(numram); 
								numramSt.length();
								numram2 = (int)Math.floor(Math.random()*(1-(1000+1))+(1000+1));
								String numram2St = String.valueOf(numram2); 
								numram2St.length(); 
								System.out.println("Numero aleatorio 1:" +numram);
								System.out.println("Numero aleatorio 2:" +numram2);
								System.out.println("El numero intercalado es:");
								
								numbus  = Integer.parseInt(buffer.readLine());
							}
							else{
								System.out.println("Solo puede elegir nivel bajo o alto.");
							}
						}
						else{
							System.out.println("Aun no se ha registrado a Superman.");
						}

					}
					else {
						System.out.println("El nombre de los superheroes solo puedne ser Batman o Superman.");
					}

					System.out.println( "");
					break;

				case 3:
					if (batm > 0 && superm>0){
						System.out.println("Empieza Superman. Debe introducir 10 combinaciones de piedra, papel o tijera (1 - piedra, 2 - papel, 3 - tijera");
						for (int e = 0; e <10; e++){
							System.out.println("Combinaci�n " +(e+1));
							juegoS[e] = Integer.parseInt(buffer.readLine());
							while (juegoS[e] != 1 && juegoS[e] != 2 && juegoS[e] != 3){
								System.out.println("Debe ser una opci�n entre 1, 2 y 3. Vuelve a escribirlo.");
								System.out.println("Combinaci�n " +(e+1));
								juegoS[e] = Integer.parseInt(buffer.readLine());
							}
						}
						System.out.println("Ahora el turno de Batman. Debe introducir 10 combinaciones de piedra, papel o tijera (1 - piedra, 2 - papel, 3 - tijera");
						for (int e = 0; e <10; e++){
							System.out.println("Combinaci�n " +(e+1));
							juegoB[e] = Integer.parseInt(buffer.readLine());
							while (juegoB[e] != 1 && juegoB[e] != 2 && juegoB[e] != 3){
								System.out.println("Debe ser una opci�n entre 1, 2 y 3. Vuelve a escribirlo.");
								System.out.println("Combinaci�n " +(e+1));
								juegoB[e] = Integer.parseInt(buffer.readLine());
							}
						}

						for (int e = 0; e <10; e++){
							if (juegoB[e] == 1 && juegoS[e] == 2){
								ganaS++;							
							}
							if (juegoB[e] == 2 && juegoS[e] == 1){
								ganaB++;							
							}
							if (juegoB[e] == 2 && juegoS[e] == 3){
								ganaS++;							
							}
							if (juegoB[e] == 3 && juegoS[e] == 2){
								ganaB++;							
							}
							if (juegoB[e] == 3 && juegoS[e] == 1){
								ganaS++;							
							}
							if (juegoB[e] == 1 && juegoS[e] == 3){
								ganaB++;							
							}
						}
						if(ganaB > ganaS){
							puntoB++;
							System.out.println("Ha ganado Batman. Se le suma un punto en las batallas.");
						}
						else if(ganaB < ganaS){
							puntoS++;
							System.out.println("Ha ganado Superman. Se le suma un punto en las batallas.");
						}
						else if (ganaB == ganaS){
							System.out.println("Empate.");
						}

						ganaB = 0;
						ganaS = 0;
					}
					else {
						System.out.println( "Falta algun superheroe por registrar.");
					}
					System.out.println( "");
					break;

				case 4:
					if (batm > 0 && superm>0){
						if ((puntoS+ nivelS) > (puntoB+ nivelB) ){
							System.out.println( "Superman: " +(puntoS+ nivelS));
							System.out.println( "Batman: " +(puntoB+ nivelB));
							System.out.println( "Gana Superman.");
						}

						else if ((puntoS+ nivelS) < (puntoB+ nivelB) ){
							System.out.println( "Batman: " +(puntoB+ nivelB));
							System.out.println( "Superman: " +(puntoS+ nivelS));						
							System.out.println( "Gana Batman.");
						}

						else if ((puntoS+ nivelS) == (puntoB+ nivelB) ){
							System.out.println( "Batman: " +(puntoB+ nivelB));
							System.out.println( "Superman: " +(puntoS+ nivelS));						
							System.out.println( "Empate.");
						}
					}
					else{
						System.out.println( "Falta algun superheroe por registrar.");
					}
					System.out.println( "");
					break;

				case 5:
					System.out.println("Esto nunca volver a ocurrir!");
					System.out.println("");
					System.out.println( "");
					break;

				default: 
					System.out.println("No es una opcion valida.");
					System.out.println("");
					break;
				}
			}


			System.out.println("");

		}

		catch (Exception e){

			System.out.println("Error" +e);
		}	
	}
}