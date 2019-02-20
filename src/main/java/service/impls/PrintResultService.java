package service.impls;

import domain.Context;
import service.BaseService;

public class PrintResultService implements BaseService{
    public void doService(Context context) {
        int number = (Integer) context.getLocalValue("number");
        String result = (String) context.getLocalValue("result");
        if(result==null||"".equals(result)) result=String.valueOf(number);
        System.out.println(result);
    }
}
