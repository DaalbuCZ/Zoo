package cz.devschool.daalbu.zoo;

public class Cat extends Animal{

    private final boolean isSleeping;

    public Cat(String name, int age, double weight, boolean isSleeping) {
        super(name, age, weight);
        this.isSleeping = isSleeping;
    }

    @Override
    public void makeSound() {
        if(isSleeping){
            System.out.println("Chrrrr meow meow meow");
        }else{
            System.out.println("Meeooow");
        }


    }

    public boolean isSleeping() {
        return isSleeping;
    }
}
