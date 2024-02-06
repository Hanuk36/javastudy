package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 스트림은 지연이 될 수 있으므로 Buffer(임시기억)이용해서 지연 현상을 해결한다.
// BufferedOutputStream 사용 // 혼자서는 사용 안됨  
public class Ex09 {
	public static void main(String[] args) {
		                  //D:/hchoi/util/test01.txt
		String pathname = "F:/nohssam/util/test01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			// true 있으면 이어쓰기가 된다.  없으면 덮어쓰기
			fos = new FileOutputStream(file, true);
			bos = new BufferedOutputStream(fos);
			
			String msg = "한국 ICT 인재 개발원 \n5강의장 \n자바 실습 중\n";
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}












/*
package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//스트림은 지연이 될수 있으므로 Buffer (임시기억) 이용해서 지연 현상을 해결한다.
//BufferedOutputStream 사용 // 혼자서는 사용 안됨
public class Ex09 {
	
	public static void main(String[] args) {
		String pathname = "D:/hchoi/util/test01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			//true 있으면 이어쓰기가 된다. 없으면 덮어쓰기
			//fos = new FileOutputStream(file);
			fos = new FileOutputStream(file, true); // 서로 위아래 chain 방식이라고 함. 서로 연결되서.
			bos = new BufferedOutputStream(fos); // 서로 위아래 chain 방식이라고 함. 서로 연결되서.
			
			String msg = "한국 ICT 인재 개발원 \n5강의장 \n자바 실습 중";
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}finally {
			try {
				bos.close(); // 기본적으로 밖부터 먼저 닫기
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
*/