
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class listary {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("dfasdf");
        list.add("dfaga");
        list.add("afgagfa");
        System.out.println(StringUtils.join(list,","));
    }
}
