package immutableObject;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final  class MMSCRouter {
/*
 * 实例训练：路由表 变动不会频繁 多线程共享路由表数据 需要保证线程安全 
 * 路由表可以做成一个不可变的对象模式
 * 
*/	
	//用volatile修饰保证可见性
	private static volatile MMSCRouter instance = new MMSCRouter();
	private final Map<String, MMSCInfo> routerMap;
	public MMSCRouter(){
		//将数据库表中的数据加载到内存，存为Map；
		this.routerMap = MMSCRouter.retriveRouterMapFromDB();
	}
	//从数据库中获取映射关系
	private static Map<String,MMSCInfo> retriveRouterMapFromDB(){
		Map<String,MMSCInfo> map = new HashMap<String,MMSCInfo>();
		//省略代码
		return map;
	}
	//获取实例
	public static MMSCRouter getInstance(){
		return instance;
	}
	//获取一个手机号对应的映射信息；
	public MMSCInfo getMMSC(String msisdnPrefix){
		return routerMap.get(msisdnPrefix);
	}
	//更新当前实例 变为最新的实例
	public static void setInstance(MMSCRouter newInstance){
		instance = newInstance;
	}
	//复制
	private static Map<String,MMSCInfo> deepCopy(Map<String,MMSCInfo> m){
		Map<String,MMSCInfo> result = new HashMap<String,MMSCInfo>();
		for(String key:m.keySet()){
			result.put(key, new MMSCInfo(m.get(key)));
		}
		return result;
	}
	//防御性复制
	public Map<String,MMSCInfo> getRouteMap(){
		return Collections.unmodifiableMap(deepCopy(routerMap));
	}
}
