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
		// 1. 배열이 꽉찼는지 검사
		if(top >= DEFAULT_SIZE) {
			// 2. 꽉찬 경우 배열을 늘림
			array = Arrays.copyOf(array, currentCapacity * 2);
			// 3. 현재 최대 용량 값 늘림
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
//     * @param value 값을 넣는다
//     */
//	@Override
//	public void push(T value) {
//	final Sta<T> newStack = new Sta<>(value, count);
//	count ++;
//	}
//	/**
//     * @return 꼭대기에 있는 값을 꺼낸다
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
//     * @return 비어있으면 true
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
