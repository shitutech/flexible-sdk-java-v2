package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.ClientSdkException;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.OpenAcctModel;
import com.shitu.api.response.OpenAcctResponse;
import com.shitu.api.utils.FileUtil;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;

/**
 * @author andrew
 * @date 2021-10-28 2:03 PM
 */
public class OpenAcctRequest extends AbstractFlexibleRequest<OpenAcctResponse> {

    private static final String IMG_TOO_LARGE = "人脸图片不能超过2MB";

    private final OpenAcctModel bizModel;
    private File imgFace;
    private byte[] imgFaceBytes;

    public OpenAcctRequest(OpenAcctModel bizModel) {
        Objects.requireNonNull(bizModel);
        this.bizModel = bizModel;
    }

    public OpenAcctModel getBizModel() {
        return bizModel;
    }

    public File getImgFace() {
        return imgFace;
    }

    public void setImgFace(File imgFace) {
        this.imgFace = imgFace;
    }

    public byte[] getImgFaceBytes() {
        return imgFaceBytes;
    }

    public void setImgFaceBytes(byte[] imgFaceBytes) {
        this.imgFaceBytes = imgFaceBytes;
    }

    /**
     * API route
     *
     * @return route
     */
    @Override
    public String getApi() {
        return "";
    }

    @Override
    protected void checkParams() throws ClientSdkException {
        if (getBizModel().getImgFace() == null) {
            if (getImgFaceBytes() == null && getImgFace() == null) {
                throw new ClientSdkException("人脸图片未设置");
            }
            if (getImgFaceBytes() != null) {
                getBizModel().setImgFace(Base64.getEncoder().encodeToString(getImgFaceBytes()));
            } else if (getImgFace() != null) {
                getBizModel().setImgFace(Base64.getEncoder()
                        .encodeToString(FileUtil.fileToBytes(getImgFace())));
            }
        }

        try {
            byte[] img = getBizModel().getImgFace().getBytes(StandardCharsets.UTF_8);
            if (img.length > Constant.FILE_MAX_SIZE) {
                throw new ClientSdkException(IMG_TOO_LARGE);
            }
        } catch (Exception e) {
            throw new ClientSdkException(e);
        }
    }

    /**
     * 实际的请求参数的json格式的字符串
     *
     * @return json字符串
     */
    @Override
    protected String doGetParams() {
        return JSON.toJSONString(getBizModel());
    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型R
     */
    @Override
    public Class<OpenAcctResponse> getResponseClass() {
        return OpenAcctResponse.class;
    }
}
