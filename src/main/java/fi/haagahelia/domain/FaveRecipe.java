package fi.haagahelia.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class FaveRecipe {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String recipeName;
	private String image;
	private String url;
	
	public FaveRecipe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FaveRecipe(String recipeName, String image, String url) {
		super();
		this.recipeName = recipeName;
		this.image = image;
		this.url = url;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Recipe [recipeName=" + recipeName + ", image=" + image
				+ ", url=" + url + "]";
	}
	
	
	
	
	
	
}
