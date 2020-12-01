package jx.tour.service;

import jx.tour.pojo.Scenic;
import jx.tour.pojo.ScenicComment;
import jx.tour.pojo.ScenicVo;
import jx.tour.pojo.ScenicWithBLOBs;
import jx.tour.pojo.Search;import java.util.List;

public interface ScenicService {
 //显示每个景点的具体信息
  public  Scenic getScenic(int scenic_id);
  //根据景点名称模糊查询具体景点信息
  public List<Scenic> getScenicByName(Search search);
  //显示评价信息
  public List<ScenicComment> getScenicComment(int scenic_id);
  //随机抽取3个风景
  public List<Scenic> getScenics();
  //随机抽取10个风景
  public List<Scenic> getSomeScenics();
  //发布景点评论信息
  public void publishScenicComment(ScenicComment sccomment);
  
 /* 后台service*/
  //添加景点信息
  public void addScenic(ScenicWithBLOBs scenic);
  //修改景点信息
  public void updateScenic(Scenic scenic);
  //下架景点
  public void downScenic(int scenicid);
  //上架景点
  public void upScenic(int scenicid);
  //查询批量下架的景点信息
  public List<ScenicVo> selectdownScenics(int ids[]);
 
}
