// This Defines 4 methods for the animal shelter
public interface AnimalShelter {
    // Add an animal to the shelter
    void enqueue(Animal animal);
    
    // Adopt or remove the oldest animal from the shelter
    Animal dequeueAny();
    
    // Adopt or remove the oldest dog from the shelter
    Dog dequeueDog();
    
    // Adopt or remove the oldest cat from the shelter
    Cat dequeueCat();
}