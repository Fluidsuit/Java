public class Derived1 extends Base<String, Integer>{
    //derived stuff
}

class Derived2<T> extends Base<T, String> {

}


class Derived3<T1, T2> extends Base<T1, T2> {
}

class Derived4<T1, T2, T3> extends Base<T1, T2> {

}

