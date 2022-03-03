package snippet;

public class Snippet {
	public int solution(String S) 
	        {
	            int count = (S.isEmpty()) ? 0 : 1;
	    S = S.toLowerCase();
	    HashSet<Character> letters = new HashSet<Character>();
	    for (int i = 0; i < S.length(); i++) {
	        if (letters.contains(S.charAt(i))) {
	            letters.clear();
	            count++;
	        }
	        letters.add(S.charAt(i));
	    }
	    return count;
	        }
	    }
}

