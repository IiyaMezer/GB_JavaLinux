import java.util.Comparator;
import java.util.PriorityQueue;

public class Prises {

    public PriorityQueue<Toy> queue;

    public Prises() {
        queue = new PriorityQueue<>(Comparator.comparingInt(Toy::getRareness));
    }

    public void Put(Toy toy){
        queue.offer(toy);
    }

    public Toy Get(){
        return queue.poll();
    }
}
