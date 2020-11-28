public class MiFloat extends Value{
    float val;

    public MiFloat(float val) {
        this.val = val;
    }

    @Override
    public String getValue() {
        return String.valueOf(val);
    }
}
