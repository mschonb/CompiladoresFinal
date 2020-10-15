public class Assignment extends Stmnt {
    private String acc;
    private Factor factor;
    private Op op;

    public Assignment(String acc, Factor factor) {
        this.acc = acc;
        this.factor = factor;
    }

    public Assignment(String acc, Op op) {
        this.acc = acc;
        this.op = op;
    }

    @Override
    public int ejec() {
        if(factor != null){
            MiListener.ids.put(acc, factor.ejec());
            return 0;
        }
        else{
            MiListener.ids.put(acc, op.ejec());
            return 1;
        }
    }
}
