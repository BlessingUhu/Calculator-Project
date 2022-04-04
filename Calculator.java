import java.util.*;
public class Calculator {
	public static Scanner input = new Scanner(System.in);


	// A scientific and Standard calculator program.
	
	// This program multiplies, divides, add and subtracts user inputs for the standard calculator.
	
	// The scientific calculator does the same job as the standard calculator but also performs trigonometric calculations such as cosine sin and tan. 
	
	// user inputs for the standard calculator can be more than two inputs. For example, the program will calculate 2 + 2 + 6 + 8, etc.
	
	// Scientific calculator only accepts one user input.
	
	
	
	// Main Method:
	
	public static void main(String[] args) {		
		//User input for what type of calculator they want.
		String calcMode = " ";
		
		//Type of operation the user wants to perform, addition, subtraction. etc.
		String operation = "";
		
		// If user wants to Start another calculation
		String response = "";
						
		//Quantity of numbers user wants to add.
		int numbers = 0;
		
		// The operations
		double addition = 0;
		double subtract = 0;
		double division = 0.0;
		double multiply = 0;
		double tangent = 0;
		double cosine = 0;
		double sine = 0;
		double squareRoot = 0;
		double degrees = 0;
		double absoluteValue = 0;
			
		//numbers to be added
		double user = 0.0;
		
		System.out.println("Enter the calculator mode: Standard/Scientific?");
		calcMode = input.next(); 
		
		for(int j = 0; j >=0; j++) {
			
			// standard calculator
			
		if(calcMode.equalsIgnoreCase("standard")) {
			
			System.out.println("The calculator will operate in standard mode.");
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
			operation = input.next();
			
			//takes input of any length
			for(int k = 0; k >= 0; k++) {
			if (!operation.equals("+") && !operation.equals("-") && !operation.equals("/") && !operation.equals("*")) {
				
				System.out.println("Invalid operator " +operation);
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
				operation = input.next();
			}
			}
			//ADDITION
			
			if(operation.equalsIgnoreCase("+")) {
				
				System.out.println("How many numbers do you want to add?");
				numbers = input.nextInt();
				System.out.println("Enter "+numbers+ " numbers");
				
				//user first input
				addition = input.nextDouble();
				
				//The loop executes based on the number of digits the user wants.
				for(int i = 1; i < numbers; i++) {
					//user digits
					user = input.nextDouble();
					
					//calculation
					addition = addition + user;
				}
				System.out.println("Result: "+addition);
				System.out.println("Do you want to start over? (Y/N)");
				response = input.next();
				
				if(response.equalsIgnoreCase("Y")) {
					System.out.println("Enter the calculator mode: Standard/Scientific?");
					calcMode = input.next(); 
					continue; 
				}
				else if(response.equalsIgnoreCase("N")) {
					System.out.println("Goodbye");
					break;
				}
				else {
					break;
				}
				
				
			}
			
			// SUBTRACTION
			
				else if(operation.equalsIgnoreCase("-")) {
					
					System.out.println("How many numbers do you want to subtract?");
					numbers = input.nextInt();
					
					System.out.println("Enter "+numbers+ " numbers");
					
					// taking first number
					subtract = input.nextDouble();
					
					//The loop executes based on the number of digits the user wants.
					for(int i = 1; i < numbers; i++) {
						
						//taking next number
						user = input.nextDouble();
						
						//calculation
						subtract = subtract - user; // order matters because of first input.
					}
					System.out.println("Result: "+subtract);
					System.out.println("Do you want to start over? (Y/N)");
					response = input.next();
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
					else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
					}
					else {
						break;
					}
					
				}
			
			//MULTIPLICATION
			
				else if(operation.equalsIgnoreCase("*")) {
					System.out.println("How many numbers do you want to multiply?");
					numbers = input.nextInt();
					System.out.println("Enter "+numbers+ " numbers");
					
					// take first input
					multiply = input.nextDouble();
					
					//The loop executes based on the number of digits the user wants.
					for(int i = 1; i < numbers; i++) {
						
						// take the rest of the input.
						user = input.nextDouble();
						
						multiply = multiply * user; // order does not matter.
					}
					System.out.println("Result: "+multiply);
					System.out.println("Do you want to start over? (Y/N)");
					response = input.next();
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
					else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
					}
					else {
						break;
					}
					
				}
			
			// DIVISION
			
				else if(operation.equalsIgnoreCase("/")) {
					System.out.println("How many numbers do you want to divide?");
					numbers = input.nextInt();
					System.out.println("Enter "+numbers+ " numbers");
					
					// take first input
					division = input.nextDouble();
					
					//The loop executes based on the number of digits the user wants.
					for(int i = 1; i < numbers; i++) {
						
						// take rest of the input
						user = input.nextDouble();
						
						division = division/user;
					}
					System.out.println("Result: "+division);
					System.out.println("Do you want to start over? (Y/N)");
					response = input.next();
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
					else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
					}
					else {
						break;
					}
					
				}
			}		
		
		//end standard calculator if statement.

			
			// Scientific Calculator.
					
		if(calcMode.equalsIgnoreCase("scientific")) {
			
			System.out.println("The calculator will operate in scientific mode.");
			System.out.println("	Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division,");
			System.out.println("	or 'sin' for sin x, 'cos' for cos x, 'tan' for tan x,");
			System.out.println("	or 'sqrt' for square root, 'rad' for degrees to radians, 'log' for logarithms, and 'abs' for absolute value:");
			
			operation = input.next();
			
			//takes input of any length
			for(int k = 0; k <= operation.length()+1; k++) {
						
			if (!operation.equals("+") && !operation.equals("-") && !operation.equals("/") 
				&& !operation.equals("*") && !operation.equalsIgnoreCase("tan") && !operation.equalsIgnoreCase("sin") 
				&& !operation.equalsIgnoreCase("cos") && !operation.equalsIgnoreCase("sqrt") &&  !operation.equalsIgnoreCase("rad") 
				&&  !operation.equalsIgnoreCase("log") &&  !operation.equalsIgnoreCase("abs")) {
				
				System.out.println("Invalid operator " +operation);
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division 'sin' for sin x, 'cos' for cos x, 'tan' for tan x: ");
				operation = input.next();
			}
			}
				//ADDITION
			
			if(operation.equalsIgnoreCase("+")) {
				
				System.out.println("How many numbers do you want to add?");
				numbers = input.nextInt();
				System.out.println("Enter "+numbers+ " numbers");
				
				//The loop executes based on the number of digits the user wants.
				for(int i = 0; i < numbers; i++) {
					//user digits
					user = input.nextDouble();
					
					//calculation
					addition = addition + user;
				}
				System.out.println("Result: "+addition);
				System.out.println("Do you want to start over? (Y/N)");
				response = input.next();
				
				if(response.equalsIgnoreCase("Y")) {
					System.out.println("Enter the calculator mode: Standard/Scientific?");
					calcMode = input.next(); 
					continue; 
				}
				else if(response.equalsIgnoreCase("N")) {
					System.out.println("Goodbye");
					break;
				}
				else {
					break;
				}
				
			}
			
			// SUBTRACTION
			
				else if(operation.equalsIgnoreCase("-")) {
					
					System.out.println("How many numbers do you want to subtract?");
					numbers = input.nextInt();
					
					System.out.println("Enter "+numbers+ " numbers");
					
					// taking first number
					subtract = input.nextDouble();
					
					//The loop executes based on the number of digits the user wants.
					for(int i = 1; i < numbers; i++) {
						
						//taking next number
						user = input.nextDouble();
						
						//calculation
						subtract = subtract - user; // order matters because of first input.
					}
					System.out.println("Result: "+subtract);
					System.out.println("Do you want to start over? (Y/N)");
					response = input.next();
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
					else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
					}
					else {
						break;
					}
					
				}
			
			//MULTIPLICATION
			
				else if(operation.equalsIgnoreCase("*")) {
					System.out.println("How many numbers do you want to multiply?");
					numbers = input.nextInt();
					System.out.println("Enter "+numbers+ " numbers");
					
					// take first input
					multiply = input.nextDouble();
					
					//The loop executes based on the number of digits the user wants.
					for(int i = 1; i < numbers; i++) {
						
						// take the rest of the input.
						user = input.nextDouble();
						
						multiply = multiply * user; // order does not matter.
					}
					System.out.println("Result: "+multiply);
					System.out.println("Do you want to start over? (Y/N)");
					response = input.next();
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
					else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
					}
					else {
						break;
					}
					
				}
			
			// DIVISION
			
				else if(operation.equalsIgnoreCase("/")) {
					System.out.println("How many numbers do you want to divide?");
					numbers = input.nextInt();
					System.out.println("Enter "+numbers+ " numbers");
					
					// take first input
					division = input.nextDouble();
					
					//The loop executes based on the number of digits the user wants.
					for(int i = 1; i < numbers; i++) {
						
						// take rest of the input
						user = input.nextDouble();
						
						division = division/user;
					}
					System.out.println("Result: "+division);
					System.out.println("Do you want to start over? (Y/N)");
					response = input.next();
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
					else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
					}
					else {
						break;
					}
					
				}			
			
					//Tangent
				
				else if(operation.equalsIgnoreCase("tan")) {
					System.out.println("Enter a number in radians to find the tangent");
					numbers = input.nextInt();
					
					tangent = Math.tan(numbers);
					
					System.out.println("Result: "+tangent);
					System.out.println("Do you want to start over? (Y/N)");
					response= input.next();
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
					else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
					}
					else {
						break;
					}
					
				
				}
			
				else if(operation.equalsIgnoreCase("cos")) {
					System.out.println("Enter a number in radians to find the cosine");
					numbers = input.nextInt();
					
					cosine = Math.cos(numbers);
					
					System.out.println("Result: "+cosine);
					System.out.println("Do you want to start over? (Y/N)");
					response= input.next();
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
					else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
					}
					else {
						break;
					}
					
				
				}
			
				else if(operation.equalsIgnoreCase("sin")) {
					System.out.println("Enter a number in radians to find the sine");
					numbers = input.nextInt();
					
					sine = Math.sin(numbers);
					
					System.out.println("Result: "+sine);
					System.out.println("Do you want to start over? (Y/N)");
					response= input.next();
					
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
						else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
						}
						else {
						break;
							}
				}
				
				else if(operation.equalsIgnoreCase("sqrt")) {
					System.out.println("Enter a number to find the square root");
					numbers = input.nextInt();
					
					squareRoot = Math.sqrt(numbers);
					
					System.out.println("Result: "+squareRoot);
					System.out.println("Do you want to start over? (Y/N)");
					response= input.next();
					
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
						else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
						}
						else {
						break;
							}
				}
			
				else if(operation.equalsIgnoreCase("rad")) {
					System.out.println("Enter a number in degrees to go from degrees to radians");
					degrees = input.nextInt();
					
					degrees = Math.toRadians(numbers);
					
					System.out.println("Result: "+degrees);
					System.out.println("Do you want to start over? (Y/N)");
					response= input.next();
					
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
						else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
						}
						else {
						break;
							}
					}
			
				else if(operation.equalsIgnoreCase("log")) {
					System.out.println("Enter a number to find the log of");
					numbers = input.nextInt();
					
					log = Math.log(numbers);
					
					System.out.println("Result: "+log);
					System.out.println("Do you want to start over? (Y/N)");
					response= input.next();
					
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
						else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
						}
						else {
						break;
							}
					}
				else if(operation.equalsIgnoreCase("abs")) {
					System.out.println("Enter a number to find the absolute value");
					numbers = input.nextInt();
					
					absoluteValue = Math.abs(numbers);
					
					System.out.println("Result: "+absoluteValue);
					System.out.println("Do you want to start over? (Y/N)");
					response= input.next();
					
					
					if(response.equalsIgnoreCase("Y")) {
						System.out.println("Enter the calculator mode: Standard/Scientific?");
						calcMode = input.next(); 
						continue; 
					}
						else if(response.equalsIgnoreCase("N")) {
						System.out.println("Goodbye");
						break;
						}
						else {
						break;
							}
					}
			
			}
		//End of scientific calculator if statement.
		}
		input.close();
		//End of program.
	}
}
