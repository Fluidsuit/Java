public class Holder {
    private Object obj;

    public Holder(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "obj=" + obj +
                '}';
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
