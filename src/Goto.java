public class Goto extends Stmnt {
    String label;

    public Goto(String label){
        this.label = label;
    }

    @Override
    public int ejec() { 
        int val = 0;

        try {
            val = MiListener.labels.get(label);
            return val;
        }catch (Exception e) {
            System.out.println("Exception" + e);
            return -1;
        }
    }
}
