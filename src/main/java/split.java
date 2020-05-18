/**
 * @author Y.sh
 * @date 2019/12/11 15:08
 * @Description
 */
public class split {
    public static void main(String args[]){
        String str="2019年12月9日,2019年12月10日,2019年12月11日,2019年12月12日";
        String[] ary = str.split(",");
        System.out.println(ary.length);
        for (String item: ary) {
            System.out.println(item);
        }
//        System.out.println(ary[1]);

    }
}
