public class Animal {
    public int age;
    public String gender;

    public void isMammal(){
        System.out.println("Prints whether animal is a mammal");
    }

    public void mate(){
        System.out.println("Prints if animal is mated.");
    }

    public static void main(String[] args) throws Exception {
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();
        myAnimal.isMammal();
        myAnimal.mate();
        myFish.isMammal();
        myFish.mate();
        myZebra.isMammal();
        myZebra.mate();
        myZebra.run();
    }
}

class Fish extends Animal {
    private double sizeInFeet = 0;

    private boolean canEat(){
        if(sizeInFeet >1){
            return true;
        }
        else{
            return false;
        }
    }
}

class Zebra extends Animal {
    public boolean is_wild;

    public void run(){
        System.out.println("The zebra is running.");
    }
}