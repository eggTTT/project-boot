package com.jy.mobile;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

public class ResponseModel implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -8895500362492997291L;

    /** 接口通信成功，如有返回信息体，则处理信息体 */
    public static final String RTN_STATUS_OK = "0";

    /** 接口通信失败或异常，rtnMsg有异常信息 */
    public static final String RTN_STATUS_NG = "-1";

    /** 接口通信成功，出现业务失败， */
    public static final String RTN_STATUS_FAILED = "1";

    /** 接口通信成功重复调用，rtnMsg可有异常信息 */
    public static final String RTN_STATUS_REPEAT = "2";

    /** session失效 */
    public static final String RTN_STATUS_SESSION_INVALID = "-2";

    public static final String RTN_STATUS_SESSION_EXIST = "-3";

    /** 返回状态 */
    private String rtnStatus = RTN_STATUS_OK;

    /** 返回message */
    private String rtnMsg;

    /** 数据 */
    private Object data;

    private Long appSessionStartTime;

    public ResponseModel() {
//        HttpServletRequest request = ServletUtils.getRequest();
//
//        if (request != null && request.getAttribute("appSessionStartTime") != null) {
//            appSessionStartTime = (Long) request.getAttribute("appSessionStartTime");
//        }
    }

    public ResponseModel(int flag, String msg, Object data) {
        this.rtnStatus = String.valueOf(flag);
        this.rtnMsg = msg;
        this.data = data;
    }

    /*
     * public String getFlag() { return rtnStatus; }
     */

    public String getMsg() {
        return rtnMsg;
    }

    public Long getAppSessionStartTime() {
        return appSessionStartTime;
    }

    public void setAppSessionStartTime(Long appSessionStartTime) {
        this.appSessionStartTime = appSessionStartTime;
    }

    /**
     * @return the rtnStatus
     */
    public String getRtnStatus() {
        return rtnStatus;
    }

    /**
     * @param rtnStatus the rtnStatus to set
     */
    public void setRtnStatus(String rtnStatus) {
        this.rtnStatus = rtnStatus;
    }

    /**
     * @return the rtnMsg
     */
    public String getRtnMsg() {
        return rtnMsg;
    }

    /**
     * @param rtnMsg the rtnMsg to set
     */
    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

//    @JSONField(serialize = false)
//    public String getJson() {
//        if (ServletUtils.isFromPda(null)) {
//            return JSON.toJSONString(this, SerializerFeature.WriteClassName,
//                    SerializerFeature.DisableCircularReferenceDetect);
//        } else {
//            return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
//        }
//    }
}
