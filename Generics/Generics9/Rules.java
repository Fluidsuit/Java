public interface Rules<T> {
    void put(T val);
    T get();
}

class MyClass4<CT, IT> implements Rules<IT> {
    @Override
    public void put(IT val) {

    }

    @Override
    public IT get() {
        return null;
    }
}

class MyClass3<T> implements Rules<T> {
    @Override
    public void put(T val) {

    }

    @Override
    public T get() {
        return null;
    }
}

class MyClass2 implements Rules<String> {
    @Override
    public void put(String val) {
    }

    @Override
    public String get() {
        return null;
    }
}


class MyClass1 implements Rules {
    @Override
    public void put(Object val) {

    }

    @Override
    public Object get() {
        return null;
    }
}