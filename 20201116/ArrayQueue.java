import java.util.ArrayList;
import java.util.List;

public class ArrayQueue<T> implements Queue<T> {

    private static final int DEFAULT_SIZE = 5;

    private Object[] queue = new Object[DEFAULT_SIZE];
    private int rear = -1;
    private int front = -1;

    @Override
    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("full");
            return;
        }
        queue[++rear] = data;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        front = ++front % DEFAULT_SIZE;
        return (T) queue[front];
    }

    private boolean isFull() {
        return rear == (DEFAULT_SIZE - 1);
    }

    private boolean isEmpty() {

        return front == rear;
    


	
//	final private List<T> list = new ArrayList<>();
//	
//	@Override
//	public void enqueue(T data) {
//	list.add(data);
//	}
//
//	@Override
//	public T dequeue() {
//		T a = list.get(0);
//		list.remove(0);
//		return a;
	}

	
}
