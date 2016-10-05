package entity;

public class Voiture {
	private String Marque;
	private String Model;
	private String Color;
	private int Speed;

	public String getMarque() {
		return Marque;
	}

	public void setMarque(String marque) {
		Marque = marque;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	private int Year;
	private double Price;

	public Voiture(String marque, String model, String color, int speed, int year, double price) {
		super();
		Marque = marque;
		Model = model;
		Color = color;
		Speed = speed;
		Year = year;
		Price = price;
	}

	public Voiture() {
		super();
	}
}
