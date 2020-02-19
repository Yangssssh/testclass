package message;

/**
 * @author Y.sh
 * @date 2019/12/26 15:17
 * @Description
 */
public class Result<T> {
    private T data;

    private int code;

    private String message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //    public Result(T data) {
//        this.code = CODE_SUCCESS;
//        this.message = "成功";
//        this.data = data;
//    }
//
//    public Result() {
//        this.code = CODE_SUCCESS;
//        this.message = "成功";
//    }
//    public Result(String message) {
//        this.code = CODE_SUCCESS;
//        this.message = message;
//    }
//
//
//
//    public Result(int code, String message) {
//        this.code = code;
//        this.message = message;
//    }
//
//    public void failSystem() {
//        this.code = CODE_FAIL_SYSTEM;
//        this.message = "操作异常, 请稍后再试";
//    }
//
//    public void failSystem(String message) {
//        failSystem();
//        this.message = message;
//    }
//
//    public void failSystem(Exception e) {
//        failSystem(e.getMessage());
//        log.error("系统错误: ", e);
//    }
//
//    public Result failBiz(String message) {
//        this.code = CODE_FAIL_BIZ;
//        this.message = message;
//        return this;
//    }
//
//    @ApiModelProperty("业务数据")
//    public T getData() {
//        return data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }
//
//    @ApiModelProperty(value = "状态码: 0-认证失败 1-处理成功 2-服务器错误 3-业务处理错误")
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//
//    public static final int CODE_AUTH_FAIL = 0, CODE_SUCCESS = 1, CODE_FAIL_SYSTEM = 2, CODE_FAIL_BIZ = 3;
//
//    public boolean success() {
//        return this.code == CODE_SUCCESS;
//    }
}
