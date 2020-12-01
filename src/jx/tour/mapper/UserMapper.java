package jx.tour.mapper;

import jx.tour.pojo.User;
import jx.tour.pojo.UserExample;
import jx.tour.pojo.UserWithBLOBs;
import org.apache.ibatis.annotations.Param;import java.util.List;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    List<UserWithBLOBs> selectByExampleWithBLOBs(UserExample example);

    List<User> selectByExample(UserExample example);

    UserWithBLOBs selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") UserWithBLOBs record, @Param("example") UserExample example);

    int updateByExampleWithBLOBs(@Param("record") UserWithBLOBs record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
}