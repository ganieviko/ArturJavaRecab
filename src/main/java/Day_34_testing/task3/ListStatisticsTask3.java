package Day_34_testing.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStatisticsTask3 {
    private List<Integer> list;

    public ListStatisticsTask3(List<Integer> list){
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

    public Integer getMedian(){
        if (list.isEmpty()){
            return null;
        }
//        list = new ArrayList<>();
        ArrayList<Integer> copyOfList = new ArrayList<>(list);
        Collections.sort(copyOfList);
        int middleIndex = copyOfList.size()/2;
        if (copyOfList.size() % 2 !=0){ // odd number of numerals
            return copyOfList.get(middleIndex);
        }else { // even number of numerals
            int sum = copyOfList.get(middleIndex) + copyOfList.get(middleIndex - 1);
            return sum / 2;
        }
    }
}
