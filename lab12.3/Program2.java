public class Program2 {
    public static void main(String[] args) {
        Pet[] pets = new Pet[5];
        
        pets[0] = PetFactory.createPet("Dog", "Baldan");
        pets[1] = PetFactory.createPet("Cat", "Bulgaa");
        pets[2] = PetFactory.createPet("Bird", "Sodoo");
        pets[3] = PetFactory.createPet("Dog", "Tsekv");
        pets[4] = PetFactory.createPet("Cat", "Baaska");

        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i].getName() + ": " + pets[i].speak());
        }
    }
}