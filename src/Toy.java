public class Toy {
    private int id;
    private String name;
    private int rareness;

    public Toy(int id, String name, int luck) {
        this.id = id;
        this.name = name;
        this.rareness = luck;
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
