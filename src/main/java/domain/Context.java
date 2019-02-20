package domain;

import java.util.HashMap;
/*使用Context作为上下文，在不同的Service间传递值*/
public class Context {
    private HashMap<String, Object> localMap = new HashMap<String, Object>();
    public void addLocalValue(String name,Object value){
        localMap.put(name,value);
    }
    public Object getLocalValue(String name){
        return localMap.get(name);
    }
}
