package jx.tour.mapper;

import jx.tour.pojo.OrderNumber;import java.util.List;

public interface DataViewMapper {
	//得到各个地方的订单数量情况
	public List<OrderNumber> getOrderNumber();
	 
 
}