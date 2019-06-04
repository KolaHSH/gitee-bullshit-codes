import java.util.Scanner;
import org.junit.Test;

/***
 * 
 * һ�������ü���Ĵ���
 * 
 */

public class CarInfo {
	public CarInfoOutPut queryAllCatMonitor(Long orderId) throws ParseException {
		/**��ȡ�˵�������Ϣ**/
		CarMonitorOutPut car = dao.getCar(orderId);
		CarTankRecent carTankRecent;
		CarInfoOutPut carInfoOutPut = new CarInfoOutPut();
		if(null!=car){
		   carTankRecent = carService.getCarTankRecent(car.getTractorPlate());
		    /**����**/
		    if(carTankRecent!=null){
		       car.setSpeed(carTankRecent.getMph());
		    }else{
		       car.setSpeed(0D);
		    }
		
		List<TaskInformationOutPut> list=new ArrayList<TaskInformationOutPut>();
		List<LoadTaskInformationOutPut> queryALLTask = dao.queryALLTask(orderId);
		for (LoadTaskInformationOutPut loadTaskInformationOutPut : queryALLTask) {
				if(loadTaskInformationOutPut.getType()==0){
					TaskInformationOutPut one = new TaskInformationOutPut();
					TaskInformationOutPut two = new TaskInformationOutPut();
					TaskInformationOutPut three = new TaskInformationOutPut();
					TaskInformationOutPut four = new TaskInformationOutPut();
					loadTaskInformationOutPut.getArriveTime();
					if(null!=loadTaskInformationOutPut.getArriveTime()){
		    		   one.setTaskInfo("�Ѿ�����");
		    		   one.setTaskType("װҺ");
		    		   one.setSignType("����");
		    		   one.setTagName("װҺ��Ϣ");
		    		   one.setTime(loadTaskInformationOutPut.getArriveTime());
		    		   one.setCustomerName(loadTaskInformationOutPut.getCustomerName());
		    		   one.setLng(loadTaskInformationOutPut.getLng());
		    		   one.setLat(loadTaskInformationOutPut.getLat());
		    		   car.setState("�Ѿ�����,ǰ����һ�������");
		    		   list.add(one);
					}
					if(loadTaskInformationOutPut.getLoadTime()!=null){
						two.setTaskInfo("��ʼװҺ");
						two.setTaskType("װҺ");
						two.setSignType("װҺ");
						two.setTagName("װҺ��Ϣ");
						two.setTime(loadTaskInformationOutPut.getLoadTime());
						two.setCustomerName(loadTaskInformationOutPut.getCustomerName());
						two.setLng(loadTaskInformationOutPut.getLng());
						two.setLat(loadTaskInformationOutPut.getLat());
			    		car.setState("��ʼװҺ,ǰ����һ�������");
			    		list.add(two);
					}
					if(loadTaskInformationOutPut.getLeaveTime()!=null){
						three.setTaskInfo("���װҺ");
						three.setTaskType("װҺ");
						three.setSignType("�뿪");
						three.setTagName("װҺ��Ϣ");
						three.setTime(loadTaskInformationOutPut.getLeaveTime());
						three.setCustomerName(loadTaskInformationOutPut.getCustomerName());
						three.setLng(loadTaskInformationOutPut.getLng());
						three.setLat(loadTaskInformationOutPut.getLat());
			    		car.setState("���װҺ,ǰ����һ�������");
			    		list.add(three);
					}
					if(loadTaskInformationOutPut.getReceiptTime()!=null&&loadTaskInformationOutPut.getPumpUrl()!=null){
						four.setTaskInfo("װҺ�ص�");
						four.setTaskType("װҺ");
						four.setSignType("װҺ�ص�");
						four.setTagName("�ص���Ϣ");
						four.setTime(loadTaskInformationOutPut.getReceiptTime());
						four.setPumpUrl(loadTaskInformationOutPut.getPumpUrl());
						four.setLoadWeigth(loadTaskInformationOutPut.getLoadWeigth());
						four.setCustomerName(loadTaskInformationOutPut.getCustomerName());
						four.setLng(loadTaskInformationOutPut.getLng());
						four.setLat(loadTaskInformationOutPut.getLat());
			    		car.setState("װҺ�ص�,ǰ����һ�������");
			    		list.add(four);
					}
					
				}
				if(loadTaskInformationOutPut.getType()==1){
					TaskInformationOutPut one = new TaskInformationOutPut();
					TaskInformationOutPut two = new TaskInformationOutPut();
					TaskInformationOutPut three = new TaskInformationOutPut();
					TaskInformationOutPut four = new TaskInformationOutPut();
					if(loadTaskInformationOutPut.getArriveTime()!=null){
					one.setTaskInfo("�Ѿ�����");
					one.setTaskType("жҺ");
					one.setSignType("����");
					one.setTagName("жҺ��Ϣ");
					one.setTime(loadTaskInformationOutPut.getArriveTime());
					one.setCustomerName(loadTaskInformationOutPut.getCustomerName());
					one.setLng(loadTaskInformationOutPut.getLng());
					one.setLat(loadTaskInformationOutPut.getLat());
					car.setState("����жҺ�ص�,ǰ����һ�������");
					list.add(one);
					}
					if(loadTaskInformationOutPut.getLoadTime()!=null){
			    		two.setTaskInfo("��ʼжҺ");
			    		two.setTaskType("жҺ");
			    		two.setSignType("жҺ");
			    		two.setTagName("жҺ��Ϣ");
						two.setTime(loadTaskInformationOutPut.getLoadTime());
						two.setCustomerName(loadTaskInformationOutPut.getCustomerName());
						two.setLng(loadTaskInformationOutPut.getLng());
						two.setLat(loadTaskInformationOutPut.getLat());
						list.add(two);
						car.setState("��ʼжҺ,ǰ����һ�������");
					}
					if(loadTaskInformationOutPut.getLeaveTime()!=null){
			    		three.setTaskInfo("���жҺ");
			    		three.setTaskType("жҺ");
			    		three.setSignType("�뿪");
			    		three.setTagName("жҺ��Ϣ");
			    		three.setTime(loadTaskInformationOutPut.getLeaveTime());
			    		three.setCustomerName(loadTaskInformationOutPut.getCustomerName());
			    		three.setLng(loadTaskInformationOutPut.getLng());
			    		three.setLat(loadTaskInformationOutPut.getLat());
			    		list.add(three);
			    		car.setState("���жҺ,ǰ����һ�������");
					}
					if(loadTaskInformationOutPut.getReceiptTime()!=null&&loadTaskInformationOutPut.getPumpUrl()!=null){
						four.setTaskInfo("жҺ�ص�");
						four.setTaskType("жҺ");
						four.setSignType("жҺ�ص�");
						four.setTagName("�ص���Ϣ");
						four.setPumpUrl(loadTaskInformationOutPut.getPumpUrl());
						four.setLoadWeigth(loadTaskInformationOutPut.getLoadWeigth());
						four.setTime(loadTaskInformationOutPut.getReceiptTime());
						four.setCustomerName(loadTaskInformationOutPut.getCustomerName());
						four.setLng(loadTaskInformationOutPut.getLng());
						four.setLat(loadTaskInformationOutPut.getLat());
						list.add(four);
						car.setState("���жҺ,ǰ����һ�������");
					}
				}
				if(loadTaskInformationOutPut.getType()==2){
					TaskInformationOutPut one = new TaskInformationOutPut();
					TaskInformationOutPut two = new TaskInformationOutPut();
					TaskInformationOutPut three = new TaskInformationOutPut();
					TaskInformationOutPut four = new TaskInformationOutPut();
					if(loadTaskInformationOutPut.getLoadTime()!=null){
					one.setTaskInfo("�Ѿ�����");
					one.setTaskType("��Һ");
					one.setSignType("����");
					one.setTagName("��Һ��Ϣ");
					one.setTime(loadTaskInformationOutPut.getArriveTime());
					one.setCustomerName(loadTaskInformationOutPut.getCustomerName());
					one.setLng(loadTaskInformationOutPut.getLng());
					one.setLat(loadTaskInformationOutPut.getLat());
					list.add(one);
					car.setState("���ﵹҺ�ص�,ǰ����һ�������");
					}
					if(loadTaskInformationOutPut.getLoadTime()!=null){
			    		two.setTaskInfo("��ʼ��Һ");
			    		two.setTaskType("��Һ");
			    		two.setSignType("��Һ");
			    		two.setTagName("��Һ��Ϣ");
						two.setTime(loadTaskInformationOutPut.getLoadTime());
						two.setCustomerName(loadTaskInformationOutPut.getCustomerName());
						two.setLng(loadTaskInformationOutPut.getLng());
						two.setLat(loadTaskInformationOutPut.getLat());
						list.add(two);
						car.setState("��ʼ��Һ,ǰ����һ�������");
					}
					if(loadTaskInformationOutPut.getLeaveTime()!=null){
			    		three.setTaskInfo("��ɵ�Һ");
			    		three.setTaskType("��Һ");
			    		three.setSignType("�뿪");
			    		three.setTagName("��Һ��Ϣ");
			    		three.setTime(loadTaskInformationOutPut.getLeaveTime());
			    		three.setCustomerName(loadTaskInformationOutPut.getCustomerName());
			    		three.setLng(loadTaskInformationOutPut.getLng());
			    		three.setLat(loadTaskInformationOutPut.getLat());
			    		list.add(three);
			    		car.setState("��ɵ�Һ,ǰ����һ�������");
			    		
					}
					if(loadTaskInformationOutPut.getReceiptTime()!=null&&loadTaskInformationOutPut.getPumpUrl()!=null){
						four.setTaskInfo("��Һ�ص�");
						four.setTaskType("��Һ");
						four.setSignType("��Һ�ص�");
						four.setTagName("�ص���Ϣ");
						four.setPumpUrl(loadTaskInformationOutPut.getPumpUrl());
						four.setLoadWeigth(loadTaskInformationOutPut.getLoadWeigth());
						four.setTime(loadTaskInformationOutPut.getReceiptTime());
						four.setCustomerName(loadTaskInformationOutPut.getCustomerName());
						four.setLng(loadTaskInformationOutPut.getLng());
						four.setLat(loadTaskInformationOutPut.getLat());
						list.add(four);
						car.setState("��Һ�ص�,׼������");
					}
			}
		}
		carInfoOutPut.setCar(car);
		carInfoOutPut.setTask(list);
	}
		return carInfoOutPut;
	}
	

}
