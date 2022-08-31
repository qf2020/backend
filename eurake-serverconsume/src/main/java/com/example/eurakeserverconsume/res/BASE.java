package com.example.eurakeserverconsume.res;

public class BASE {
    private boolean state;
    private String msg;
    private Object result;

    public BASE(boolean state, String msg, Object result) {
        this.state = state;
        this.msg = msg;
        this.result = result;
    }

    public boolean isState() {
        return state;
    }

    public void setstate(boolean state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
