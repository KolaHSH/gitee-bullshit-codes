package test;

public class GetTimestamp {

	//��ȡһ��֮���ʱ���
	public static long getTimestampDayLater() throws InterruptedException {
		 Thread.sleep(1000 * 60 * 60 * 24);
		 return System.currentTimeMillis();
	 }

}
