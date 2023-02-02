// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
import java.util.*;
import java.util.Scanner;
public class hw_2 {
    

    public static Queue<Integer> first(Queue <Integer> queue){

        System.out.printf("первый элемент из очереди =  %d \n", queue.peek());
        System.out.println(queue);
        return queue;

    }

    public static Queue<Integer> dequeue(Queue <Integer> queue){

        System.out.printf("первый элемент до его удаления =  %d \n", queue.peek());
        queue.remove();
        System.out.println(queue);
        return queue;
    }

    public static Queue<Integer> enqueue(Queue queue){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для добавления в конец очереди: ");
        String temp = scanner.nextLine();
        int num = Integer.parseInt(temp);

        queue.add(num);
        System.out.println(queue);
        return queue;
    }
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(17);
        queue.add(123);
        queue.add(18);
        queue.add(45);
        queue.add(21);
        System.out.println(queue);

        System.out.println();
        enqueue(queue);

        System.out.println();
        dequeue(queue);

        System.out.println();
        first(queue);

    }

}
