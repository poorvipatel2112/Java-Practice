import java.util.ArrayList;

public class Collection {
    public static void main(String[] args){
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Orange");
        color.add("White");
        color.add("Black");


        //to print elements in form of list
        System.out.println(color);

        // to iterate through elements of color
        // for(String element : color){
        //     System.out.println(element);
        // }


        // to add blue color at index 0
        color.add(0, "Blue");
        System.out.println(color);
    }
}
