package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *  |_ IDBManager.java
 * 
 * Date : 2017. 5. 25.
 * </pre>
 *
 * @author : RMKroar
 * @version : 1.0
 */

public interface IDBManager {
	static final String ORACLE_DATABASE = "ORACLE";
	static final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	static IDBManager getDBObject(String database) {
		if(ORACLE_DATABASE.equals(database)) {
			return new OracleDB();
		} else if(SYBASE_DATABASE.equals(database)) {
			return new SybaseDB();
		} return null;
	}
}
