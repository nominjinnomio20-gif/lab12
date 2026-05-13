
    public class Cat extends Pet{
    public String speak;
    public Cat(String name,String speak){
        super(name);
        this.speak="Meow";
    }
    public String speak(){
        return speak;
    }
}

