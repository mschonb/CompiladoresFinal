import java.util.ArrayList;
import java.util.HashMap;

public class Table {
    VarName tableName;
    String tableAlias;
    HashMap<Field, Integer> fields;

    //table name, and HashMap corresponding to the name of field and no. of corresponding table
    public Table(VarName tableName, HashMap<Field, Integer> fields, String tableAlias) {
        this.tableName = tableName;
        this.fields = fields;
        if (tableAlias != null) this.tableAlias = tableAlias;
        else this.tableAlias = "";

    }

    public void addField(Field field, int tableIndex) {
        this.fields.put(field, tableIndex);
    }

    public String stringify() {
        String att = "";
        int count = 0; //keeping last comma out
        if (fields.size()>0){
            for (Field key : fields.keySet()) {
                if (count < fields.size() - 1) {
                    att = att.concat(key.getValue()) + ",";
                } else {
                    att = att.concat(key.getValue());
                }
                count++;
            }

        }else
            att = "*";
        if (this.tableAlias != null) return att + " FROM " + this.tableName.getValue() + " AS " + this.tableAlias;
        return att + " FROM " + this.tableName.getValue();
    }
}
