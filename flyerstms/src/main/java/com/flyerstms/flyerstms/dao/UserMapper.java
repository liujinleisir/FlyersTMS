package com.flyerstms.flyerstms.dao;

import com.flyerstms.flyerstms.base.BaseDao;
import com.flyerstms.flyerstms.model.User;
import com.flyerstms.flyerstms.model.UserExample;
import java.util.List;

public interface UserMapper extends BaseDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}