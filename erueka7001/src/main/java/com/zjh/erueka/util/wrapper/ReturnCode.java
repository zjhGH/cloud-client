package com.zjh.erueka.util.wrapper;

public enum ReturnCode implements IReturnCode {
    SUCCESS("Success", "成功", "S200"),
    ERROR("Error", "失败", "S500"),
    ILLEGAL_PARAMETER("Invalid Parameter", "非法参数", "S400"),
    NO_IN("Invalid Token", "没有权限", "S403"),
    PARAMETER_ERROR("\"%s\" Parameter Missing", "%s参数丢失", "0001E"),
    NOTICE_PUBLISH_ERROR("Publish Notice Error", "发布公告失败", "0101E"),
    TOILET_ID_ERROR("Toilet is not exist", "厕所不存在", "0102E"),
    TOILET_REFORM_ID_ERROR("Toilet ReForm is not exist", "厕改指标不存在", "0103E"),
    TOILET_DECLARE_IS_EXIST("Toilet Declare is exist", "申报已存在", "0104E"),
    TOILET_REPAIR_ID_ERROR("Toilet is not exist", "维修记录不存在", "01052E"),
    FILE_EMPTY_ERROR("file is empty", "文件为空", "01053E"),
    FILE_UPLOAD_ERROR("file upload error", "文件上传失败", "01053E"),
    USER_NOT_FIND("", "用户名不存在", "0200E"),
    PASSWORD_WRONG("", "密码不正确", "0200E");

    private String message;
    private String messageZn;
    private String code;

    private ReturnCode(String message, String messageZn, String code) {
        this.message = message;
        this.messageZn = messageZn;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getMessageZn() {
        return this.messageZn;
    }

    @Override
    public String getCode() {
        return this.code;
    }
}
