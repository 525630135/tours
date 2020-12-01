package jx.tour.mapper;

import jx.tour.pojo.ScenicVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
//后台查询景点的相关信息
public interface ScenicVoMapper {
	
	//查询景点的所有信息
    public List<ScenicVo> getAllScenic();
    //更新景点的状态（下架）
    public void downScenic(int scenicid);
   //更新景点的状态（上架）
    public void upScenic(int scenicid);
    //查询批量下架的景点信息
    public List<ScenicVo> selectScenics(int ids[]);
}