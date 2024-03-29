package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("접속을 기다립니다...");
		
		Socket sock01 = server.accept(); //첫번째 접속 => sock01
		Socket sock02 = server.accept(); //두번째 접속 => sock02
		
		System.out.println("접속 되었습니다!");
		
		InputStream in = sock01.getInputStream(); //sock01만 받아서 처리
		DataInputStream dis = new DataInputStream(in);
		
		String readData = dis.readUTF();
		System.out.println("수신 데이터 : " + readData);
		
		dis.close();in.close();sock01.close();sock02.close();
		server.close();
		
	}

}
