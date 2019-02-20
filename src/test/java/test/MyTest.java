package test;

import domain.Context;
import org.junit.Test;
import service.BaseService;
import service.action.ActionFrame;
import service.impls.FirstStageService;
import service.impls.PrintResultService;
import service.impls.SecondStageService;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    /*测试第一个需求*/
    @Test
    public void testFirstStage(){
      /*  按需求组合不同的Service，满足需求。同时，也为后续其他需求的扩展提供一个编写模板*/
        List<BaseService> serviceList = new ArrayList<BaseService>();
        serviceList.add(new FirstStageService());
        serviceList.add(new PrintResultService());
        ActionFrame actionFrame = new ActionFrame(serviceList);
        for(int i=1;i<=100;i++) {
            Context context = new Context();
            context.addLocalValue("number",i);
            actionFrame.service(context);
        }
    }
    /*测试第二个需求*/
    @Test
    public void testSecondStage(){
        List<BaseService> serviceList = new ArrayList<BaseService>();
        serviceList.add(new FirstStageService());
        serviceList.add(new SecondStageService());
        serviceList.add(new PrintResultService());
        ActionFrame actionFrame = new ActionFrame(serviceList);
        for(int i=1;i<=100;i++) {
            Context context = new Context();
            context.addLocalValue("number",i);
            actionFrame.service(context);
        }
    }
}
