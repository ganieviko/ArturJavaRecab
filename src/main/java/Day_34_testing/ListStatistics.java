package Day_34_testing;

import java.util.List;

public class ListStatistics {
    private List<Integer> list;

    public ListStatistics(List<Integer> list){
        this.list = list;
    }

    public void printList(){
        for (Integer i : list){
            System.out.print(i + " ");
        }
    }
    public Integer getMax(){
        if (list.isEmpty()){
            return null;
        }
        Integer currentMax = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (currentMax< list.get(i)){
                currentMax = list.get(i);
            }
        }
        return currentMax;
    }

    public Integer getMean(){

        // TODO: implement this method
        return 0;
    }
}
