package project;

public class Candidate {
	private String Name;
	private int Age;
	private String City;

	public void setName(String name) {
		Name = name;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void setCity(String city) {
		City = city;
	}

	void disp() {
		System.out.println("Name : " + Name + "\nAge : " + Age + "\nCity : " + City);
	}
}
