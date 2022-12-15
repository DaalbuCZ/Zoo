package cz.devschool.daalbu.zoo;

public class Dog extends Animal{
    private boolean isHuntingMood;
    public Dog(String name, int age, double weight, boolean isHuntingMood) {
        super(name, age, weight);
        this.isHuntingMood = isHuntingMood;
    }

    @Override
    public void makeSound() {
        if(isHuntingMood == true){
            System.out.println("Vrrrrrr Haf Haf");
        }else {
            System.out.println("Haf!");
        }
    }

    public boolean isHuntingMood() {
        return isHuntingMood;
    }
}
