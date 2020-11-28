import java.util.List;

public class Query {
    List<Condition> conditions;
    String str = "SELECT * FROM HERO WHERE x = 2";
    //Constructor
    public Query(List<Condition> conditions) {
        this.conditions = conditions;
    }

    private String buildConditionString() {
        String whereStr = conditions.get(0).stringify();
        conditions.remove(0);
        for (Condition condition:conditions) {
            whereStr = whereStr + " AND " + condition.stringify();
        }

        return whereStr;
    }

    public String stringify() {
        return "WHERE " + buildConditionString();
    }
}