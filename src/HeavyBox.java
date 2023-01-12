public class HeavyBox {
    String name;
    Integer weight;

    public HeavyBox() {
    }

    public HeavyBox(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;

    }

    @Override
    public String toString() {
        return
                "\nName: " + name +
                " | Weight: " + weight
               ;
    }
}
