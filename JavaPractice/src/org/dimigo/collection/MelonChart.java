/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *  |_ MelonChart.java
 * 
 * Date : 2017. 6. 12.
 * This program is for
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */
public class MelonChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("맞지?", "언니쓰"));
		
		System.out.println("-- << 멜론 차트 >> --");
		printList(list);
		
		System.out.println("-- << 2위 곡 추가 >> --");
		list.add(1, new Music("SIGNAL", "트와이스"));
		printList(list);
		
		System.out.println("-- << 3위 곡 변경 >> --");
		list.set(2, new Music("팔레트", "아이유"));
		printList(list);
		
		System.out.println("-- << 2위 곡 삭제 >> --");
		list.remove(1);
		printList(list);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		list.removeAll(list);
		printList(list);
	}
	
	public static void printList(List<Music> list) {
		for(Music i : list) {
			System.out.println("" + (list.indexOf(i) + 1) + ". " + i);
		} System.out.println();
	}
}
