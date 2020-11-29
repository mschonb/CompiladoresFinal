public class Field {

    private String name;
    private String alias;
    private String tableName;

    public Field(String name, String alias, String tableName) {
        this.name = name;
        this.alias = alias;
        this.tableName = tableName;

    }

    public String getValue() {
        if ("".equals(this.alias)) {
            return tableName+"."+name;
        }else{
            return tableName+"."+name + " AS " + this.alias;
        }

    }
}
