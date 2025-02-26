import java.util.HashMap;
import java.util.Map;

public class Word_Frequence {
	
	public static void main(String[] args) {
		String s="I am a Devloper";
		String sub="am";
		String temp="";
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				if(sub.equalsIgnoreCase(temp)) {
					if(map.containsKey(sub)) {
						map.put(sub, map.get(sub)+1);
					}else {
						map.put(sub, 1);
					}
				}else {
					temp="";
				}
			}else {
				temp+=ch;
			}
		}
		System.out.println(map);
	}
}
