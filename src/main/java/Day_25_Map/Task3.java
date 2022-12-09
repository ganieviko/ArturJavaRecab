package Day_25_Map;

import java.util.*;

public class Task3 {
    // create a map groups and members of group
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]

    // part2: count how many members each group has

    // part3: store inside a new map, the number of members each group has
    // "Group1" = 2
    // "Group2" = 3
    public static void main(String[]args){

        HashMap<String, ArrayList<String>> map = new HashMap();

        ArrayList<String> ufaGroup = new ArrayList<>(Arrays.asList("Artur", "Ruslan", "Kostil"));
        ArrayList<String> fatherGroup = new ArrayList<>(Arrays.asList("Ramil", "Timoha", "Sasha"));

        ArrayList<String> group1 = new ArrayList<>();
        group1.add("Member1");
        group1.add("Member2");

        ArrayList<String> group2 = new ArrayList<>();
        group2.add("Member3");
        group2.add("Member4");
        group2.add("Member5");

        map.put("Group1", group1);
        map.put("Group2", group2);
        map.put("Artur group", ufaGroup);
        map.put("Artur's Father group", fatherGroup);

        System.out.println(map);
        int sizeOfMap = map.size();
        System.out.println(sizeOfMap);

//        Set<String> keySet = map.keySet();
//        System.out.println(keySet);

//        for (String key : keySet){
//            ArrayList<String> stringArrayList = map.get(key);
//            System.out.println(key + " = " + stringArrayList);
//            System.out.println();
//        }

//        Collection<ArrayList<String>> values = map.values();
//        for (ArrayList<String> value : values){
//            System.out.println(value);
//        }

        // part2: count how many members each group has

        Set<String> groups = map.keySet();
        for (String group : groups){
            ArrayList<String> members = map.get(group);
            System.out.println(group + " has " + members.size() + " members");
        }
        // part3:
        HashMap<String, Integer> membersCount = new HashMap<>();
        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries){
            String groupName = entry.getKey();
            int memberCount = entry.getValue().size();
            membersCount.put(groupName, memberCount);
        }
        System.out.println(membersCount);
    }
}
