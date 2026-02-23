public class NegativeSalException extends Exception{
    private int id;
    private int sal;
    /*private String message;*/
    private long time;

    public NegativeSalException(int id, int sal, String message) {
        super(message);
        this.id = id;
        this.sal = sal;
        /*this.message = message;*/
        time = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "NegativeSalException{" +
                "id=" + id +
                ", sal=" + sal +
                ", message='" + getMessage() + '\'' +
                ", time=" + time +
                '}';
    }
}
