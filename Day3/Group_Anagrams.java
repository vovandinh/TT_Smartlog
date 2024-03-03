package TT_Smartlog.Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String ele : strs)
        {
            char ch[] = ele.toCharArray();
            Arrays.sort(ch);
            String ss = new String(ch);
            
            map.putIfAbsent(ss, new ArrayList<>());
            map.get(ss).add(ele);
        }

        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Group_Anagrams groupAnagrams = new Group_Anagrams();
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);

        System.out.println("Các nhóm anagram:");
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
