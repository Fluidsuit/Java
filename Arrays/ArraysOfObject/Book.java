public class Book {
    private int srNo;
    private String title;

    public Book(int srNo, String title) {
        this.srNo = srNo;
        this.title = title;
    }

    public int getSrNo() {
        return srNo;
    }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println(srNo + " " + title);
    }
}
