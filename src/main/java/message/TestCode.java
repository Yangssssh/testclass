package message;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import java.util.Random;

/**
 * @author Y.sh
 * @date 2019/12/26 14:53
 * @Description
 */
public class TestCode {
    private final static int codeLength=5;

    public static String getCode(){
        Random rand = new  Random();
        int  a ;
        String  result ="";
        for( int j =0; j<codeLength; j++ ){
            a = Math.abs( rand.nextInt()%9 );
            result += String.valueOf(a);
        }
        return  result;
    }

        public static void phonepush(String number,String message) throws Exception{
            HttpClient client = new HttpClient();
            PostMethod post = new PostMethod("http://utf8.api.smschinese.cn/");
            post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=Utf-8");//在头文件中设置转码
            NameValuePair[] data ={ new NameValuePair("Uid", "Yssssssh"),new NameValuePair("Key", "d41d8cd98f00b204e980"),new NameValuePair("smsMob",number),new NameValuePair("smsText",message)};
            post.setRequestBody(data);

            client.executeMethod(post);
            Header[] headers = post.getResponseHeaders();
            int statusCode = post.getStatusCode();
            System.out.println("statusCode:"+statusCode);
            for(Header h : headers)
            {
                System.out.println(h.toString());
            }
            String result = new String(post.getResponseBodyAsString().getBytes("Utf-8"));
            System.out.println(result); //打印返回消息状态


            post.releaseConnection();

        }

        public static Result sendCode(String number){
            Result result=new Result();
            //判断手机号是否为空
            if(number==null || number.length()==0){
                result.setCode(2);
                result.setMessage("手机号为空");
                return result;
            }
            //判断是否为有效验证码
            String code=getCode();
            if(code==null || code.length()==0){
                result.setCode(2);
                result.setMessage("验证码无效");
                return result;
            }

            String message="您的验证码为:" + code + "，该码有效期为3分钟，请勿泄露于他人";
            try {
                phonepush(number,message);
            } catch (Exception e) {
                result.setCode(2);
                result.setMessage("验证码发送失败");
                return result;
            }

            result.setCode(1);
            result.setMessage("验证码发送成功");
            return result;
        }

    public static void main(String args[]){
        Result result=sendCode("15635104015");
    }
}
