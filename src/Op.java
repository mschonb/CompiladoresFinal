public class Op extends Expr {
    public String type;
    Factor o1, o2;

    public Op(Factor fact1, String type, Factor fact2){
        this.o1 = fact1;
        this.o2 = fact2;
        this.type = type;
    }

    @Override
    public int ejec() {
        if (type.equals("*")) return o1.ejec()*o2.ejec();
        else if (type.equals("/")) return o1.ejec()/o2.ejec();
        else if (type.equals("+")) return o1.ejec()+o2.ejec();
        else if (type.equals("-")) return o1.ejec()-o2.ejec();
        else if (type.equals("<")) return (o1.ejec() < o2.ejec()? 1:0);

        // 0+1 == 1
        // 0 < 1 == 1
        //error
        else return -1;
    }
}
