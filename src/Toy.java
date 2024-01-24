public class Toy {
    private static int id;
    private String name;
    private int rareness;

    public Toy(String name, int rareness) {
        this.id++;
        this.name = name;
        this.rareness = 100-rareness; //Больше редкость - ниже в очереди
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRareness() {
        return rareness;
    }
    @Override
    public String toString(){
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rareness=" + rareness +
                '}';
    }
}
