package com.outresult;

/**
 * created by ludan on 2017/09/25
 */
public class OuterResult {
    private Boolean flag = true;
    private String ecode = "200";
    private String msg = "操作成功";
    private Object data;

    public String getEcode() {
        return ecode;
    }

    public void setEcode(String ecode) {
        this.ecode = ecode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }

    public Boolean getFlag(){
        return this.flag;
    }

    public OuterResult(String message) {
        this.setFlag(true);
        this.setEcode("200");
        this.setMsg(message);
    }


    public OuterResult(boolean flag,String code,String message) {
        this.setFlag(flag);
        this.setEcode(code);
        this.setMsg(message);
    }

    public OuterResult() {
    }

    public static OuterResult newInstance() {
        return new OuterResult();
    }

    public static OuterResult OK(Object data){
        OuterResult outerResult = new OuterResult();
        outerResult.setFlag(true);
        outerResult.setEcode("20000");
        outerResult.setData(data);
        outerResult.setMsg("成功");
        return outerResult;
    }
}
