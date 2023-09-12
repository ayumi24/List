package listjava;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		List <Map <String, String>> listmap = new LinkedList<>();
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("所属", "SI関東");
		map1.put("氏名", "木下");
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("所属", "SI関東");
		map2.put("氏名", "服部");
		
		Map<String, String> map3 = new HashMap<String, String>();
		map3.put("所属", "SI仙台");
		map3.put("氏名", "佐々木");
		
		Map<String, String> map4 = new HashMap<String, String>();
		map4.put("所属", "SI大阪");
		map4.put("氏名", "坂井");
	
	
		listmap.add(map1);
		listmap.add(map2);
		listmap.add(map3);
		listmap.add(map4);


		for(Map<String, String> map : listmap) {
			System.out.println("所属：" + map.get("所属"));
			System.out.println("氏名：" + map.get("氏名"));
			System.out.println("ーーーーーーーーーーー");
		}
	


	/*ArrayList<String> names =
			new ArrayList<String>();
	ArrayList<String> place =
			new ArrayList<String>();
	place.add("SI関東");
	place.add("SI関東");
	place.add("SI仙台");
	place.add("SI大阪");
	
	names.add("木下");
	names.add("服部");
	names.add("佐々木");
	names.add("坂井");
	
	/*for (String p : place) {
		System.out.println("所属：" + p);
	}*/
	/*for (String n : names) {
		System.out.println("氏名：" + n);
	}

	}*/
	}
}
