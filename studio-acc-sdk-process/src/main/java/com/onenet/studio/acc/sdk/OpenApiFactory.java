package com.onenet.studio.acc.sdk;

import com.onenet.studio.acc.sdk.util.EncryptUtil;

/**
 * OpenApiFactory
 *
 * @author zhk
 * @date 2023/11/30 9:58
 */
public class OpenApiFactory {

    public OpenApiFactory(String url, String productId, String accessKey) {
        this.url = url;
        this.productId = productId;
        this.accessKey = accessKey;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public byte[] getCaCrtFile() {
        return caCrtFile;
    }

    public void setCaCrtFile(byte[] caCrtFile) {
        this.caCrtFile = caCrtFile;
    }

    public String getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(String signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public OpenApi create(String devKey) throws Exception {
        return OpenApi.Builder.newBuilder()
                .url(url)
                .productId(productId)
                .devKey(devKey)
                .accessKey(accessKey)
                .caCrtFile(caCrtFile)
                .signatureMethod(signatureMethod)
                .build();
    }

    private String url;
    private String productId;
    private String accessKey;
    private byte[] caCrtFile;
    private String signatureMethod = EncryptUtil.SignatureMethod.SHA1.name().toLowerCase();

}
