public class Person implements Comparable{
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
        public int compareTo(Object o){
        Person annan = (Person)o;
        return this.namn.compareTo(annan.getNamn());
    }

}
