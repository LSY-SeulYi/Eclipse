package ai.uni.mapper;

import java.util.List;

import ai.uni.dto.UniUsersVO;

public interface UniUsersMapper {

	public List<UniUsersVO> getList();

	public void insert(UniUsersVO uservo);

	public UniUsersVO read(String unino);
	
	public void delete(String unino);
	
	public int update(UniUsersVO usersvo);

}
