package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *  |_ OracleDB.java
 * 
 * Date : 2017. 5. 25.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public class OracleDB implements IDBManager {
	public void insert() {
		System.out.println("Oracle DB 저장");
	}
	public void search() {
		System.out.println("Oracle DB 조회");
	}
	public void update() {
		System.out.println("Oracle DB 변경");
	}
	public void delete() {
		System.out.println("Oracle DB 삭제");
	}
}
