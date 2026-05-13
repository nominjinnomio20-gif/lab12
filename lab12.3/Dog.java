public class Dog extends Pet{
    public String speak;
    public Dog(String name,String speak){
        super(name);
        this.speak="Woof";
    }
    public String speak(){
        return speak;
    }
}

