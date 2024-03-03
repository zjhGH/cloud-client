package com.zjh.erueka.util.wrapper;

import java.beans.ConstructorProperties;
import java.io.Serializable;

public class ReturnWrapper<T> implements Serializable {

    private String message;
    private String code;
    private T result;

    ReturnWrapper() {
        this(ReturnCode.SUCCESS);
    }

    protected ReturnWrapper(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public ReturnWrapper(IReturnCode returnCode) {
        this(returnCode.getMessage(), returnCode.getCode());
    }

    public ReturnWrapper(IReturnCode returnCode, T result) {
        this(returnCode.getMessage(), returnCode.getCode(), result);
    }

    public ReturnWrapper<T> result(T result) {
        this.setResult(result);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public String getCode() {
        return this.code;
    }

    public T getResult() {
        return this.result;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setResult(final T result) {
        this.result = result;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ReturnWrapper)) {
            return false;
        } else {
            ReturnWrapper<?> other = (ReturnWrapper)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$message = this.getMessage();
                    Object other$message = other.getMessage();
                    if (this$message == null) {
                        if (other$message == null) {
                            break label47;
                        }
                    } else if (this$message.equals(other$message)) {
                        break label47;
                    }

                    return false;
                }

                Object this$code = this.getCode();
                Object other$code = other.getCode();
                if (this$code == null) {
                    if (other$code != null) {
                        return false;
                    }
                } else if (!this$code.equals(other$code)) {
                    return false;
                }

                Object this$result = this.getResult();
                Object other$result = other.getResult();
                if (this$result == null) {
                    if (other$result != null) {
                        return false;
                    }
                } else if (!this$result.equals(other$result)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ReturnWrapper;
    }

    @Override
    public int hashCode() {
        int result = 1;
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $result = this.getResult();
        result = result * 59 + ($result == null ? 43 : $result.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ReturnWrapper(message=" + this.getMessage() + ", code=" + this.getCode() + ", result=" + this.getResult() + ")";
    }

    @ConstructorProperties({"message", "code", "result"})
    public ReturnWrapper(final String message, final String code, final T result) {
        this.message = message;
        this.code = code;
        this.result = result;
    }
}
