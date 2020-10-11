package p1;

public class Human1 {
// Human name. //*
	public String name = "Ahmed";
// The human age. //*
	public int age = 20;
// Human gender. //*
	static String gender = "male";
// Human height. //*
	static int height = 168;
// Human weight. //*
	private int weight = 119;
// Human eye color. //*	
 	public String EyeColor = "hazel";
	
// Create object 1. //*
 	public Human1(String newname, int newage, String newgender) {
 		
 	}
// Create object 2. //*
 	public Human1(int newheight, int newweight, String newEyeColor) {
 		
 	}
 	
// Return name. //*
	public String getname() {
		return name;
	}
// Return age. //*
	public int getage() {
		return age;
	}
// Set a new gender. //*
	void setgender(String newgender) {
		gender = newgender;		
	}
// Set a new height. //*
	void setheight(int newheight) {
		height = newheight;
	}
// Return weight. //*
	private int getweight() {
		return weight;
	}
// 	Set a new Eye Color. //*
	public void setEyeColor(String newEyeColor) {
		EyeColor = newEyeColor;
	}
	
}	
