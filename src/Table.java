import java.util.ArrayList;
import java.util.List;

public class Table {
    String tableName;
    List<String> attributes;

    public Table(String tableName) {
        this.tableName = tableName;
        this.attributes = new ArrayList<>();
    }
}
