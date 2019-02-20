package service.impls;

import domain.Contants;
import domain.Context;
import service.BaseService;

public class SecondStageService implements BaseService{
    public void doService(Context context) {
        int number = (Integer)context.getLocalValue("number");
        String result = (String) context.getLocalValue("result");
        String numberStr = String.valueOf(number);
        if(result==null) result="";
        if(numberStr.contains("3")){
            if(result.equals("")) {
                result = Contants.ThreeTimes;
            } else if(result.equals(Contants.FiveTimes)){
                result = Contants.ThreeTimes + Contants.FiveTimes;
            }
        }
        if(numberStr.contains("5")){
            if(result.equals("")){
                result = Contants.FiveTimes;
            } else if(result.equals(Contants.ThreeTimes)) {
                result = Contants.ThreeTimes + Contants.FiveTimes;
            }
        }
        context.addLocalValue("result",result);
    }
}
