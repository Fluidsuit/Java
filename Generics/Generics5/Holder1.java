public class Holder1<T> {
    private T data;

    public Holder1(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "data=" + data +
                '}';
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
