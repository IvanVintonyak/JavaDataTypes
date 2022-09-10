package work;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    @Override
    public void speak(){
        super.speak();
        System.out.println("No, I am dog\n");
    }

}
