package test;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {

        Map<String, List<String>> mapOfList = new HashMap<String, List<String>>();

        List<String> map = new ArrayList<String>();
        map.add("Apple");
        map.add("Koko");

        mapOfList.put("Apple", map);
        mapOfList.put("Koko", map);

        System.out.println(mapOfList);
        System.out.println(mapOfList.size());
        System.out.println(mapOfList.get(1));

        for (int i = 0; i < mapOfList.size(); i++) {
            System.out.println(mapOfList.get(i) + " ");

        }
        Iterator it = mapOfList.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

    }
}