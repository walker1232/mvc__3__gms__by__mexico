package com.gms.web.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gms.web.domain.MemberDTO;
import com.gms.web.repository.MemberDAO;
@Repository
public class MemberMapper implements MemberDAO{
	@Autowired SqlSessionFactory factory;
	private static final String ns = "com.gms.web.mapper.MemberMapper";
	@Override
	public void insert(MemberDTO p) {
		System.out.println("ADD 3 " + p);
		SqlSession sqlSession = factory.openSession();
		sqlSession.insert(ns+".insert", p);
		
	}

	@Override
	public List<?> selectList(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> selectSome(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO selectOne(MemberDTO p) {
		SqlSession sqlSession = factory.openSession();
		return (MemberDTO)sqlSession.selectOne(ns+".selectOne", p);
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(MemberDTO p) {
		System.out.println("modify " + p.getMemID());
		factory.openSession().update(ns+".update", p);
		
	}

	@Override
	public void delete(MemberDTO p) {
		System.out.println("remove 3 " + p.getName() + " " + p.getPassword());
		factory.openSession().delete(ns+".delete", p);
	}

	@Override
	public boolean login(MemberDTO p) {
		System.out.println("Login 5 " + p);
		SqlSession sqlSession = factory.openSession();
		return sqlSession.selectOne(ns+".login", p) != null;
	}

}