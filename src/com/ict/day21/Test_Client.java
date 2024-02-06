package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test_Client {
	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("데이터를 입력: ");
			String msg = scan.next();
			
			socket = new Socket("192.168.0.30", 7000);
			
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			bw.write(msg + "\n");
			bw.flush();
			
			///////////////////////////////////////////
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String re_msg = br.readLine();
			System.out.println("받은 정보: " + re_msg);
	
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("클라이언트 오류");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				isr.close();
				is.close();
				bw.close();
				osw.close();
				os.close();
				socket.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
		
		
	}
}
