import java.util.ArrayList;
import java.util.List;

public class Query {
    Table table;
    List<Condition> conditions;
    String str = "SELECT * FROM HERO WHERE x = 2";
    //Constructor
    public Query(Table table, List<Condition> conditions) {
        this.table = table;
        this.conditions = conditions;
    }

    private String buildConditionString() {
        String selectStr;
        selectStr = "SELECT ";
        String tableAtts = selectStr.concat(this.table.stringify());
        String whereStr = "";
        if (conditions.size()!=0) {
            whereStr = conditions.get(0).stringify();
            conditions.remove(0);
            for (Condition condition:conditions) {
                whereStr = whereStr + " AND " + condition.stringify();
            }
            return tableAtts + " WHERE " + whereStr;
        }
        return tableAtts;

    }

    public String stringify() {
        return buildConditionString();
    }
    
    public String stringifyIJ(List<Table> tables, List<Condition> conditions) {
        String innerJoinF = "";
        List<String> innerjoinT = new ArrayList<>();
        int tableCount = 0;
        int fieldCount;
        if (conditions.size() > 1) {
            System.out.println("Error, only one condition allowed on INNER JOIN.");
            System.exit(-1);
        }
        for (Table table:tables) {
            fieldCount = 0;
            for (Field key : table.fields.keySet()) {
                if (tableCount == 0) {
                    innerJoinF = innerJoinF.concat(key.getValue()) + ", ";
                } else {
                    if (fieldCount < table.fields.size() - 1)
                        innerJoinF = innerJoinF.concat(key.getValue()) + ", ";
                    else
                        innerJoinF = innerJoinF.concat(key.getValue());
                }
                fieldCount++;
            }
            tableCount++;
            innerjoinT.add(table.getTableName());
        }
        innerJoinF = innerJoinF.concat(" FROM " + innerjoinT.get(0) + " INNER JOIN " + innerjoinT.get(1) + " ON " + conditions.get(0).stringify());
        return "SELECT " + innerJoinF;
    }
}