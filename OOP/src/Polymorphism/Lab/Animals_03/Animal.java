package Polymorphism.Lab.Animals_03;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.setName(name);
        this.setFavouriteFood(favouriteFood);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    protected void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    protected String explainSelf(){
        return String.format("I am %s and my favourite food is %s%n", this.getName(), this.getFavouriteFood());
    }
}
