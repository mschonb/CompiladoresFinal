public class VarName extends Value {
    //can be used for id, variable ($var) or just string

    private String val;

    public VarName(String val) {
        this.val = val;
    }

    @Override
    public String getValue() {
        return this.val;
    }
}
