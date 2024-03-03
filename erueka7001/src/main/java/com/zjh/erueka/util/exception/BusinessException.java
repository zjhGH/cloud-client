package com.zjh.erueka.util.exception;

import com.zjh.erueka.util.wrapper.IReturnCode;

public class BusinessException extends RuntimeException{

    private static final long serialVersionUID = -995417249630826674L;
    private String code;

    public BusinessException(IReturnCode returnCode) {
        super(returnCode.getMessage());
        this.code = returnCode.getCode();
    }

    public BusinessException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BusinessException)) {
            return false;
        } else {
            BusinessException other = (BusinessException)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$code = this.getCode();
                Object other$code = other.getCode();
                if (this$code == null) {
                    if (other$code != null) {
                        return false;
                    }
                } else if (!this$code.equals(other$code)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BusinessException;
    }

    @Override
    public int hashCode() {
        int result = 1;
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "BusinessException(code=" + this.getCode() + ")";
    }
}
