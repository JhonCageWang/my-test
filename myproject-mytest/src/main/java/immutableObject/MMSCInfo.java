package immutableObject;

public class MMSCInfo {
	/*
	 * 彩信信息中心信息
	 * 没有 setter方法 只有getter方法；
	 * 彩信中心相关数据，设备编号 url 最大size也可以被建模一个不可变对象
	 */
	//设备编号
	private final String deviceID ;
	private final String url ;
	private final int maxAttachmentSizeInByte;
	public MMSCInfo(MMSCInfo prototype){
		this.deviceID = prototype.deviceID;
		this.maxAttachmentSizeInByte = prototype.maxAttachmentSizeInByte;
		this.url = prototype.url;
	}
	public MMSCInfo(String deviceID,String url,int maxAttachmentSizeInBytes){
		this.deviceID = deviceID;
		this.url = url;
		this.maxAttachmentSizeInByte = maxAttachmentSizeInBytes;
	}
	public String getDeviceID() {
		return deviceID;
	}
	public String getUrl() {
		return url;
	}
	public int getMaxAttachmentSizeInByte() {
		return maxAttachmentSizeInByte;
	}
	
}
