public class Field {

    private String name;
    private String alias;

    public Field(String name, String alias) {
        this.name = name;
        if (alias != null)
            this.alias = alias;
        else this.alias = "";

    }

    public String getValue() {
        if ("".equals(this.alias)) {
            return name;
        }else{
            return name + " AS " + this.alias;
        }

    }
}
