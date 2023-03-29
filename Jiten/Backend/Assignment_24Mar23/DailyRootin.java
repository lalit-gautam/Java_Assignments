package Assignment_24Mar23;

import java.util.Scanner;

public class DailyRootin {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you get up..?");
		String input = sc.nextLine().toLowerCase().trim();
		if (input.equals("y") || input.equals("yes")) {
			System.out.println("Go to toilet.");
			Thread.sleep(2000);
			System.out.println("In toilet......");
			Thread.sleep(10000);
			System.out.println("Toilet complete.");
			System.out.println("Do brush.");
			forBrush();
		} else if (input.equals("n") || input.equals("no")) {
			System.out.println("Get up quickly, Otherwise you will be late for office.");
			Thread.sleep(3000);
			System.out.println("Go to toilet.");
			Thread.sleep(2000);
			System.out.println("In toilet......");
			Thread.sleep(10000);
			System.out.println("Toilet complete.");
			System.out.println("Do brush.");
			forBrush();
		}
		sc.close();
	}

	static void forBrush() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you ready for brush..?");
		String input = sc.nextLine().toLowerCase().trim();
		if (input.equals("y") || input.equals("yes")) {
			System.out.println("I am brushing.....");
			Thread.sleep(5000);
			System.out.println("Brush complete and ready for breakfast.");
			forBathing();
		} else if (input.equals("n") || input.equals("no")) {
			System.out.println("Is toothpaste available?");
			input = sc.nextLine().toLowerCase().trim();
			if (input.equals("y") || input.equals("yes")) {
				System.out.println("I am brushing.....");
				Thread.sleep(5000);
				System.out.println("Brush complete and ready for breakfast.");
				forBathing();
			} else if (input.equals("n") || input.equals("no")) {
				System.out.println("Is is possible to manage from roommate");
				input = sc.nextLine().toLowerCase().trim();
				if (input.equals("y") || input.equals("yes")) {
					System.out.println("I am brushing.....");
					Thread.sleep(5000);
					System.out.println("Brush complete and ready for breakfast.");
					forBathing();
				} else if (input.equals("n") || input.equals("no")) {
					System.out.println("I'm going to market.....");
					Thread.sleep(10000);
					System.out.println("Reached at market.");
					System.out.println("Is sufficient balance for buying toothpaste..?");
					if (input.equals("y") || input.equals("yes")) {
						System.out.println("I bought toothpaste.");
						System.out.println("I'm comming back to room.....");
						Thread.sleep(10000);
						System.out.println("Reached at room.");
						System.out.println("I am brushing......");
						Thread.sleep(5000);
						System.out.println("Brush complete and ready for breakfast.");
						forBathing();
					} else if (input.equals("n") || input.equals("no")) {
						System.out.println("Ask friends for send money.");
						System.out.println("Friend sending money.....");
						Thread.sleep(10000);
						System.out.println("Transection complete...I bought toothpaste.");
						System.out.println("I'm comming back to room.....");
						Thread.sleep(10000);
						System.out.println("Reached at room.");
						System.out.println("I am brushing......");
						Thread.sleep(5000);
						System.out.println("Brush complete and ready for breakfast.");
						forBathing();
					}
				}
			}
		}
		sc.close();
	}

	static void forBathing() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you ready for bath..?");
		String input = sc.nextLine().toLowerCase().trim();
		if (input.equals("y") || input.equals("yes")) {
			System.out.println("I am bathinging.....");
			Thread.sleep(5000);
			System.out.println("Brush complete and ready for breakfast.");
			forBreakfast();
		} else if (input.equals("n") || input.equals("no")) {
			System.out.println("Is toothpaste available?");
			input = sc.nextLine().toLowerCase().trim();
			if (input.equals("y") || input.equals("yes")) {
				System.out.println("I am brushing.....");
				Thread.sleep(5000);
				System.out.println("Brush complete and ready for breakfast.");
				forBreakfast();
			} else if (input.equals("n") || input.equals("no")) {
				System.out.println("Is is possible to manage from roommate");
				input = sc.nextLine().toLowerCase().trim();
				if (input.equals("y") || input.equals("yes")) {
					System.out.println("I am brushing.....");
					Thread.sleep(5000);
					System.out.println("Brush complete and ready for breakfast.");
					forBreakfast();
				} else if (input.equals("n") || input.equals("no")) {
					System.out.println("I'm going to market.....");
					Thread.sleep(10000);
					System.out.println("Reached at market.");
					System.out.println("Is sufficient balance for buying toothpaste..?");
					input = sc.nextLine().toLowerCase().trim();
					if (input.equals("y") || input.equals("yes")) {
						System.out.println("I bought toothpaste.");
						System.out.println("I'm comming back to room.....");
						Thread.sleep(10000);
						System.out.println("Reached at room.");
						System.out.println("I am brushing......");
						Thread.sleep(5000);
						System.out.println("Brush complete and ready for breakfast.");
						forBreakfast();
					} else if (input.equals("n") || input.equals("no")) {
						System.out.println("Ask friends for send money.");
						System.out.println("Friend sending money.....");
						Thread.sleep(10000);
						System.out.println("Transection complete...I bought toothpaste.");
						System.out.println("I'm comming back to room.....");
						Thread.sleep(10000);
						System.out.println("Reached at room.");
						System.out.println("I am brushing......");
						Thread.sleep(5000);
						System.out.println("Brush complete and ready for breakfast.");
						forBreakfast();
					}
				}
			}
		}
		sc.close();
	}

	static void forBreakfast() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("where will you have breakfast..?");
		System.out.println("Room or  market");
		String input = sc.nextLine().toLowerCase().trim();
		if (input.equals("room")) {
			System.out.println("Have something for breakfast in room..?");
			input = sc.nextLine().toLowerCase().trim();
			if (input.equals("y") || input.equals("yes")) {
				System.out.println("Do breakfast.");
				System.out.println("Breakfast continue.....");
				Thread.sleep(10000);
				System.out.println("Breakfast complete.");
				forOffice();
			} else if (input.equals("n") || input.equals("no")) {
				System.out.println("Go to market for breakfast.");
				System.out.println("I am going to market.....");
				Thread.sleep(10000);
				System.out.println("Reached at market.");
				System.out.println("Is sufficient balance for eating breakfast..?");
				input = sc.nextLine().toLowerCase().trim();
				if (input.equals("y") || input.equals("yes")) {
					System.out.println("Do breakfast.");
					System.out.println("Breakfast continue.....");
					Thread.sleep(10000);
					System.out.println("Breakfast complete.");
					forOffice();
				} else if (input.equals("n") || input.equals("no")) {
					System.out.println("Ask friends for send money.");
					System.out.println("Friend sending money.....");
					Thread.sleep(10000);
					System.out.println("Transection complete.");
					System.out.println("Breakfast continue.....");
					Thread.sleep(10000);
					System.out.println("Breakfast complete.");
					forOffice();
				}
			}
		} else if (input.equals("market")) {
			System.out.println("I am going to market.....");
			Thread.sleep(10000);
			System.out.println("Reached at market.");
			System.out.println("Is sufficient balance for eating breakfast..?");
			input = sc.nextLine().toLowerCase().trim();
			if (input.equals("y") || input.equals("yes")) {
				System.out.println("Do breakfast.");
				System.out.println("Breakfast continue.....");
				Thread.sleep(10000);
				System.out.println("Breakfast complete.");
			} else if (input.equals("n") || input.equals("no")) {
				System.out.println("Ask friends for send money.");
				System.out.println("Friend sending money.....");
				Thread.sleep(10000);
				System.out.println("Transection complete.");
				System.out.println("Breakfast continue.....");
				Thread.sleep(10000);
				System.out.println("Breakfast complete.");
				forOffice();
			}
		}
		sc.close();
	}
	
	static void forOffice() throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("how will you go to office.?");
		System.out.println("Public or private..?");
		String input = sc.nextLine().toLowerCase().trim();
		if(input.equals("public")) {
			System.out.println("Is sufficient balance for go by MoBus..?");
			input = sc.nextLine().toLowerCase().trim();
			if(input.equals("y") || input.equals("yes")) {
				System.out.println("I'm waiting at bus stop for MoBus......");
				Thread.sleep(2000);
				System.out.println("Bus arrived and i go to by MoBus......");
				Thread.sleep(10000);
				System.out.println("Reached at Dlf MoBus Stop.");
				

				System.out.println("Walking to LG for lift.....");
				Thread.sleep(2000);
				System.out.println("Reached at LG.");
				System.out.println("Waiting for lift......");
				Thread.sleep(2000);
				System.out.println("Lift arrived and I'm in the lift for go to 9th floor......");
				Thread.sleep(2000);
				System.out.println("Reached at 9th floor.");
			}
			else if(input.equals("n") || input.equals("no")) {
				System.out.println("Arrange money from friends/family.");
				System.out.println("Money sending by friend.......");
				Thread.sleep(2000);
				System.out.println("Money received.");
				System.out.println("I'm waiting at bus stop for MoBus......");
				Thread.sleep(2000);
				System.out.println("Bus arrived and i go to by MoBus......");
				Thread.sleep(10000);
				System.out.println("Reached at Dlf MoBus Stop.");
				
				
				System.out.println("Walking to LG for lift.....");
				Thread.sleep(2000);
				System.out.println("Reached at LG.");
				System.out.println("Waiting for lift......");
				Thread.sleep(2000);
				System.out.println("Lift arrived and I'm in the lift for go to 9th floor......");
				Thread.sleep(2000);
				System.out.println("Reached at 9th floor.");
			}
		}else if(input.equals("private")) {
			System.out.println("By Bike or auto..?");
			input = sc.nextLine().toLowerCase().trim();
			if(input.equals("auto")) {
				System.out.println("Is sufficient balance for go by auto..?");
				input = sc.nextLine().toLowerCase().trim();
				if(input.equals("y") || input.equals("yes")) {
					System.out.println("Go to Dlf by auto.....");
					Thread.sleep(10000);
					System.out.println("Reached Dlf.");
					
					
					System.out.println("Walking to LG for lift.....");
					Thread.sleep(2000);
					System.out.println("Reached at LG.");
					System.out.println("Waiting for lift......");
					Thread.sleep(2000);
					System.out.println("Lift arrived and I'm in the lift for go to 9th floor......");
					Thread.sleep(2000);
					System.out.println("Reached at 9th floor.");
				}else if(input.equals("n") || input.equals("no")) {
					System.out.println("Arrange money from friends/family.");
					System.out.println("Money sending by friend.......");
					Thread.sleep(2000);
					System.out.println("Money received.");
					
					System.out.println("Go to Dlf by auto.....");
					Thread.sleep(10000);
					System.out.println("Reached Dlf.");
					
					
					System.out.println("Walking to LG for lift.....");
					Thread.sleep(2000);
					System.out.println("Reached at LG.");
					System.out.println("Waiting for lift......");
					Thread.sleep(2000);
					System.out.println("Lift arrived and I'm in the lift for go to 9th floor......");
					Thread.sleep(2000);
					System.out.println("Reached at 9th floor.");
				}
			}
			else if(input.equals("bike")) {
				System.out.println("Is sufficient fuel..?");
				input = sc.nextLine().toLowerCase().trim();
				if(input.equals("y") || input.equals("yes")) {
					System.out.println("Go to Dlf by bike.....");
					Thread.sleep(10000);
					System.out.println("Reached Dlf.");
					
					
					System.out.println("Walking to LG for lift.....");
					Thread.sleep(2000);
					System.out.println("Reached at LG.");
					System.out.println("Waiting for lift......");
					Thread.sleep(2000);
					System.out.println("Lift arrived and I'm in the lift for go to 9th floor......");
					Thread.sleep(2000);
					System.out.println("Reached at 9th floor.");
				}else if(input.equals("n") || input.equals("no")) {
					System.out.println("Arrange money from friends/family.");
					System.out.println("Money sending by friend/family.......");
					Thread.sleep(2000);
					System.out.println("Money received.");
					
					System.out.println("Fuel filled.");
					
					System.out.println("Go to Dlf by bike.....");
					Thread.sleep(10000);
					System.out.println("Reached Dlf.");
					
					
					System.out.println("Walking to LG for lift.....");
					Thread.sleep(2000);
					System.out.println("Reached at LG.");
					System.out.println("Waiting for lift......");
					Thread.sleep(2000);
					System.out.println("Lift arrived and I'm in the lift for go to 9th floor......");
					Thread.sleep(2000);
					System.out.println("Reached at 9th floor.");
				}
			}
		}
	}
}
