package Encapsulation.Exercise.PizzaCalories_04;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }
    private void setWeight(double weight) {
        if (weight > 0 && weight <= 200){
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }
    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")){
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public double calculateCalories(){
        double caloriesPerFlour = 0;
        if (this.flourType.equals("White")){
            caloriesPerFlour = 1.5;
        } else if (this.flourType.equals("Wholegrain")) {
            caloriesPerFlour = 1.0;
        }
        double caloriesPerTechnique = 0;
        if (this.bakingTechnique.equals("Crispy")){
            caloriesPerTechnique = 0.9;
        } else if (this.bakingTechnique.equals("Chewy")) {
            caloriesPerTechnique = 1.1;
        } else if (this.bakingTechnique.equals("Homemade")) {
            caloriesPerTechnique = 1.0;
        }
        return (2 * this.weight) * caloriesPerFlour * caloriesPerTechnique;
    }
}
