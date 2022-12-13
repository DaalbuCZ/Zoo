package cz.devschool.daalbu.zoo;

public class Cat extends Animal{

    private final boolean isSleeping;

    public Cat(String name, int age, double weight, boolean isSleeping) {
        super(name, age, weight);
        this.isSleeping = isSleeping;
    }

    @Override
    public void makeSound() {
        if(isSleeping == true){
            System.out.println("Meeooow");
        }else{
            System.out.println("Chrrrr meow meow meow");
        }


    }
}
