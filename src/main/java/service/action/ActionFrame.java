package service.action;

import domain.Context;
import service.BaseService;

import java.util.ArrayList;
import java.util.List;
/*使用serviceList将Service按需求组合执行，达到目的*/
public class ActionFrame {
    private List<BaseService> serviceList = new ArrayList<BaseService>();
    private Context context;
    public ActionFrame( List<BaseService> serviceList){
        this.serviceList.addAll(serviceList);
    }
    public void service(Context context){
        for(BaseService baseService:serviceList){
            baseService.doService(context);
        }
    }
}
