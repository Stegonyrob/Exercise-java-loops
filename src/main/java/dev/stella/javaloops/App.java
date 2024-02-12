package dev.stella.javaloops;


public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Iterator iterator = new Iterator(7);
        System.out.println(iterator.printMultTable(iterator.getSelectedNumber()));
    }
}
