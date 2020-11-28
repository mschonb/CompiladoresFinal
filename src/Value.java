public class Value {

    //private String name;
    private String parsedString;

    public Value() {}

    public Value(String parsedString) {
        this.parsedString = parsedString;
    }

    public String getValue() {
        return this.parsedString;
    }

    //public Value(String name) {
    //    this.name = name;
    //}

    //public String getValue() {
    //    return this.name;
    //}
}
