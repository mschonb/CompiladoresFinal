public class Factor {
    private int value;
    private String assign;
    private int value2;

    public Factor(int value) {
        this.value = value;
    }

    public Factor(int value1, int value2) {
        this.value = value;
        this.assign = "=";
        this.value2 = value2;
    }

    public int getFactor() {
        return this.value;
    }
}
