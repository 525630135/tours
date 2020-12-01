package jx.tour.mapper;

import jx.tour.pojo.SpecialtyVo;import java.util.List;

//后台查询景点的相关信息
public interface SpecialtyVoMapper {
	//查询景点的所有信息
    public List<SpecialtyVo> getAllSpecialty();
   //更新特产的状态（下架）
    public void downSpecialty(int specialtyid);
   //更新特产的状态（上架）
    public void upSpecialty(int specialtyid);

    
     
   
    
    
}