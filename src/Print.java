public class Print extends Stmnt {
    Factor f = null;
    Acc a = null;
    
    public Print(Factor f){
        this.f = f;
    }

    public Print(Acc a) {
        this.a = a;
    }

    @Override
    public int ejec() {
        try{
            if (f != null) {
                System.out.println(f.ejec());
            }else {
                System.out.println(a.ejec());
            }

            return 0;
        }
        catch (Exception e){
            System.out.println(e.toString());
            return -1;
        }
    }
}
