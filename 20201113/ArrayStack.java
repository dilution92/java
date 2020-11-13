import java.util.Arrays;

public class ArrayStack<T> implements Stack<T>{
	
	private final int DEFAULT_SIZE=5; 
	private Object[] array = new Object[DEFAULT_SIZE];
	private int top = 0;
	private int currentCapacity = DEFAULT_SIZE;
	
	@Override
	public void push(T value) {
		ensureCapacity();
		array[top++] = value;
	}
	
	private void ensureCapacity() {
		// 1. �迭�� ��á���� �˻�
		if(top >= DEFAULT_SIZE) {
			// 2. ���� ��� �迭�� �ø�
			array = Arrays.copyOf(array, currentCapacity * 2);
			// 3. ���� �ִ� �뷮 �� �ø�
			currentCapacity *= 2;
		}
	}

	@Override
	public T pop() {
		if(top <= 0) {
			return null;
		}
		top -= 1;
		final Object result = array[top];
		array[top] = null;
		return (T) result;
	}
    @Override
    public boolean isEmpty() {
        return array[0] == null;
    }

	
	
	
	
	
	
	
//	private int count = 0;
//	 /**
//     * @param value ���� �ִ´�
//     */
//	@Override
//	public void push(T value) {
//	final Sta<T> newStack = new Sta<>(value, count);
//	count ++;
//	}
//	/**
//     * @return ����⿡ �ִ� ���� ������
//     */
//	@Override
//	public T pop() {
//	Sta<T> Stack = ;
//	for (int i = 0; i < count; i++) {
//		if(Stack.getIndex() == count) {
//			
//		}
//	}
//		return null;
//	}
//	/**
//     * @return ��������� true
//     */
//	@Override
//	public boolean isEmpty() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	
//	public static class Sta <T> {
//		private T data;
//		private int index;
//		
//		public Sta(T data, int index) {
//			super();
//			this.data = data;
//			this.index = index;
//		}
//
//		public int getIndex() {
//			return index;
//		}
//	}

	
}
