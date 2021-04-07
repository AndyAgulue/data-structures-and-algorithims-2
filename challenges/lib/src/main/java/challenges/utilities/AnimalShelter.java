package challenges.utilities;
import challenges.stacksandqueues.Queue;

public class AnimalShelter {
    Queue<Cat> cats = new Queue<>();
    Queue<Dog> dogs = new Queue<>();

    public void enqueue(Dog dog){
        dogs.enquque(dog);

    }
    public void enqueue(Cat cat){
        cats.enqueue(cat);
    }
    public Animal dequeue(String animal) throws Exception{
        if (dogs.isEmpty() && cats.isEmpty()){
            throw new Exception("Fresh out of Pets");
        }

        if("dog".equals(animal) && !dogs.isEmpty()) return dogs.dequeue();
        if("cat".equals(animal) && !cats.isEmpty()) return cats.dequeue();

        if (dogs.isEmpty()) return dogs.dequeue();
        if (cats.isEmpty()) return dogs.dequeue();
        if (cats.peek().timePlacedInShelter < dogs.peek().timePlacedInShelter){
            return cats.dequeue();
        }
        return dogs.dequeue();
    }

}
