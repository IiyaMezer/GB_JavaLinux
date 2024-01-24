import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Prises prises = new Prises();
        prises.Put(new Toy( "Конструктор", 20));
        prises.Put(new Toy("Робот", 30));
        prises.Put(new Toy("Lego DeathStar", 90));
        prises.Put(new Toy("Кукла", 60));
        prises.Put(new Toy("Мяч", 5));
        prises.Put(new Toy("Мяч", 5));
        prises.Put(new Toy("Мяч", 5));
        prises.Put(new Toy("Робот", 30));
        prises.Put(new Toy("Робот", 30));
        prises.Put(new Toy("Робот", 30));
        prises.Put(new Toy("Lego tehnik", 80));

        try {
            FileWriter writer = new FileWriter("prizes.txt");
            for (int i = 0; i < 10; i++) {
                Toy toy = prises.Get();
                writer.write(toy.getId() + " " + toy.getName() + " " + toy.getFrequency() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }


    }
}