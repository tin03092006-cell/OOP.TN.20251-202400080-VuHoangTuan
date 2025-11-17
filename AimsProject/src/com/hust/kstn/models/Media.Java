package com.hust.kstn.models;

public abstract class Media { 
    
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(String title) {
        this.title = title;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public float getCost() { return cost; }
    public void setCost(float cost) { this.cost = cost; }
	public void play() {
        System.out.println("Playing track: " + this.getTitle());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Media) {
             Media media = (Media) obj;
             return media.title.equals(this.title);
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Media - " + title + " - " + category + " - " + cost + "$";
    }
}