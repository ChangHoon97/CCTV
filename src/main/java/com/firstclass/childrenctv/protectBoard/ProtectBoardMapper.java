package com.firstclass.childrenctv.protectBoard;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.firstclass.childrenctv.util.paging.Criteria;

@Mapper
public interface ProtectBoardMapper {

	public void insert(ProtectBoardVO board);
	public void update(ProtectBoardVO board);
	public ProtectBoardVO get(Long protect_id);
	public List<ProtectBoardVO> getAll();
	
	public List<ProtectBoardVO> getListWithPaging(Criteria cri);
	public int getTotalCount(Criteria cri);
	
	public List<ProtectBoardVO> getByUser(String user_loginId);
	public List<ProtectBoardVO> getByAddress(String address);
	public void delete(Long protect_id);
	
	public void insertPR(Long protect_id, Long child_id);
	public Long getNotPR();
	public void doPR(Long protect_id);
	public List<Long> getProtectByChild(Long child_id);
	
}
