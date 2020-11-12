
public class Application {

    public static void main(String[] args) {
        final List<String> list = new LinkedList<>();
        list.add("hi");
        list.add("bye");
        list.add("byebye");
        list.add("어서오고");
        list.add("아침부터");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.contains("bye"));
        System.out.println(list.contains("hihi"));
        
        System.out.println(list.remove("byebye"));
    }
}
