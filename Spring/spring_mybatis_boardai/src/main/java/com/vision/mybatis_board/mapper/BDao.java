package com.vision.mybatis_board.mapper;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.vision.mybatis_board.dto.BDto;

@Service
public interface BDao {

	public BDto contentView(int strID); // 겟방식으로 들어갈때 아이디는 스트링이라는 것을 상기시키기 위해 이렇게 적음
	public void write(final String bname,final String btitle,final String bcontent);
	public ArrayList<BDto> list();
	public void modify(final int bid,final String bname,final String btitle,final String bcontent);
	public void delete(final String bid);
	public void reply(final int bid,final String bname,final String btitle,final String bcontent,final int bgroup,final int bstep,final int bindent);
	public BDto reply_view(int strID);
	public void upHit(final int bid);
	public void delete(final int bid);
}
