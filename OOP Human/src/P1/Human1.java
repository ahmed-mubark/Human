package P1;

public class Human1 {
// This human is name. //*
	public String name = "Ahmed";
// This human has a lifespan of 20 years. //*
	private int age = 20;
// This human is gender. //*
	static String gender = "male";
	
// return name. //*
	public String getname() {
		return name;
	}
// set a new age. //*
	private void setage(int newage) {
		age = newage;
	}
// set a new gender. //*
	void setgender(String newgender) {
		gender = newgender;
	}

}
