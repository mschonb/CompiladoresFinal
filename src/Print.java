public class Print extends Stmnt {
    Factor f;
    
    public Print(Factor f){
        this.f = f;
    }

    @Override
    public int ejec() {
        try{
            System.out.println(f.ejec());
            return 0;
        }
        catch (Exception e){
            System.out.println(e.toString());
            return -1;
        }
    }
}
