import java.util.Arrays;

public class Spartans {
    private String name;
    private int count;
    public Spartans(String name,int count){
        this.name=name;
        this.count=count;
    }
    public Spartans(){

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCount(int count){
        this.count=count;
    }
    public int getCount(){
        return count;
    }

    public int []sortByCount(int[] count){
        Arrays.sort(count);
        return count;
    }
    public Spartans[]sortByCount(Spartans[]count){
        for(int i=0;i<count.length-1;i++){
            for(int j=i+1;j<count.length;j++){
                if (count[i].count > count[j].count) {
                    Spartans quantity=count[i];
                    count[i]=count[j];
                    count[j]=quantity;
                }
            }
        }
        return count;
    }
    @Override
    public String toString() {
        return "Spartans{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
