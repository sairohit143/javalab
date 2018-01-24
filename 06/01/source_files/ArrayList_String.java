import java.util.*;

public class ArrayList_String{
	static ArrayList<String> reverse(ArrayList<String> a){
		Collections.reverse(a);
		return a;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>(5);
		for(int i =0; i < 5;i++){
			words.add(s.next());
		}
		words = reverse(words);
		System.out.println(words);
	}
}
