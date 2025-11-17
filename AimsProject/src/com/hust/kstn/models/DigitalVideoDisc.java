package com.hust.kstn.models;

public class DigitalVideoDisc {
	private final String title;
	private String type;
	private String director;
	private int length;
	private double cost;
	public String getTitle() {
		return title;
	}
	public String getType() {
		return type;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public double getCost() {
		return cost;
	}
	public DigitalVideoDisc(String title, String type, String director, int length, double cost) {

		this.title = title;
		this.type = type;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
}
