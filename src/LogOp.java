public class LogOp {

    private String op;

    public LogOp(String op) {
        this.op = translateOperator(op);
    }

    public String getOp() {
        return this.op;
    }

    private String translateOperator(String op) {
        switch (op) {
            case ":":
                return "=";
            case "_eq":
                return "=";
            case "_gt":
                return ">";
            case "_lt":
                return "<";
            case "_gte":
                return ">=";
            case "_lte":
                return "<=";
            default:
                return "";
        }
    }
}
