
//Holder class is not type safe
public class Holder {
    private Object data;

    public Holder(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
