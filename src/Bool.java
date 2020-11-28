public class Bool extends Value {
    private boolean val;

    public Bool(String stringVal) {
        if (stringVal == null) {
            throw new IllegalArgumentException("Error in Bool.java: val must be true or false");
        }else if (stringVal.equalsIgnoreCase("true")) {
            val = true;
        }else if (stringVal.equalsIgnoreCase("false")) {
            val = false;
        }else {
            throw new IllegalArgumentException("Error in Bool.java: val must be true or false");
        }
    }

    @Override
    public String getValue() {
        return String.valueOf(this.val);
    }
}
