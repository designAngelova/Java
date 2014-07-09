import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LogsAggregator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		TreeMap<String, Map<String, List<Integer>>> users = new TreeMap<>();
		for (int i = 0; i<n; i++) {
			String s = new String(in.nextLine());
			String [] input = s.split(" ");
			String inputU = input[1];
			Map<String, List<Integer>> user = users.get(inputU);
			if (user == null) {
				users.put(inputU, addInfoToUser(input));
			} else {
				addInfoToUser(user, input);
			}

		}
		
		Iterator<String> keySetIterator = users.keySet().iterator();
		while(keySetIterator.hasNext()){
			  String key = keySetIterator.next();
			  System.out.println(key + ": " + users.get(key));
			}

	}

	private static Map<String, List<Integer>> addInfoToUser(String[] input) {
		Map<String, List<Integer>> info = new HashMap<>();
		List<Integer> dur = new ArrayList<>();
		dur.add(Integer.valueOf(input[2]));
		info.put(input[0], dur);
		return info;

	}

	private static void addInfoToUser(Map<String, List<Integer>> user,
			String[] input) {
		String ip = input[0];
		String dur = input[2];
		List<Integer> durs = user.get(ip);
		if (durs == null) {
			List<Integer> durL = new ArrayList<>();
			durL.add(Integer.valueOf(dur));
			user.put(ip, durL);
		} else {
			durs.add(Integer.valueOf(dur));
		}

	}
}