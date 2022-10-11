package com.shitu.api.response;

/**
 * 注册返回
 *
 * @author andrew
 * @date 2021-10-27 10:27 AM
 */
public final class GetSystemIdResponse extends AbstractApiResponse {

    /**
     * 会员id
     */
    private String memberId;
    /**
     * 系统会员id
     */
    private String systemId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "GetSystemIdResponse [memberId=" + memberId + ", systemId=" + systemId + "]";
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}
