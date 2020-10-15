public class Id extends Expr {
    String ID;

    public Id(String name) {
        ID = name;
    }

    @Override
    public int ejec() {
        return MiListener.ids.get(ID);
    }

}
