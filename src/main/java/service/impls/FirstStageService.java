package service.impls;

import domain.Contants;
import domain.Context;
import service.BaseService;

public class FirstStageService implements BaseService{
    public void doService(Context context) {
        int number = (Integer) context.getLocalValue("number");
        String result = (String) context.getLocalValue("result");
        if(result==null) result="";
        if(number%3==0){
            result = result + Contants.ThreeTimes;
        }
        if(number%5==0){
            result = result + Contants.FiveTimes;
        }
        context.addLocalValue("result",result);
    }
}
