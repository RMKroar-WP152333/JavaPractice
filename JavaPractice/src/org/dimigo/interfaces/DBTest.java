package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *  |_ DBTest.java
 * 
 * Date : 2017. 5. 25.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class DBTest {
	public static void main(String[] args) {
		System.out.println("<< 변경 전 >>");
		crud(IDBManager.getDBObject("SYBASE"));
		System.out.println("<< 변경 후 >>");
		crud(IDBManager.getDBObject("ORACLE"));
	}
	
	private static void crud(IDBManager db) {
		if(db != null) {
			db.insert();
			db.search();
			db.update();
			db.delete();
			System.out.println();
		}
	}
}
