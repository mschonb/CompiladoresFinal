public class Acc extends Expr {
    Id id;

    //TODO: Implement Id[factor]

    public Acc(Id id){
        this.id = id;
    }

    @Override
    public int ejec() {
        return id.ejec();
    }
}
