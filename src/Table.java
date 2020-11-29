import java.util.ArrayList;
import java.util.List;

public class Table {
    String tableName;
    List<VarName> fields;

    public Table(String tableName, List<VarName> fields) {
        this.tableName = tableName;
        this.fields = fields;

    }

    public String getTableName() {return this.tableName; }

    public void addField(VarName field) {
        this.fields.add(field);
    }

    public String stringify() {
        String att = "";
        if (fields.size()>0){
            for (int i=0; i<fields.size(); i++) {
                if (i<fields.size()-1)
                    att = att.concat(fields.get(i).getValue()) + ",";
                else
                    att = att.concat(fields.get(i).getValue());
            }

        }else {
            att = "*";
        }
        return att + " FROM " + this.tableName;
    }
}
