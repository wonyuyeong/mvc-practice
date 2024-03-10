package com.ict.homedb;

import org.apache.ibatis.session.SqlSession;

import com.ict.db.MemberDBService;

public class HomeDAO {
		//실제 사용하는 클래스: SqlSession
		private static SqlSession ss;
		
		private synchronized static SqlSession getSession() {
			if (ss == null) {
				ss = HomeDBService.getFactory().openSession();
			}
			return ss;
		}
		
	// DAO 는 db를 처리하는메서드들을 모아놓는 곳이라고,,생각하자...	
	
	// 회원가입
	public static int getsignup(HomeVO mvo)  {
		int result = 0;
		result = getSession().insert("hometest.insert",mvo);
		// => insert(mapper의 namespace, mapper의 sql id)
		ss.commit();
		return result;
	}
	// 로그인(id=,pwd 확인?)
	public static HomeVO loginchk(HomeVO vo) {
		HomeVO mvo = null;
		mvo = getSession().selectOne("hometest.detail",vo) ;
		return mvo;
	}
	
}
