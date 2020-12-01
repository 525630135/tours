package jx.tour.mapper;

import jx.tour.pojo.OrderVo;
import jx.tour.pojo.UserorderVo;import java.util.List;

public interface UserorderVoMapper {
	 //更新商品的库存数量
	 public void updateNum(UserorderVo userorderVo);
	 //查询某用户的所有订单信息
	 public List<UserorderVo> findAllOrders(UserorderVo userorderVo);
	 
	 
	/* 后台*/
	 //查询所有的订单
	 public List<OrderVo> getAllorderVo();
	 
}