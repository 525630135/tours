package jx.tour.mapper;

import jx.tour.pojo.Hotel;
import jx.tour.pojo.HotelExample;
import jx.tour.pojo.HotelWithBLOBs;
import org.apache.ibatis.annotations.Param;import java.util.List;

public interface HotelMapper {
    int countByExample(HotelExample example);

    int deleteByExample(HotelExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(HotelWithBLOBs record);

    int insertSelective(HotelWithBLOBs record);

    List<HotelWithBLOBs> selectByExampleWithBLOBs(HotelExample example);

    List<Hotel> selectByExample(HotelExample example);

    HotelWithBLOBs selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") HotelWithBLOBs record, @Param("example") HotelExample example);

    int updateByExampleWithBLOBs(@Param("record") HotelWithBLOBs record, @Param("example") HotelExample example);

    int updateByExample(@Param("record") Hotel record, @Param("example") HotelExample example);

    int updateByPrimaryKeySelective(HotelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HotelWithBLOBs record);

    int updateByPrimaryKey(Hotel record);
}