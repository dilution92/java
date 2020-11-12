
public class LinkedList<T> implements List<T> {

	private Node<T> head;

	@Override
	public int size() {
		// 1. 머리가 있는 경우
		if(head == null) {
			return 0;
		}

		// 2. 머리가 있는 경우
		int size = 1;
		Node<T> pointer = head;
		while (pointer.getNext() != null) {
			pointer = pointer.getNext();
			size ++;
		}
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public T get(int index) {
		if(head == null) {
			return null;
		}
		int getIndex =0;
		Node<T> pointer = head;
		while (getIndex != index ) {
			pointer = pointer.getNext();
			getIndex ++;
			if(pointer == null) {
				return null;
			}
		}
		return pointer.data;
	}

	@Override
	public boolean contains(T element) {
		if(head == null) {
			return false;
		}

		Node<T> pointer = head;
		while (!pointer.data.equals(element)) {
			pointer = pointer.getNext();
			if(pointer == null) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean add(T element) {
		final Node<T> newNode = new Node<>(element, null);
		// 1. head가 없는 경우
		if (head == null) {
			head = newNode;
			return true;
		}

		// 2. head가 있는 경우
		Node<T> pointer = head;
		while (pointer.getNext() != null) {
			pointer = pointer.getNext();
		}
		pointer.setNext(newNode);
		return true;
	}

	@Override
	public boolean remove(T element) {
		// 1. 머리가 없다
		if (head == null) {
			return false;
		}

		Node<T> pointer = head;
		while (pointer.getNext() != null && pointer.getData() != element) {
			pointer = pointer.getNext();
		}
		final Node<T> next = pointer.getNext();
		// 1. next의 값을 pointer로
		pointer.setData(next.getData());
		// 2. pointer의 next를 다음 노드의 다음 노드로 변경
		pointer.setNext(next.getNext());
		// 3. pointer의 다음 노드였던 친구의 next를 null로
		next.setNext(null);
		return true;
	}

	@Override
	public void clear() {
		head = null;
	}

	private static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
	}
}
