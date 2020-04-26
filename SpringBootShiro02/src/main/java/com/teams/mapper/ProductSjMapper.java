package com.teams.mapper;
import java.util.List;

import com.teams.pojo.D_file;
import com.teams.pojo.Feilei;
import com.teams.pojo.Pclass;
import com.teams.pojo.Type;

public interface ProductSjMapper {
	List<Type> selecttype();
	List<Feilei> selectfeilei();
	List<Pclass> selectpclass();
int addda(D_file file);
}
