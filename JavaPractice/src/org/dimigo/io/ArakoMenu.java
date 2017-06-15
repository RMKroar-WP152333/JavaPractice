/* Formatted - */

package org.dimigo.io;

import java.io.*;

public class ArakoMenu {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))) {
			
			String data;
			while((data = br.readLine()) != null) {
				writer.write(data + "\n");
			}
			
			writer.flush();
			
			System.out.println("<< 메뉴 출력 >>");
			while((data = reader.readLine()) != null) {
				System.out.println(data);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}