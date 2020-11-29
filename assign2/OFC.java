package assign2;

import java.util.HashMap;

public class OFC {

    public static void main(String[] args) {
        String str = "ShardaUniversity";
        HashMap<Character, Integer> characterMap = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (characterMap.containsKey(str.charAt(i))) {
                int count = characterMap.get(str.charAt(i));
                characterMap.put(str.charAt(i), ++count);
            } else {
                characterMap.put(str.charAt(i),1);
            }
        }
        System.out.println(characterMap);
    }
}