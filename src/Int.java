public class Int extends Value {
    int val;

    public Int(int val) {
        this.val = val;
    }

    @Override
    public String getValue() {
        return String.valueOf(val);
    }
}
