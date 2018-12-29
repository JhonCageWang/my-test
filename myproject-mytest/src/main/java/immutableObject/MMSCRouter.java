package immutableObject;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final  class MMSCRouter {
/*
 * ʵ��ѵ����·�ɱ� �䶯����Ƶ�� ���̹߳���·�ɱ����� ��Ҫ��֤�̰߳�ȫ 
 * ·�ɱ��������һ�����ɱ�Ķ���ģʽ
 * 
*/	
	//��volatile���α�֤�ɼ���
	private static volatile MMSCRouter instance = new MMSCRouter();
	private final Map<String, MMSCInfo> routerMap;
	public MMSCRouter(){
		//�����ݿ���е����ݼ��ص��ڴ棬��ΪMap��
		this.routerMap = MMSCRouter.retriveRouterMapFromDB();
	}
	//�����ݿ��л�ȡӳ���ϵ
	private static Map<String,MMSCInfo> retriveRouterMapFromDB(){
		Map<String,MMSCInfo> map = new HashMap<String,MMSCInfo>();
		//ʡ�Դ���
		return map;
	}
	//��ȡʵ��
	public static MMSCRouter getInstance(){
		return instance;
	}
	//��ȡһ���ֻ��Ŷ�Ӧ��ӳ����Ϣ��
	public MMSCInfo getMMSC(String msisdnPrefix){
		return routerMap.get(msisdnPrefix);
	}
	//���µ�ǰʵ�� ��Ϊ���µ�ʵ��
	public static void setInstance(MMSCRouter newInstance){
		instance = newInstance;
	}
	//����
	private static Map<String,MMSCInfo> deepCopy(Map<String,MMSCInfo> m){
		Map<String,MMSCInfo> result = new HashMap<String,MMSCInfo>();
		for(String key:m.keySet()){
			result.put(key, new MMSCInfo(m.get(key)));
		}
		return result;
	}
	//�����Ը���
	public Map<String,MMSCInfo> getRouteMap(){
		return Collections.unmodifiableMap(deepCopy(routerMap));
	}
}
