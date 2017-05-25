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
		IDBManager db = IDBManager.getDBObject("SYBASE");
		crud(db);
		System.out.println("<< 변경 후 >>");
		IDBManager db2 = IDBManager.getDBObject("ORACLE");
		crud(db2);
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
