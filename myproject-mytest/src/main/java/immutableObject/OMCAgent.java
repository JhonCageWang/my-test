package immutableObject;

public class OMCAgent extends Thread{

	@Override
	public void run() {
		boolean isTableModificationMsg =false;
		String updateTableName = null;
		while(true){
			//省略其他代码
			/* 从OMC连接的socket中读取消息进行解析，
			 * 解析到数据库更新消息后 重置mmscrouter实例；
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
