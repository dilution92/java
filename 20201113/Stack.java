public interface Stack<T> {

    /**
     * @param value ���� �ִ´�
     */
    void push(T value);
    /**
     * @return ����⿡ �ִ� ���� ������
     */
    T pop();

    /**
     * @return ��������� true
     */
    boolean isEmpty();
}
