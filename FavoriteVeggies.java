import java.util.ArrayList;

public class FavoriteVeggies {

  public static void main(String[] args) {
    // A-List
    ArrayList<String> favoriteVegetables = new ArrayList<>();
    favoriteVegetables.add("Bhindi");
    favoriteVegetables.add("Spinach");
    favoriteVegetables.add("Mushrooms");
    favoriteVegetables.add("Karela");
    System.out.println("Original ArrayList: " + favoriteVegetables);
    // 1. Add
    favoriteVegetables.add("Tomato");
    System.out.println("After adding 'Tomato': " + favoriteVegetables);
    // 2. Remove
    favoriteVegetables.remove("Karela");
    System.out.println("After removing 'Karela': " + favoriteVegetables);
    // 3. Getindex
    int mushroomIndex = favoriteVegetables.indexOf("Mushrooms");
    System.out.println("Index of 'Mushrooms': " + mushroomIndex);
    // 4. Sorting ArrayList in ascending order
    favoriteVegetables.sort(null);  // Pass null to use the natural ordering of String
    System.out.println("Sorted ArrayList: " + favoriteVegetables);
  }
}