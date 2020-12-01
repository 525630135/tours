package jx.tour.mapper;

import jx.tour.pojo.Spcomment;
import jx.tour.pojo.SpcommentExample;
import org.apache.ibatis.annotations.Param;import java.util.List;

public interface SpcommentMapper {
    int countByExample(SpcommentExample example);

    int deleteByExample(SpcommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Spcomment record);

    int insertSelective(Spcomment record);

    List<Spcomment> selectByExampleWithBLOBs(SpcommentExample example);

    List<Spcomment> selectByExample(SpcommentExample example);

    Spcomment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Spcomment record, @Param("example") SpcommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Spcomment record, @Param("example") SpcommentExample example);

    int updateByExample(@Param("record") Spcomment record, @Param("example") SpcommentExample example);

    int updateByPrimaryKeySelective(Spcomment record);

    int updateByPrimaryKeyWithBLOBs(Spcomment record);

    int updateByPrimaryKey(Spcomment record);
}