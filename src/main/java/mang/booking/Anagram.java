package mang.booking;

import java.util.*;

/**
 * Created by mrana on 06.02.2018.
 */
public class Anagram {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("pear","amleth","dormitory","tinsel","dirty room","hamlet","listen","silnet");
        System.out.println(getAnagramsGroups(words));
    }

    private static Set<String> getAnagramsGroups(List<String> words) {
        Set<String> anagramsList = new TreeSet<String>();
        Set<String> groupList = null;
        groupList = null;
        String group = null;
        String checkWith = null;
        for(int i=0; i<words.size(); i++) {
            groupList = new TreeSet<String>();
            checkWith = words.get(i);
            groupList.add(checkWith);
            for(int j=0; j<words.size(); j++) {
                if(i==j) {
                    continue;
                } else {
                    if(isAnagram(checkWith, words.get(j))) {
                        groupList.add(words.get(j));
                    }
                }
            }
            populateAnagramsList(anagramsList, groupList);
        }
        return anagramsList;
    }

    private static void populateAnagramsList(Set<String> anagramsList, Set<String> groupList) {
        StringBuilder s = new StringBuilder();
        for(String group : groupList) {
           s.append(group).append(",");
        }
        s.replace(s.lastIndexOf(","), s.lastIndexOf(",")+1, "");
        anagramsList.add(s.toString());
    }

    private static Boolean isAnagram(String checkWith, String s) {
        Character character = null;
        for(int x=0; x<s.length(); x++) {
            s = s.replaceAll(" ","");
            character = s.charAt(x);
            if(!checkWith.contains(character.toString())) {
                return false;
            }
        }
        return true;
    }


}
