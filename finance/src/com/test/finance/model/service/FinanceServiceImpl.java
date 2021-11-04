package com.test.finance.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.finance.model.dao.FinanceDao;

@Service("fService")
public class FinanceServiceImpl implements FinanceService{
	@Autowired
	FinanceDao fDao;

	@Override
	public int getListCount() {
		return fDao.getListCount();
	}
//
//	@Override
//	public ArrayList<Board> selectList(PageInfo pi) {
//		return bDao.selectList(pi);
//	}
//
//	@Override
//	public int insertBoard(Board b) {
//		return bDao.insertBoard(b);
//	}
//
//	@Override
//	public int addReadCount(Integer bId) {
//		return bDao.addReadCount(bId);
//	}
//
//	@Override
//	public Board selectBoard(Integer bId) {
//		return bDao.selectBoard(bId);
//	}
//
//	@Override
//	public int updateBoard(Board b) {
//		return bDao.updateBoard(b);
//	}
//
//	@Override
//	public int deleteBoard(Integer bId) {
//		return bDao.deleteBoard(bId);
//	}
//
//	@Override
//	public ArrayList<Board> selectTopList() {
//		return bDao.selectTopList();
//	}
//
//	@Override
//	public ArrayList<Reply> selectReplyList(int bId) {
//		return bDao.selectReplyList(bId);
//	}
//
//	@Override
//	public int insertReply(Reply r) {
//		return bDao.insertReply(r);
//	}
//
//	@Override
//	public com.test.finance.model.service.Board selectBoard(Integer bId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
