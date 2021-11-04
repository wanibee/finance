package com.test.finance.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("fDao")
public class FinanceDao {
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int getListCount() {
		return sqlSessionTemplate.selectOne("financeMapper.getListCount");
	}
//
//	public ArrayList<Board> selectList(PageInfo pi) {
//		int offset = (pi.getCurrentPage() -1)*pi.getBoardLimit();
//		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
//		
//		return (ArrayList)sqlSessionTemplate.selectList("boardMapper.getBoardList",null,rowBounds);
//	}
//
//	public int insertBoard(Board b) {
//		return sqlSessionTemplate.insert("boardMapper.insertBoard",b);
//	}
//
//	public int addReadCount(Integer bId) {
//		return sqlSessionTemplate.update("boardMapper.updateCount",bId);
//	}
//
//	public Board selectBoard(Integer bId) {
//		return sqlSessionTemplate.selectOne("boardMapper.selectOne",bId);
//	}
//
//	public int updateBoard(Board b) {
//		return sqlSessionTemplate.update("boardMapper.updateBoard",b);
//	}
//
//	public int deleteBoard(Integer bId) {
//		return sqlSessionTemplate.delete("boardMapper.deleteBoard",bId);
//	}
//
//	public ArrayList<Board> selectTopList() {
////		System.out.println("나는 언제 실행 되니?");
//		return (ArrayList)sqlSessionTemplate.selectList("boardMapper.selectTopList");
//	}
//
//	public ArrayList<Reply> selectReplyList(int bId) {
//		return (ArrayList)sqlSessionTemplate.selectList("boardMapper.selectReplyList",bId);
//	}
//
//	public int insertReply(Reply r) {
//		return sqlSessionTemplate.insert("boardMapper.insertReply",r);
//	}

}
