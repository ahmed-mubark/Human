package P1;

public class Human2 {
         // main method. //*
	public static void main(String[] args) {
// print the name. //*
		Human1 name = new Human1();
		System.out.println("My name is " + name.getname());
// print the gender. //*
		Human1 gender = new Human1();
		gender.setgender("male");
		System.out.println("My gender is " + Human1.gender);

	}

}
