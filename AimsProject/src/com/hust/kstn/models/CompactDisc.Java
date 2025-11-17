package com.hust.kstn.models;

public class CompactDisc extends Disc{
	private Track[] tracks = new Track[10];
	 private int trackCount = 0;
	 private String[] artists;
	 private String[] directors;
	 public CompactDisc(String title,double cost, String type,  String[] artists, String[] directors, Track[] tracks) {
		 super( title, type, cost);

	        this.artists = new String[artists.length];
	        for (int i = 0; i < artists.length; i++) {
	        	this.artists[i] = artists[i];
	        }
	            

	        this.directors = new String[directors.length];    
	        for (int i = 0; i < directors.length; i++) {
	        	this.directors[i] = directors[i];
	        }
	            

	        for (int i = 0; i < tracks.length; i++)  {
	        	if (tracks[i] != null) {
	                this.tracks[i] = tracks[i];
	                trackCount++;
	        }
	        }
	            
	    }
	 public int totalLength() {
	        int totalLength = 0;
	        for (int i = 0; i < trackCount; i++)
	        	totalLength += tracks[i].getLength();
	        return totalLength;
	    }
	 @Override
	    public String toString() {
		 String result = super.toString() + "["
		            + totalLength() + "]\n";
		 result += "Artists: ";
		 for (int i = 0; i < artists.length; i++) {
	        	result+= artists[i];
	        }
		 result += "\n";
		 result += "Directors: ";
		 for (int i = 0; i < directors.length; i++) {
	        	result+= directors[i];
	        }
		 result += "\n";
		 result += "Tracks: ";
	        for (int i = 0; i < trackCount; i++)     
	            result += this.tracks[i].toString();
	        return result;
	    }
	 
	 public void addTrack(Track Track) {
		 if (trackCount >= 30) {
	            System.out.println("The CD is almost full");
	            return;
	        }
	        this.tracks[trackCount] = Track;
	        trackCount++;
	        System.out.println("The track has been added successfully");
	    }
	 public void removeTrack(Track Track) {
	        if (trackCount == 0) {
	            System.out.println("The CD is empty");
	            return;
	        }

	        boolean found = false;
	        for (int i = 0; i < trackCount; i++) {
	            if (tracks[i] == Track) {
	                for (int j = i; j < trackCount - 1; j++) {
	                	tracks[j] = tracks[j + 1];
	                }
	                tracks[trackCount - 1] = null; 
	                trackCount--;
	                found = true;
	                System.out.println("The track has been removed sucessfully");
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("The track does not exist");
	        }
	    }
	 
}