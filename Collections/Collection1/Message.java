import java.util.Comparator;

public class Message implements Comparable<Message>{
    private int id;
    private String text;
    private boolean status;

    public Message(int id, String text, boolean status) {
        this.id = id;
        this.text = text;
        this.status = status;
    }

    @Override
    public int compareTo(Message o) {
        if(this.id < o.id) {
            return -1;
        }
        if(this.id > o.id) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Message{" +
                "hashcode= " + hashCode() +
                " id=" + id +
                ", text='" + text + '\'' +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Message)) {
            return false;
        }
        Message m = (Message) obj;

        System.out.println("Comparing " + this.id + " and " + m.id);

        if(this.id != m.id) {
            return false;
        }
        if(this.status != m.status) {
            return false;
        }

        return this.text.equals(m.text);
    }

    @Override
    public int hashCode() {
        return id + text.length();
    }
}


class MessageComparator implements Comparator<Message> {
    @Override
    public int compare(Message o1, Message o2) {
        if(o1.getId() < o2.getId()) {
            return 1;
        }
        if(o1.getId() > o2.getId()) {
            return -1;
        }
        return 0;
    }
}

class MyStringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return -1 * o1.compareTo(o2);
    }
}