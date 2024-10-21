//This demonstrates the functionality of the Animal Shelter system
public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new Shelter();

        // Enqueue(add) animals
        System.out.println("Enqueuing animals:");
        
        Dog bob = new Dog("Bob");
        System.out.println("Enqueued: " + bob.getName() + " (Dog)");
        shelter.enqueue(bob);
        
        Cat mob = new Cat("Mob");
        System.out.println("Enqueued: " + mob.getName() + " (Cat)");
        shelter.enqueue(mob);
        
        Dog mak = new Dog("Mak");
        System.out.println("Enqueued: " + mak.getName() + " (Dog)");
        shelter.enqueue(mak);
        
        Cat tittens = new Cat("Tittens");
        System.out.println("Enqueued: " + tittens.getName() + " (Cat)");
        shelter.enqueue(tittens);

        System.out.println("\nDequeuing animals:");
        
        // Dequeue(remove/adopt) animals
        Animal dequeued = shelter.dequeueAny();
        System.out.println("Dequeue any: " + dequeued.getName() + " (" + (dequeued instanceof Dog ? "Dog" : "Cat") + ")");
        
        Dog dequeuedDog = shelter.dequeueDog();
        System.out.println("Dequeue dog: " + dequeuedDog.getName());
        
        Cat dequeuedCat = shelter.dequeueCat();
        System.out.println("Dequeue cat: " + dequeuedCat.getName());
        
        dequeued = shelter.dequeueAny();
        System.out.println("Dequeue any: " + dequeued.getName() + " (" + (dequeued instanceof Dog ? "Dog" : "Cat") + ")");
    }
}