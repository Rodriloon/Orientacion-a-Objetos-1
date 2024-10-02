package ar.edu.unlp.oo1.ejercicio1.impl;
import ar.edu.unlp.oo1.ejercicio1.WallPost;

public class WallPostImpl implements WallPost {
	
	private String text;
	private int likes;
	private boolean featured;

	public WallPostImpl () {
		text = "Undefined post";
		likes = 0;
		featured = false;
	}
	
    public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public int getLikes() {
		return likes;
	}
	public void setLikes(int like) {
		this.likes = like;
	}
	
	public void like() {
		likes++;
	}

	public void dislike() {
		if (likes > 0) {
			likes--;
		}
	}

	public boolean isFeatured() {
		return featured;
	}
	public void setFeatured(boolean featured) {
		this.featured = featured;
	}
	
	public void toggleFeatured() {
		featured = !featured;
	}
	
	@Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
