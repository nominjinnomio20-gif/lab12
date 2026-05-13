public class Bird extends Pet{
    public String speak;
    public Bird(String name,String speak){
        super(name);
        this.speak="Jiv Jiv";
    }
    public String speak(){
        return speak;
    }
}
