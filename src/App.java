public class App {
    public static void main(String[] args) throws Exception {
        ChristmasTree tree1 = new BubbleLights(new BubbleLights(new ChristmasTreeImpl()));
        System.out.println(tree1.decorate());
    }
}
