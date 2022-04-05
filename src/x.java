import java.util.ArrayList;

public class x {
    private int id;
    private String name;

    public x(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ArrayList<Integer>integerArrayList=new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(2);
        x x=new x(1,"a");
        System.out.println(integerArrayList.contains(x.name));
    }
}
