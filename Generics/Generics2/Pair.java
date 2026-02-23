public class Pair<KEY, VAL> {
    private KEY key;
    private VAL val;

    public Pair(KEY key, VAL val) {
        this.key = key;
        this.val = val;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", val=" + val +
                '}';
    }

    public KEY getKey() {
        return key;
    }

    public void setKey(KEY key) {
        this.key = key;
    }

    public VAL getVal() {
        return val;
    }

    public void setVal(VAL val) {
        this.val = val;
    }
}

class Dummy<T1, T2, T3, T4> {

}
