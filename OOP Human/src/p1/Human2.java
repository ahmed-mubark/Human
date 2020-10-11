package p1;

public class Human2 {
         // main method. //*
	public static void main(String[] args) {
// Print the name. //*
		Human1 name = new Human1("Ahmed", 20, "male");
		System.out.println("My name is " + name.getname() + ".");
		
// Print the age. //*
		Human1 age = new Human1("Ahmed", 20, "male");
		System.out.println("I am " + age.getage() + " years old.");
		
// Print the gender. //*
		Human1 gender = new Human1("Ahmed", 20, "male.");
		gender.setgender("male");
		System.out.println("My gender is " + Human1.gender + ".");
		
// Print the height. //*
		Human1 height = new Human1(168, 119, "hazel");
		height.setheight(168);
		System.out.println("My height is " + Human1.height + " centimeters.");
		
// Print the weight. //*
        Human1 EyeColor = new Human1(168, 119, "hazel");
        EyeColor.setEyeColor("hazel");
        System.out.println("My eye color is " + EyeColor.EyeColor + ".");
	}

}
