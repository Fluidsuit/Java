import com.sun.source.tree.Tree;

import java.util.*;

public class Util {

    public static void arrayListDemo1() {

        ArrayList<Integer> dummy = new ArrayList<>(30);
        dummy.add(11);
        dummy.add(5);
        dummy.add(19);

        ArrayList<Integer> numbers = new ArrayList<Integer>(20);

        numbers.add(10);
        numbers.add(20);
        numbers.add(0, 30);
        numbers.addAll(dummy);
        numbers.addAll(1, dummy);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        /*for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }*/

        numbers.remove(1);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        numbers.remove(Integer.valueOf(19));
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("5 found at: " + numbers.indexOf(5));
        System.out.println("last 5 found at: " + numbers.lastIndexOf(5));

        System.out.println("contains 55: " + numbers.contains(55));
        numbers.ensureCapacity(50);

        System.out.println();
    }

    public static void arrayListDemo2() {

        ArrayList<Message> messages = new ArrayList<>();

        {
            messages.add(new Message(1, "User John logged in successfully", true));
            messages.add(new Message(2, "Invalid password attempt for user Mike", false));
            messages.add(new Message(3, "New message received from Sarah", true));
            messages.add(new Message(4, "Server restarted at 02:30 AM", true));
            messages.add(new Message(5, "Payment of $250 processed successfully", true));
            messages.add(new Message(6, "Low disk space warning on Drive C:", false));
            messages.add(new Message(7, "New friend request from Alex", true));
            messages.add(new Message(8, "Email verification link sent to user", true));
            messages.add(new Message(9, "Application update available: v2.3", false));
            messages.add(new Message(10, "Session timed out after 15 minutes of inactivity", false));
            messages.add(new Message(11, "Database backup completed successfully", true));
            messages.add(new Message(12, "Two-factor authentication enabled", true));
            messages.add(new Message(13, "User Emily changed her password", true));
            messages.add(new Message(14, "New comment on your post", true));
            messages.add(new Message(15, "System error: Unable to connect to API", false));
            messages.add(new Message(16, "User David logged out", true));
            messages.add(new Message(17, "Reminder: Meeting scheduled at 4 PM", true));
            messages.add(new Message(18, "Profile picture updated successfully", true));
            messages.add(new Message(19, "New device login detected from Chrome browser", false));
            messages.add(new Message(20, "Subscription renewed for 1 year", true));
            messages.add(new Message(21, "File upload failed: Network error", false));
            messages.add(new Message(22, "New follower request from Jessica", true));
            messages.add(new Message(23, "Security alert: Multiple failed login attempts", false));
            messages.add(new Message(24, "User Robert deleted his account", true));
            messages.add(new Message(25, "System maintenance scheduled for Sunday", true));
            messages.add(new Message(26, "You received a new badge: 'Top Contributor'", true));
            messages.add(new Message(27, "Order #4521 has been shipped", true));
            messages.add(new Message(28, "Password reset link expired", false));
            messages.add(new Message(29, "User Michael joined your group", true));
            messages.add(new Message(30, "Daily report generated successfully", true));
        }

        Message m1 = new Message(7, "New friend request from Alex", true);
        boolean exists = messages.contains(m1);
        System.out.println("exists = " + exists);

        System.out.println("Index of m1: " + messages.indexOf(m1));

    }

    public static void linkedListDemo1() {

        LinkedList<Integer> dummy = new LinkedList<>();
        dummy.add(11);
        dummy.add(5);
        dummy.add(19);

        //LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<Integer> numbers = new LinkedList<>(dummy);

        numbers.add(10);
        numbers.add(20);
        numbers.add(0, 30);
        numbers.addAll(dummy);
        numbers.addAll(1, dummy);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        /*for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }*/

        numbers.remove(1);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        numbers.remove(Integer.valueOf(19));
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("5 found at: " + numbers.indexOf(5));
        System.out.println("last 5 found at: " + numbers.lastIndexOf(5));

        System.out.println("contains 55: " + numbers.contains(55));
        //numbers.ensureCapacity(50);

        System.out.println();
    }

    public static void stackDemo() {
        Stack<String> names = new Stack<>();
        names.push("Some name");
        names.pop();
        names.peek();
    }

    public static void queueDemo() {
        LinkedList<Integer> qi = new LinkedList<>();

        qi.add(10);
        qi.add(20);
        qi.add(30);
        qi.add(40);

        while (!qi.isEmpty()) {
            System.out.println(qi.removeFirst());
        }

    }

    public static void hashSetDemo() {
        HashSet<String> names = new HashSet<>();

        names.add("Vishal");
        names.add("Kirti");
        names.add("Harshada");
        names.add("Tushar");
        names.add("Atha");
        names.add("Pooja");

        for(String name : names) {
            System.out.println(name);
        }

    }

    public static void hashSetDemo1() {
        HashSet<Message>  messages = new HashSet<>();
        {
            messages.add(new Message(1, "User John logged in successfully", true));
            messages.add(new Message(2, "Invalid password attempt for user Mike", false));
            messages.add(new Message(3, "New message received from Sarah", true));
            messages.add(new Message(4, "Server restarted at 02:30 AM", true));
            messages.add(new Message(5, "Payment of $250 processed successfully", true));
            messages.add(new Message(6, "Low disk space warning on Drive C:", false));
            messages.add(new Message(7, "New friend request from Alex", true));
            messages.add(new Message(8, "Email verification link sent to user", true));
            messages.add(new Message(9, "Application update available: v2.3", false));
            messages.add(new Message(10, "Session timed out after 15 minutes of inactivity", false));
            messages.add(new Message(11, "Database backup completed successfully", true));
            messages.add(new Message(12, "Two-factor authentication enabled", true));
            messages.add(new Message(13, "User Emily changed her password", true));
            messages.add(new Message(14, "New comment on your post", true));
            messages.add(new Message(15, "System error: Unable to connect to API", false));
            messages.add(new Message(16, "User David logged out", true));
            messages.add(new Message(17, "Reminder: Meeting scheduled at 4 PM", true));
            messages.add(new Message(18, "Profile picture updated successfully", true));
            messages.add(new Message(19, "New device login detected from Chrome browser", false));
            messages.add(new Message(20, "Subscription renewed for 1 year", true));
            messages.add(new Message(21, "File upload failed: Network error", false));
            messages.add(new Message(22, "New follower request from Jessica", true));
            messages.add(new Message(23, "Security alert: Multiple failed login attempts", false));
            messages.add(new Message(24, "User Robert deleted his account", true));
            messages.add(new Message(25, "System maintenance scheduled for Sunday", true));
            messages.add(new Message(26, "You received a new badge: 'Top Contributor'", true));
            messages.add(new Message(27, "Order #4521 has been shipped", true));
            messages.add(new Message(28, "Password reset link expired", false));
            messages.add(new Message(29, "User Michael joined your group", true));
            messages.add(new Message(30, "Daily report generated successfully", true));
        }

        for(Message m : messages) {
            System.out.println(m);
        }
    }

    public static void treeSetDemo() {
        //TreeSet<String> names = new TreeSet<>();
        TreeSet<String> names = new TreeSet<>(new MyStringComparator());
        names.add("Vishal");
        names.add("Kirti");
        names.add("Harshada");
        names.add("Tushar");
        names.add("Atha");
        names.add("Mohaddis");
        names.add("Shravani");
        names.add("Aditya");
        names.add("Pranjal");
        names.add("Pranjal");
        names.add("Nilam");
        names.add("Sakshi");
        names.add("Jai");
        names.add("Manas");

        for(String name : names) {
            System.out.println(name);
        }

        System.out.println();

        System.out.println(names.first() + " " + names.last());
        System.out.println(names.ceiling("Harsh"));
        System.out.println(names.floor("Harsh"));

        SortedSet<String> hSet = names.headSet("Nilam");
        System.out.println("head set: ");
        for(String name : hSet) {
            System.out.println(name);
        }


        System.out.println("-------------------");

        SortedSet<String> tSet = names.tailSet("Nilam");
        System.out.println("tail set: ");
        for(String name : tSet) {
            System.out.println(name);
        }

        System.out.println();

        //SortedSet<String> subSet = names.subSet("Harshada", "Nilam");
        SortedSet<String> subSet = names.subSet("Nilam", "Harshada");
        for(String name : subSet) {
            System.out.println(name);
        }

        names.retainAll( subSet );
    }

    public static void treeSetDemo1() {
        //TreeSet<Message>  messages = new TreeSet<>();
        TreeSet<Message>  messages = new TreeSet<>(new MessageComparator());
        {
            messages.add(new Message(156, "User John logged in successfully", true));
            messages.add(new Message(452, "Invalid password attempt for user Mike", false));
            messages.add(new Message(378, "New message received from Sarah", true));
            messages.add(new Message(4345, "Server restarted at 02:30 AM", true));
            messages.add(new Message(59, "Payment of $250 processed successfully", true));
            messages.add(new Message(63, "Low disk space warning on Drive C:", false));
            messages.add(new Message(79, "New friend request from Alex", true));
            messages.add(new Message(800, "Email verification link sent to user", true));
            messages.add(new Message(912, "Application update available: v2.3", false));
            messages.add(new Message(110, "Session timed out after 15 minutes of inactivity", false));
            messages.add(new Message(211, "Database backup completed successfully", true));
            messages.add(new Message(812, "Two-factor authentication enabled", true));
            messages.add(new Message(1320, "User Emily changed her password", true));
            messages.add(new Message(148, "New comment on your post", true));
            messages.add(new Message(1050, "System error: Unable to connect to API", false));
            messages.add(new Message(169, "User David logged out", true));
            messages.add(new Message(1761, "Reminder: Meeting scheduled at 4 PM", true));
            messages.add(new Message(1800, "Profile picture updated successfully", true));
            messages.add(new Message(192, "New device login detected from Chrome browser", false));
            messages.add(new Message(2090, "Subscription renewed for 1 year", true));
            messages.add(new Message(212, "File upload failed: Network error", false));
            messages.add(new Message(222, "New follower request from Jessica", true));
            messages.add(new Message(523, "Security alert: Multiple failed login attempts", false));
            messages.add(new Message(324, "User Robert deleted his account", true));
            messages.add(new Message(2501, "System maintenance scheduled for Sunday", true));
            messages.add(new Message(926, "You received a new badge: 'Top Contributor'", true));
            messages.add(new Message(627, "Order #4521 has been shipped", true));
            messages.add(new Message(528, "Password reset link expired", false));
            messages.add(new Message(429, "User Michael joined your group", true));
            messages.add(new Message(330, "Daily report generated successfully", true));
        }

        for(Message m : messages) {
            System.out.println(m);
        }
    }

    public static void iteratorDemo1() {
        ArrayList<Message> messages = new ArrayList<>();

        {
            messages.add(new Message(1, "User John logged in successfully", true));
            messages.add(new Message(2, "Invalid password attempt for user Mike", false));
            messages.add(new Message(3, "New message received from Sarah", true));
            messages.add(new Message(4, "Server restarted at 02:30 AM", true));
            messages.add(new Message(5, "Payment of $250 processed successfully", true));
            messages.add(new Message(6, "Low disk space warning on Drive C:", false));
            messages.add(new Message(7, "New friend request from Alex", true));
            messages.add(new Message(8, "Email verification link sent to user", true));
            messages.add(new Message(9, "Application update available: v2.3", false));
            messages.add(new Message(10, "Session timed out after 15 minutes of inactivity", false));
            messages.add(new Message(11, "Database backup completed successfully", true));
            messages.add(new Message(12, "Two-factor authentication enabled", true));
            messages.add(new Message(13, "User Emily changed her password", true));
            messages.add(new Message(14, "New comment on your post", true));
            messages.add(new Message(15, "System error: Unable to connect to API", false));
            messages.add(new Message(16, "User David logged out", true));
            messages.add(new Message(17, "Reminder: Meeting scheduled at 4 PM", true));
            messages.add(new Message(18, "Profile picture updated successfully", true));
            messages.add(new Message(19, "New device login detected from Chrome browser", false));
            messages.add(new Message(20, "Subscription renewed for 1 year", true));
            messages.add(new Message(21, "File upload failed: Network error", false));
            messages.add(new Message(22, "New follower request from Jessica", true));
            messages.add(new Message(23, "Security alert: Multiple failed login attempts", false));
            messages.add(new Message(24, "User Robert deleted his account", true));
            messages.add(new Message(25, "System maintenance scheduled for Sunday", true));
            messages.add(new Message(26, "You received a new badge: 'Top Contributor'", true));
            messages.add(new Message(27, "Order #4521 has been shipped", true));
            messages.add(new Message(28, "Password reset link expired", false));
            messages.add(new Message(29, "User Michael joined your group", true));
            messages.add(new Message(30, "Daily report generated successfully", true));
        }

        Iterator<Message> it = messages.iterator();
        while(it.hasNext()) {
            Message m = it.next();
            System.out.println(m);
            if(m.getId() == 26) {
                it.remove();
            }

        }
        System.out.println();

        System.out.println("---------------------");
        for(Message m : messages) {
            System.out.println(m);
        }
        System.out.println("---------------------");
    }

    public static void iteratorDemo2() {
        LinkedList<Message> messages = new LinkedList<>();

        {
            messages.add(new Message(1, "User John logged in successfully", true));
            messages.add(new Message(2, "Invalid password attempt for user Mike", false));
            messages.add(new Message(3, "New message received from Sarah", true));
            messages.add(new Message(4, "Server restarted at 02:30 AM", true));
            messages.add(new Message(5, "Payment of $250 processed successfully", true));
            messages.add(new Message(6, "Low disk space warning on Drive C:", false));
            messages.add(new Message(7, "New friend request from Alex", true));
            messages.add(new Message(8, "Email verification link sent to user", true));
            messages.add(new Message(9, "Application update available: v2.3", false));
            messages.add(new Message(10, "Session timed out after 15 minutes of inactivity", false));
            messages.add(new Message(11, "Database backup completed successfully", true));
            messages.add(new Message(12, "Two-factor authentication enabled", true));
            messages.add(new Message(13, "User Emily changed her password", true));
            messages.add(new Message(14, "New comment on your post", true));
            messages.add(new Message(15, "System error: Unable to connect to API", false));
            messages.add(new Message(16, "User David logged out", true));
            messages.add(new Message(17, "Reminder: Meeting scheduled at 4 PM", true));
            messages.add(new Message(18, "Profile picture updated successfully", true));
            messages.add(new Message(19, "New device login detected from Chrome browser", false));
            messages.add(new Message(20, "Subscription renewed for 1 year", true));
            messages.add(new Message(21, "File upload failed: Network error", false));
            messages.add(new Message(22, "New follower request from Jessica", true));
            messages.add(new Message(23, "Security alert: Multiple failed login attempts", false));
            messages.add(new Message(24, "User Robert deleted his account", true));
            messages.add(new Message(25, "System maintenance scheduled for Sunday", true));
            messages.add(new Message(26, "You received a new badge: 'Top Contributor'", true));
            messages.add(new Message(27, "Order #4521 has been shipped", true));
            messages.add(new Message(28, "Password reset link expired", false));
            messages.add(new Message(29, "User Michael joined your group", true));
            messages.add(new Message(30, "Daily report generated successfully", true));
        }

        ListIterator<Message> it = messages.listIterator();

        while(it.hasNext()) {
            Message m = it.next();
            System.out.println(m);
            if(m.getId() == 26) {
                it.remove();
            }

        }
        System.out.println();

        System.out.println("---------------------");
        for(Message m : messages) {
            System.out.println(m);
        }
        System.out.println("---------------------");
    }

    public static void iteratorDemo3() {
        TreeSet<Message>  messages = new TreeSet<>();
        //TreeSet<Message>  messages = new TreeSet<>(new MessageComparator());
        {
            messages.add(new Message(156, "User John logged in successfully", true));
            messages.add(new Message(452, "Invalid password attempt for user Mike", false));
            messages.add(new Message(378, "New message received from Sarah", true));
            messages.add(new Message(4345, "Server restarted at 02:30 AM", true));
            messages.add(new Message(59, "Payment of $250 processed successfully", true));
            messages.add(new Message(63, "Low disk space warning on Drive C:", false));
            messages.add(new Message(79, "New friend request from Alex", true));
            messages.add(new Message(800, "Email verification link sent to user", true));
            messages.add(new Message(912, "Application update available: v2.3", false));
            messages.add(new Message(110, "Session timed out after 15 minutes of inactivity", false));
            messages.add(new Message(211, "Database backup completed successfully", true));
            messages.add(new Message(812, "Two-factor authentication enabled", true));
            messages.add(new Message(1320, "User Emily changed her password", true));
            messages.add(new Message(148, "New comment on your post", true));
            messages.add(new Message(1050, "System error: Unable to connect to API", false));
            messages.add(new Message(169, "User David logged out", true));
            messages.add(new Message(1761, "Reminder: Meeting scheduled at 4 PM", true));
            messages.add(new Message(1800, "Profile picture updated successfully", true));
            messages.add(new Message(192, "New device login detected from Chrome browser", false));
            messages.add(new Message(2090, "Subscription renewed for 1 year", true));
            messages.add(new Message(212, "File upload failed: Network error", false));
            messages.add(new Message(222, "New follower request from Jessica", true));
            messages.add(new Message(523, "Security alert: Multiple failed login attempts", false));
            messages.add(new Message(324, "User Robert deleted his account", true));
            messages.add(new Message(2501, "System maintenance scheduled for Sunday", true));
            messages.add(new Message(926, "You received a new badge: 'Top Contributor'", true));
            messages.add(new Message(627, "Order #4521 has been shipped", true));
            messages.add(new Message(528, "Password reset link expired", false));
            messages.add(new Message(429, "User Michael joined your group", true));
            messages.add(new Message(330, "Daily report generated successfully", true));
        }

        //Iterator<Message> it = messages.iterator();
        Iterator<Message> it = messages.descendingIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---------------");

        SortedSet<Message> msgs = messages.descendingSet();
        for(Message m : msgs) {
            System.out.println(m);
        }
    }


    public static void hashMapDemo() {
        HashMap<Integer, String> students =
                new HashMap<Integer, String>(20, 2f);

        students.put(11, "GH");
        students.put(45, "AB");
        students.put(23, "DF");
        students.put(19, "HY");
        students.put(1, "CF");

        System.out.println(students.get(19));
        students.remove(19);

        Set<Map.Entry<Integer, String>> entries = students.entrySet();
        for(Map.Entry<Integer, String> e : entries) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

}
