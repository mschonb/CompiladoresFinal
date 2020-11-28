public class Factor {
    private Value value;
    private String assign;
    private Value value2;

    public Factor(Value value) {
        this.value = value;
    }

    public Factor(Value value1, Value value2) {
        this.value = value1;
        this.assign = "=";
        this.value2 = value2;
    }

    public String getFactor() {
        if (value instanceof Bool || value instanceof MiFloat || value instanceof Int) {
            if (value2 != null && (value2 instanceof Bool || value2 instanceof MiFloat || value2 instanceof Int)) {
                return "(" + this.value.getValue() + this.assign + this.value2.getValue() + ')';
            }else return this.value.getValue();
        } else return this.value.getValue();
    }
}
