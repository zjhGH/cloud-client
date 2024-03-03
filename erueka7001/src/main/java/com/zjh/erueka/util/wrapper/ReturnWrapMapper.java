package com.zjh.erueka.util.wrapper;

import com.zjh.erueka.util.exception.BusinessException;

public class ReturnWrapMapper {

    public ReturnWrapMapper() {
    }

    public static <E> ReturnWrapper<E> illegalParameter() {
        return new ReturnWrapper(ReturnCode.ILLEGAL_PARAMETER);
    }

    public static <E> ReturnWrapper<E> error(BusinessException e) {
        return new ReturnWrapper(e.getMessage(), e.getCode());
    }

    public static <E> ReturnWrapper<E> error() {
        return new ReturnWrapper(ReturnCode.ERROR);
    }

    public static <E> ReturnWrapper<E> error(IReturnCode error) {
        return new ReturnWrapper(error);
    }

    public static <E> ReturnWrapper<E> errorWithException(Exception e) {
        return new ReturnWrapper(e.getMessage(), ReturnCode.ERROR.getCode());
    }

    public static <E> ReturnWrapper<E> ok() {
        return new ReturnWrapper(ReturnCode.SUCCESS);
    }

    public static <E> ReturnWrapper<E> ok(E o) {
        return new ReturnWrapper(ReturnCode.SUCCESS, o);
    }
}
