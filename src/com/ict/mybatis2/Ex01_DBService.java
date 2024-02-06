package com.ict.mybatis2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Ex01_DBService {
	static private SqlSessionFactory factory;
	static String resource = "com/ict/mybatis2/ex01_config.xml";
	// pdf 2pg 보자
	//static 초기화
	static {
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);	
		} catch (Exception e) {

		}
	}
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}

/*
 # 이 코드를 한번보면, InputStream 타입의 inputStream 변수에 
 xml 설정 파일을 담고있는 resource를 getResourceAsStream하고 
 그 inputStream으로, sqlSessionFactory를 빌드 하고 있다.

# 만들어진 sqlSessionFactory로 openSession하여 SqlSession 객체를 생성 했다.

# SqlSessionFactory는 말 그대로 SqlSession 인스턴스를 만들 수 있다. 
SqlSession은 데이터베이스에 대해 SQL 명령어를 실행하기 위해 필요한 모든 메서드를 가지고 있다.

 */








