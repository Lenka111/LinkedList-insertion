
public class IntegerNode {

    private Integer value;
    private IntegerNode next;

    //the constructor
    public IntegerNode(Integer value) {
        this.value = value;
    }

    //getters and setters
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    //string representation of the object
    public String toString() {
        return value.toString();
    }

}
