package fi.haagahelia.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fridge {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String fridgeName;
	private String mainIngredient;
	private ArrayList<String> ingredients = new ArrayList<>();
	
	
	public Fridge() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Fridge(String fridgeName, String mainIngredient, ArrayList<String> ingredients) {
		super();
		this.fridgeName = fridgeName;
		this.mainIngredient = mainIngredient;
		this.ingredients = ingredients;
	}
	

	public String getMainIngredient() {
		return mainIngredient;
	}


	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}



	public String getFridgeName() {
		return fridgeName;
	}
	public void setFridgeName(String fridgeName) {
		this.fridgeName = fridgeName;
	}
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}



	@Override
	public String toString() {
		return "Fridge [fridgeName=" + fridgeName + ", mainIngredient="
				+ mainIngredient + ", ingredients=" + ingredients + "]";
	}
	

	
	
	
}
