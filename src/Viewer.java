public class Viewer {
    private int id;
    private String name;
    private int age;

    public Viewer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public void showInfo() {
        System.out.println("Viewer ID: " + id + ", Name: " + name + ", Age: " + age);
    }

    public boolean equals(Viewer other) {
        return other != null && this.id == other.id;
    }
}