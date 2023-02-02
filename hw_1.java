
// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;

public class hw_1 {

    public static LinkedList<Integer> getReverse(LinkedList<Integer> list){
        LinkedList<Integer> newlist = new LinkedList<>();
        int k = 2;
        for(int i = 0; i < list.size(); i++) {
            newlist.add(list.get(k-i));

        }
        System.out.println(newlist);
        return newlist;
    }




    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(14);
        list.add(17);
        System.out.println(list);

        getReverse(list);


    }
    
}
