package immutableObject;

public class OMCAgent extends Thread{

	@Override
	public void run() {
		boolean isTableModificationMsg =false;
		String updateTableName = null;
		while(true){
			//ʡ����������
			/* ��OMC���ӵ�socket�ж�ȡ��Ϣ���н�����
			 * ���������ݿ������Ϣ�� ����mmscrouterʵ����
			 * 
			 */		
			if(isTableModificationMsg){
				if("MMSInfo".equals(updateTableName)){
					MMSCRouter.setInstance(new MMSCRouter());
				}
			}
		}
	}
		
}
