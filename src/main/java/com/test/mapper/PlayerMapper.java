package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.test.model.Player;

@Mapper
@Component
public interface PlayerMapper {
	@Select("select * from players")
	List<Player>selectAllPlayer();
	
	@Select("select * from players where id = #{id}")
	Player selectPyalerById(@Param("id")Long id);
	
	int  savePlayer(@Param("user")Player player);
	
	int deleteById(@Param("id")Long id);
}
