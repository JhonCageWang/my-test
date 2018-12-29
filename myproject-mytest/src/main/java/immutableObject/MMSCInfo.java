package immutableObject;

public class MMSCInfo {
	/*
	 * ������Ϣ������Ϣ
	 * û�� setter���� ֻ��getter������
	 * ��������������ݣ��豸��� url ���sizeҲ���Ա���ģһ�����ɱ����
	 */
	//�豸���
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
