public class Condition {

    private Value val;
    private LogOp op;
    private Factor fact;

    public Condition(Value val, LogOp op, Factor fact) {
        this.val = val;
        this.op = op;
        this.fact = fact;
    }

    public String stringify() {
        return val.getValue() + " " +  op.getOp() + " " + fact.getFactor();
    }
}
