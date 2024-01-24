public class Toy {
    private int id;
    private static int currentId = 1;
    private String name;
    private int frequency;

    public Toy(String name, int rareness) {
        this.id = currentId++;
        this.name = name;
        this.frequency = 100-rareness; //Больше редкость - ниже в очереди
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }
    @Override
    public String toString(){
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rareness=" + frequency +
                '}';
    }
}
