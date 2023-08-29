import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(23);
        num.add(34);
        num.add(56);
        num.add(78);
        num.stream().filter(n-> n>30).forEach(System.out::println);
    }
}