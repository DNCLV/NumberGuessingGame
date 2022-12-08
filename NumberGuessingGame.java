import java.util.ArrayList;
import java.util.Scanner;

public class NumberGuessingGame {

	static Scanner scan = new Scanner(System.in);
	
	static Scanner guessOne = new Scanner(System.in);
	static Scanner guessTwo = new Scanner(System.in);
	static Scanner guessThree = new Scanner(System.in);
	static Scanner guessFour = new Scanner(System.in);
	static Scanner guessFive = new Scanner(System.in);
	static Scanner name = new Scanner(System.in);
	
	static int TheChosenNumber = 1 + (int)(100 * Math.random());
	
	public static void main(String[] args) {
		
		// Welcome message and rules of the game
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("The rules are as following:");
		System.out.println("The game will span over 5 rounds and you will be guessing The Chosen Number in the last round.");
		System.out.println("The first 4 rounds will have you guessing a random number.The game will inform you whether this number is higher, lower or The Chosen Number.");
		System.out.println("In the last round you must guess The Chosen Number!(if you haven't guessed it already)");
		System.out.print("Lets begin! Please state your name: ");
		
		// Name list of participant

		/*  Scanner name = new Scanner(System.in);
			ArrayList<String> participantList = new ArrayList<String>();
			while (name.hasNext()){
				participantList.add(name.next());
			}
			name.close(); 
			Cannot make the program store an ArrayList<String> on inputs from console(system.in)*/
		
		String participant = name.nextLine();
		
		// Guess number 1 
		System.out.print("Hello " + participant + ", you can now make your first guess: ");
		int guess1 = guessOne.nextInt();
			if (guess1 < TheChosenNumber) {
				System.out.println("Your guess is " + guess1 + " which is LOWER than The Chosen Number");
					} else if (guess1 > TheChosenNumber) {
						System.out.println("Your guess is " + guess1 + " which is HIGHER than The Chosen Number");
							} else {	
								System.out.print("Your guess is " + guess1 + " which is correct! You've guessed The Chosen Number on your first guess!");
				}
				// Guess number 2
				if (guess1 < TheChosenNumber || guess1 > TheChosenNumber) {
					System.out.print("Now make your second guess: ");
						int guess2 = guessTwo.nextInt();
							if (guess2 < TheChosenNumber) {
								System.out.println("Your guess is " + guess2 + " which is LOWER than The Chosen Number");
									} else if (guess2 > TheChosenNumber) {
										System.out.println("Your guess is " + guess2 + " which is HIGHER than The Chosen Number");
											} else {	
												System.out.println("Your guess is " + guess2 + " which is correct! You've guessed The Chosen Number on your second guess!");
				}
							// Guess number 3
							if (guess2 < TheChosenNumber || guess2 > TheChosenNumber) {
								System.out.println("Now make your third guess: ");
									int guess3 = guessThree.nextInt();
										if (guess3 < TheChosenNumber) {
											System.out.println("Your guess is " + guess3 + " which is LOWER than The Chosen Number");
												} else if (guess3 > TheChosenNumber) {
													System.out.println("Your guess is " + guess3 + " which is HIGHER than The Chosen Number");
														} else {	
															System.out.print("Your guess is " + guess3 + " which is correct! You've guessed The Chosen Number on your third guess!");
				}
										// Guess number 4
										if (guess3 < TheChosenNumber || guess3 > TheChosenNumber) {
											System.out.println("Now make your fourth guess: ");
												int guess4 = guessFour.nextInt();
													if (guess4 < TheChosenNumber) {
														System.out.println("Your guess is " + guess4 + " which is LOWER than The Chosen Number");
															} else if (guess4 > TheChosenNumber) {
																System.out.println("Your guess is " + guess4 + " which is HIGHER than The Chosen Number");
																	} else {	
																		System.out.print("Your guess is " + guess4 + " which is correct! You've guessed The Chosen Number on your fourth guess!");
				}
													// Guess number 5
													if (guess3 < TheChosenNumber || guess3 > TheChosenNumber) {
														System.out.print("Now make your final guess: ");
															int guess5 = guessFive.nextInt();
																if (guess5 < TheChosenNumber) {
																	System.out.println("You guess " + guess5 + " which is incorrect. You have lost the game. The Chosen Number was " + TheChosenNumber);
																		} else if (guess5 > TheChosenNumber) {
																			System.out.println("You guess " + guess5 + " which is incorrect. You have lost the game. The Chosen Number was " + TheChosenNumber);
																				} else {	
																					System.out.print("Your guess is " + guess5 + " which is correct! You've guessed The Chosen Number on your final guess!");
																					System.out.print("Thank you for playing!");
		
																				}}}}}}}
																				
