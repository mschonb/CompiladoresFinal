public class Factor extends Node {
    int value;
    Id id;

    public Factor(Id id){
        this.id = id;
    }
    public Factor(int num){
        this.value = num;
    }

    @Override
    public int ejec(){
        if(id != null){
            return id.ejec();
        }
        else{
            return value;
        }
    }
}
