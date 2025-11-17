package com.hust.kstn.models;

public class DigitalVideoDisc {
	private final String title;
	private String category;
	private String director;
	private int length;
	private double cost;
    private static int nbDigitalVideoDiscs = 0;
	private int id;
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
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

	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
}
