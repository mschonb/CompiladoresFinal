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
}