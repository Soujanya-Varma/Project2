package project;

import java.util.Scanner;

public class KBK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Questions q = new Questions();
		Candidate c = new Candidate();
		Life lif = new Life();
		System.out.println("Enter Name :");
		String n = sc.next();
		System.out.println("Enter Age :");
		int a = sc.nextInt();
		System.out.println("Enter City :");
		String city = sc.next();
		System.out.println();
		System.out.println("Candidate Details :\n");
		c.setName(n);
		c.setAge(a);
		c.setCity(city);
		c.disp();
		System.out.println();
		System.out.println("Welcome to the game\n");
		System.out.println("Rules :\n");
		System.out.println("-->There are 10 questions. Each question contains 5 options.\n-->Only one answer is correct among the given options (A,B,C,D) and option E is lifeline.\n-->If your answer is correct then you will get some amount and go to next question.\n-->If your answer is wrong then you will get amount you won till then and game over.\n-->If you have any doubt about correct answer you can use lifelines.\n-->You have 2 lifelines 50-50 and poll. You cannot use same lifeline more than once.\n-->You can also use both lifelines for same question.\n-->You can also quit by entering Q.\n");
		System.out.println("Amount :\n");
		System.out.println("Question 1 : 10,000\nQuestion 2 : 20,000\nQuestion 3 : 50,000\nQuestion 4 : 1,00,000\nQuestion 5 : 5,00,000\nQuestion 6 : 10,00,000\nQuestion 7 : 20,00,000\nQuestion 8 : 40,00,000\nQuestion 9 : 80,00,000\nQuestion 10 : 1,00,00,000\n");
		System.out.println("ALL THE BEST\nLets start the game\nGame Begins......");
		System.out.println();
		String cor = "correct";
		for (int i = 0; i < 10; i++) {
			if (cor.equals("correct")) {
				System.out.println(q.ques[i]);
			}
			String ans = sc.next();
			if (ans.equals(q.ans[i])) {
				cor = "correct";
				System.out.println("\nCorrect answer");
				System.out.println("you won Rs." + q.amt[i+1]);
			} 
			else if (ans.equals("E")) {
				lif.lifeline(i);
				
			} 
			else if(ans.equals("Q")) {
				System.out.println("Quit");
				System.out.println("you won Rs." + q.amt[i]);
				System.out.println("GAME OVER");
				System.exit(0);
			}
			else {
				System.out.println("\nWrong answer");
				System.out.println("you won Rs." + q.amt[i]);
				System.out.println("GAME OVER");
				break;
			}
			if(i==9) {
				System.out.println("Congratulations you are the winner.");
				System.out.println("GAME OVER");
				System.exit(0);
			}
		}
	}
}
