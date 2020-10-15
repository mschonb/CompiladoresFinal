public class BoolExpr extends Stmnt {
    public boolean typeIf;
    public Factor factor;
    public Id label;

    public BoolExpr(boolean typeIf, Factor factor, Id label){
        this.typeIf = typeIf;
        this.factor = factor;
        this.label = label;
    }

    @Override
    public int ejec() {
        if (typeIf) {
            if (factor.ejec() == 1) {
                try {
                    int val = MiListener.labels.get(label);
                    return val;
                }catch (Exception e) {
                    System.out.println("Exception" + e);
                    return -1;
                }
            }
            else{ return -1; }
        }
        else{
            if (factor.ejec() == 0){
                try {
                    int val = MiListener.labels.get(label);
                    return val;
                }catch (Exception e) {
                    System.out.println("Exception" + e);
                    return -1;
                }
            }
            else{ return -1; }
        }
    }
}
