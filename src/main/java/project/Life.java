package project;

import java.util.Scanner;

public class Life {
	
	Scanner sc = new Scanner(System.in);
	Questions q = new Questions();
	Candidate c = new Candidate();
	Lifeline li = new Lifeline();
	Fifty50  f = new Fifty50();
	Poll p = new Poll();
	String cor;
	void lifeline(int i) {
		int count = 0;
		System.out.println("\nAvailable lifelines : ");
		for (int j = 0; j < 2; j++) {
			if (li.l1[j] == true) {
				System.out.println(li.l[j] + "  ");
				count++;
			} 
		}
		if(count>0) {
			System.out.println("Select available lifelines");
			int l = sc.nextInt();
			while(l!=1 && l!=2) {
				System.out.println("Select 1 or 2 only");
				l = sc.nextInt();
			}
			if(li.l1[l-1]==true && l==1) {
				System.out.println(f.f50[i]);
				li.l1[l-1] = false;
				String ans1 = sc.next();
				if (ans1.equals(q.ans[i])) {
					cor = "correct";
					System.out.println("\nCorrect answer");
					System.out.println("you won Rs." + q.amt[i+1]);
				} 
				else if(ans1.equals("E")){
					lifeline(i);
				}
				else if(ans1.equals("Q")) {
					System.out.println("Quit");
					System.out.println("you won Rs." + q.amt[i]);
					System.out.println("GAME OVER");
					System.exit(0);
				}
				else {
					System.out.println("\nWrong answer");
					System.out.println("you won Rs." + q.amt[i]);
					System.out.println("GAME OVER");
					System.exit(0);
				}
			}
			else if(li.l1[l-1]==true && l==2) {
				System.out.println(p.p[i]);
				li.l1[l-1] = false;
				String ans1 = sc.next();
				if (ans1.equals(q.ans[i])) {
					cor = "correct";
					System.out.println("\nCorrect answer");
					System.out.println("you won Rs." + q.amt[i+1]);
				} 
				else if(ans1.equals("E")){
					lifeline(i);
				}
				else if(ans1.equals("Q")) {
					System.out.println("Quit");
					System.out.println("you won Rs." + q.amt[i]);
					System.out.println("GAME OVER");
					System.exit(0);
				}
				else {
					System.out.println("\nWrong answer");
					System.out.println("you won Rs." + q.amt[i]);
					System.out.println("GAME OVER");
					System.exit(0);
				}
				
			}
		}
		else {
			System.out.println("No lifelines available");
			String ans = sc.next();
			if (ans.equals(q.ans[i])) {
				cor = "correct";
				System.out.println("\nCorrect answer");
				System.out.println("you won Rs." + q.amt[i+1]);
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
				System.exit(0);
			}
		}
	}
}
