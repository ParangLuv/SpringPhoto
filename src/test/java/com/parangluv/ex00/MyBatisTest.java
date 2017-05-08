package com.parangluv.ex00;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=("file:src/main/webapp/WEB-INF/spring/root-context.xml"))
public class MyBatisTest {

	@Autowired
	private SqlSessionFactory ssf;
	
	@Test
	public void test() {
		System.out.println(ssf);
	}

	@Test
	public void testSession(){
		SqlSession session = ssf.openSession();
		System.out.println(session);
	}
}
