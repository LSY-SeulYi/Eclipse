package ai.uni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ai.uni.dto.UniUsersVO;
import ai.uni.mapper.UniUsersMapper;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class UniUsersServiceImpl implements UniUsersService {

	@Setter(onMethod_ = @Autowired)
	private UniUsersMapper usersmapper;
	
	@Override
	public void register(UniUsersVO uservo) {
		log.info("register : "+uservo);
		usersmapper.insert(uservo);
	}

	@Override
	public UniUsersVO get(String unino) {
		log.info("get : "+unino);
		return usersmapper.read(unino);
	}

	@Override
	public boolean modify(UniUsersVO uservo) {
		log.info("modify : "+uservo);
		boolean modifyResult = usersmapper.update(uservo) == 1;
		return modifyResult;
	}



}
