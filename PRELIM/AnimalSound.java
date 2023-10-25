import java.util.Scanner;

// Animal class hierarchy
   class Animal {
   String name;
   String sound;

   public Animal(String name, String sound) {
   this.name = name;
   this.sound = sound;
   }

   public void makeSound() {
   System.out.println(name + " says: " + sound);
   }
   }

   public class AnimalSound {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   
   // Create animal objects
   Animal[] animals = {
   new Animal("Dog", "Aw aw aw!"),
   new Animal("Cat", "Meow meow meow!"),
   new Animal("Cow", "Moo moo moo!"),
   new Animal("Fox", "Ring-ding-ding-ding-dingeringeding!")
   };

   System.out.println("Select an animal:");
   for (int i = 0; i < animals.length; i++) {
   System.out.println((i + 1) + ". " + animals[i].name);
   }
   System.out.print("Enter a number: ");

   int choice = scanner.nextInt();

   if (choice >= 1 && choice <= animals.length) {
   Animal selectedAnimal = animals[choice - 1];
   selectedAnimal.makeSound();
   } else {
   System.out.println("Invalid choice.");
   }

   scanner.close();
   }
}