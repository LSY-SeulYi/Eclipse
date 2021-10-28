package ai.uni.service;

import ai.uni.dto.UniUsersVO;

public interface UniUsersService {

	public void register(UniUsersVO uservo);
	
	public UniUsersVO get(String unino);
	
	public boolean modify(UniUsersVO uservo);

}
