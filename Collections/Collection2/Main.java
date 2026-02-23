import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //arrayListDemo1();
        //arrayListDemo2();
        //hashSetDemo();
        //treeSetDemo1();
        //treeSetDemo2();
        //treeSetDemo3();
        //hashMapDemo1();
        //hashMapDemo2();
        //hashMapDemo3();
        treeMapDemo1();
        //algorithmsDemo();
    }

    public static void algorithmsDemo() {
        //Collections.copy();
    }

    public static void treeMapDemo1() {
        /*TreeMap<Integer, String> products =
                new TreeMap<Integer, String>();*/

        /*TreeMap<Integer, String> products =
                new TreeMap<Integer, String>(
                        new ProductCodeComparator()
                );
        */
        TreeMap<Integer, String> products =
                new TreeMap<Integer, String>(
                        new Comparator<Integer>() {
                            @Override
                            public int compare(Integer o1, Integer o2) {
                                return o1 - o2;
                            }
                        }
                );


        products.put(56, "Laptop");
        products.put(34, "Projector");
        products.put(89, "TV");
        products.put(94, "Cell Phone");
        products.put(66, "Desk");
        products.put(29, "Desk light");

        System.out.println("1st: " + products.firstKey());
        System.out.println("nth: " + products.lastKey());

        Map.Entry<Integer, String> e = products.firstEntry();
        System.out.println(e.getKey() + " " + e.getValue());
        e = products.lastEntry();
        System.out.println(e.getKey() + " " + e.getValue());

        System.out.println();

        Set<Integer> codes = products.keySet();
        for(Integer code : codes) {
            System.out.println(code + " " + products.get(code));
        }
        System.out.println();

        Set<Map.Entry<Integer, String>> entries = products.entrySet();
        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();

        Map<Integer, String> subMap = products.headMap(56);
        for(Integer code : subMap.keySet()) {
            System.out.println(code + " -- " + subMap.get(code));
        }
        System.out.println();

        subMap = products.tailMap(56);
        for(Integer code : subMap.keySet()) {
            System.out.println(code + " -- " + subMap.get(code));
        }
        System.out.println();


        subMap = products.subMap(89, 29);
        for(Integer code : subMap.keySet()) {
            System.out.println(code + " -- " + subMap.get(code));
        }
        System.out.println();
    }

    public static void hashMapDemo3() {
        HashMap<String, Map<String, Integer>> students =
                new HashMap<String, Map<String, Integer>>();

        students.put("AA", new HashMap<String, Integer>());
        students.put("BB", new HashMap<String, Integer>());

        Map<String, Integer> marks = students.get("AA");
        marks.put("Java", 65);
        marks.put("C++", 80);
        marks.put("Android", 88);

        marks = students.get("BB");
        marks.put("Java", 90);
        marks.put("C++", 59);
        marks.put("Android", 77);
        marks.put("DSA", 71);

        students.get("BB").remove("Android");

        Set<String> names = students.keySet();
        for (String name : names) {
            System.out.println(name);
            marks = students.get(name);
            Set<String> subjects = marks.keySet();
            for (String sub : subjects) {
                System.out.println(sub + " : " + marks.get(sub));
            }
            System.out.println();
        }
    }

    public static void hashMapDemo2() {
        HashMap<String, List<Integer>> students =
                new HashMap<String, List<Integer>>();

        List<Integer> marks1 = new ArrayList<Integer>();
        marks1.add(65);
        marks1.add(93);
        marks1.add(54);
        students.put("BYT", marks1);

        List<Integer> marks2 = new ArrayList<Integer>();
        marks2.add(78);
        marks2.add(89);
        marks2.add(34);
        students.put("RTY", marks2);

        students.get("RTY").add(56);

        List<Integer> marks = students.get("RTY");
        for (Integer m : marks) {
            System.out.println(m);
        }

    }

    public static void hashMapDemo1() {
        HashMap<Integer, String> students =
                new HashMap<Integer, String>();

        students.put(45, "XYZ");
        students.put(16, "ABC");
        students.put(19, "PQR");
        students.put(25, "POI");

        System.out.println("Get: 19 " + students.get(19));

        System.out.println();
        Set<Integer> rolls = students.keySet();
        for (Integer roll : rolls) {
            System.out.println(roll + " : " + students.get(roll));
        }

        students.remove(25);

        System.out.println();
        rolls = students.keySet();
        for (Integer roll : rolls) {
            System.out.println(roll + " : " + students.get(roll));
        }

    }

    public static void hashSetDemo() {
        HashSet<Message> messages = new HashSet<Message>();
        messages.add(new Message(909, "Get well soon!"));
        messages.add(new Message(203, "Java is great!"));
        messages.add(new Message(1234, "I got placed"));
        messages.add(new Message(456, "Are you kidding"));
        messages.add(new Message(908, "Congratulations"));
        messages.add(new Message(111, "Party"));
        messages.add(new Message(908, "Congratulations"));

        for (Message message : messages) {
            System.out.println(message);
        }
        System.out.println();

        Iterator<Message> it = messages.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
    }

    public static void linkedListDemo() {
        LinkedList<String> names = new LinkedList<>();
    }

    public static void arrayListDemo2() {
        ArrayList<Message> messages = new ArrayList<>();
        messages.add(new Message(909, "Get well soon!"));
        messages.add(new Message(203, "Java is great!"));
        messages.add(new Message(1234, "I got placed"));
        messages.add(new Message(456, "Are you kidding"));
        messages.add(new Message(908, "Congratulations"));
        messages.add(new Message(111, "Party"));

        Message testMessage = new Message(1234, "I got placed");
        System.out.println("contains: " + messages.contains(testMessage));
        System.out.println(messages.get(2).hashCode() + " " + testMessage.hashCode());
    }

    public static void arrayListDemo1() {
        //ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>(6);
        System.out.println("Size: " + names.size());
        names.add("Vishal");
        names.add("Atharv");
        names.add("Kasturi");
        names.add("Disha");
        names.add("Sarthak");
        System.out.println("Size: " + names.size());

        System.out.println(names.get(2));
        System.out.println();
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println();

        for (String name : names) {
            System.out.println(name);
        }

        names.ensureCapacity(10);

        Collection<String> smartPeople = new ArrayList<>();
        smartPeople.add("Vishal");
        smartPeople.add("Lalit");

        names.removeAll(smartPeople);

        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }

        //names.add(3, "Vishal");
        names.set(3, "Vishal");
        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Contains: " + names.contains("Vishal Jagtap"));

        System.out.println();

        Iterator<String> it = names.iterator();
        System.out.println("it class: " + it.getClass().getName());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        ListIterator<String> lit = names.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        System.out.println();
        lit.set("Nothing");

        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }

    }

    public static void treeSetDemo1() {
        TreeSet<String> names = new TreeSet<>();
        System.out.println("Size: " + names.size());
        names.add("Vishal");
        names.add("Atharv");
        names.add("Kasturi");
        names.add("Disha");
        names.add("Sarthak");
        System.out.println("Size: " + names.size());

        //System.out.println(names.get(2));
        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }

        Collection<String> smartPeople = new ArrayList<>();
        smartPeople.add("Vishal");
        smartPeople.add("Lalit");

        names.removeAll(smartPeople);

        System.out.println();
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Contains: " + names.contains("Vishal Jagtap"));
        System.out.println();

        Iterator<String> it = names.iterator();
        System.out.println("it class: " + it.getClass().getName());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        names.add("Pratik");
        names.add("Sharddha");
        names.add("Tejas");
        names.add("Aditya");
        names.add("Lalit");

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        Set<String> headSet = names.headSet("Kasturi");
        for (String name : headSet) {
            System.out.println(name);
        }
        System.out.println();

        Set<String> tailSet = names.tailSet("Kasturi");
        for (String name : tailSet) {
            System.out.println(name);
        }
        System.out.println();

    }

    public static void treeSetDemo2() {
        TreeSet<Message> messages = new TreeSet<>();
        messages.add(new Message(909, "Get well soon!"));
        messages.add(new Message(203, "Java is great!"));
        messages.add(new Message(1234, "I got placed"));
        messages.add(new Message(456, "Are you kidding"));
        messages.add(new Message(908, "Congratulations"));
        messages.add(new Message(111, "Party"));

        for (Message message : messages) {
            System.out.println(message);
        }
        System.out.println();

        Message testMessage = new Message(1234, "I got placed");
        System.out.println("contains: " + messages.contains(testMessage));

    }

    public static void treeSetDemo3() {
        TreeSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person(101, "FF"));
        people.add(new Person(64, "DD"));
        people.add(new Person(9, "EE"));
        people.add(new Person(159, "GG"));
        people.add(new Person(23, "AA"));
        people.add(new Person(38, "KK"));

        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();
    }
}


class ProductCodeComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 == o2) {
            return 0;
        }
        if(o1 > o2) {
            return -1;
        }
        return 1;
    }
}
