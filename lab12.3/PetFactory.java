public class PetFactory {
    public static Pet createPet(String type, String name){
        if(type.equals("Dog")){
            return new Dog(name,"Woof");
        } else if(type.equals("Cat")){
            return new Cat(name,"Meow");
        } else if(type.equals("Bird")){
            return new Bird(name,"Jiv Jiv");
        } else {
            System.out.println("tiim turliin amitan baihgui");
            return null;
        }
    }
}
