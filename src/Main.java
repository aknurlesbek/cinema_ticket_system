public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie(1, "Dune", "Sci-Fi");
        Movie movie2 = new Movie(2, "Avatar", "Fantasy");
        Movie movie3 = new Movie(1, "Dune Part 2", "Sci-Fi");

        Viewer viewer1 = new Viewer(101, "Aruzhan", 18);
        Viewer viewer2 = new Viewer(102, "Dias", 17);
        Viewer viewer3 = new Viewer(101, "Aruzhan", 19);

        System.out.println("=== Movies ===");
        movie1.showInfo();
        movie2.showInfo();
        movie3.showInfo();

        System.out.println("\n=== Viewers ===");
        viewer1.showInfo();
        viewer2.showInfo();
        viewer3.showInfo();

        System.out.println("\n=== Comparison ===");
        System.out.println("movie1 equals movie2: " + movie1.equals(movie2));
        System.out.println("movie1 equals movie3: " + movie1.equals(movie3));
        System.out.println("viewer1 equals viewer2: " + viewer1.equals(viewer2));
        System.out.println("viewer1 equals viewer3: " + viewer1.equals(viewer3));

        System.out.println("\n=== Getter/Setter test ===");
        viewer2.setAge(18);
        System.out.println("viewer2 new age: " + viewer2.getAge());
    }
}