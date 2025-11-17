package com.hust.kstn.models;

public class Media {
		private int id;
		private String title;
		private String category;
		private double cost;
		private static int nbMedia= 0;
		public String getTitle() {
			return title;
		}
		public String getCategory() {
			return category;
		}
		public int getId() {
		    return id;
		}
		public double getCost() {
			return cost;
		}

public Media (String title, String category, double cost) {
	this.id = ++nbMedia;
	this.title = title;
	this.category = category;
	this.cost = cost;
}

@Override
public String toString() {
	
	return "[" + this.id + "]" + " - " + "[" + this.title + "]" + " - " + "[" + this.cost + "]" + " - "
			+ "[" + this.category + "]";
}
}
