public class Person {
    private String namn;
    private int födelsear;

    public Person(String namn, int födelsear){
        this.namn=namn;
        this.födelsear=födelsear;
    }
    public String getNamn(){return namn;}
    public int getFödelsear(){return födelsear;}
    
    @Override
    public String toString(){
        return "namn "+namn+" födelsear "+födelsear;
    }

}
