import java.util.LinkedList;
import java.util.Queue;

//This class implements AnimalShelter interface with queues for dogs and cats
public class Shelter implements AnimalShelter {
    private Queue<Dog> dogs = new LinkedList<>();
    private Queue<Cat> cats = new LinkedList<>();

//Methods of operations
// Add animal to queue
    @Override
    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogs.offer((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.offer((Cat) animal);
        }
    }

    // Adopt oldest animal from either queue
    @Override
    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return null; 
        } else if (dogs.isEmpty()) {
            return cats.poll(); 
        } else if (cats.isEmpty()) {
            return dogs.poll(); 
        } else {
            Dog oldestDog = dogs.peek();
            Cat oldestCat = cats.peek();
            return (oldestDog.getArrivalTime() < oldestCat.getArrivalTime()) ? dogs.poll() : cats.poll();
        }
    }

    // Adopt the oldest dog
    @Override
    public Dog dequeueDog() {
        return dogs.poll();
    }

    // Adopt the oldest cat
    @Override
    public Cat dequeueCat() {
        return cats.poll();
    }
}