package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *  |_ MelonGenreChart.java
 * 
 * Date : 2017. 6. 13.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class MelonGenreChart {
	public static void main(String[] args) {
		List<Music> listA = new ArrayList<Music>();
		listA.add(new Music("팔레트", "아이유"));
		List<Music> listB = new ArrayList<Music>();
		listB.add(new Music("I LUV IT", "PSY"));
		listB.add(new Music("맞지?", "언니쓰"));
		
		Map<String, List<Music>> map = new HashMap<>();
		map.put("발라드", listA);
		map.put("댄스", listB);
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		printMap(map);
		
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		listB.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		listB.remove(0);
		printMap(map);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()) {
			System.out.println("[" + key + "]");
			for(Music m : map.get(key)) {
				System.out.println("" + (map.get(key).indexOf(m) + 1) + ". " + m);
			} 
		} System.out.println();
	}
}
