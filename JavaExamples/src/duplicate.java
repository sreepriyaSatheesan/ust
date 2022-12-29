import java.util.HashMap;

public class duplicate {
public static void main(String[] args) {
	String str= "Desktop is a system,laptop is a system";
	HashMap<String,Integer> hashmap = new HashMap<>();
	String[] words=str.split("");
	for(String word : words) {
		Integer integer =hashmap.get(words);
		if(integer == null) {
			hashmap.put(word,1);
		}
		else
			hashmap.put(word, integer+1);
		System.out.println(hashmap);
	}
}
}
