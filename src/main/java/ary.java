import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Y.sh
 * @date 2020/4/21 15:26
 * @Description
 */
public class ary {
    public static void main(String[] args) {
        String[] arr={"1","5","88","1","9"};
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] str2=list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(arr));
    }

    private String 月;

    public String get月() {
        return 月;
    }

    public void set月(String 月) {
        this.月 = 月;
    }
}
