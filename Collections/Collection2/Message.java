public class Message implements Comparable<Message> {
    private int id;
    private String text;

    public Message(int id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
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

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Message equals called...");
        Message m = (Message) obj;
        if (m.id != this.id) {
            return false;
        }
        return this.text.equals(m.text);
    }

    @Override
    public int compareTo(Message m) {
        if (this.id == m.id)
            return 0;

        if (this.id > m.id)
            return 1;

        return -1;
    }
}
