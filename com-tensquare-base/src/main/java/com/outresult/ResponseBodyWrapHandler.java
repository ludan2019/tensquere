package com.outresult;

import org.springframework.core.MethodParameter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import java.io.IOException;
import java.util.List;

/**
 * ResponseBody包装类，返回Result
 * created by ludan on 2017/09/25
 */
public class ResponseBodyWrapHandler extends RequestResponseBodyMethodProcessor {


    public ResponseBodyWrapHandler(final List<HttpMessageConverter<?>> messageConverters) {
        super(messageConverters);
    }

    public ResponseBodyWrapHandler(final List<HttpMessageConverter<?>> messageConverters, final ContentNegotiationManager contentNegotiationManager) {
        super(messageConverters, contentNegotiationManager);
    }

    @Override
    public boolean supportsReturnType(MethodParameter returnType) {
        return returnType.getMethodAnnotation(OuterResponseBody.class) != null;
    }

   
    @Override
    public void handleReturnValue(final Object returnValue, final MethodParameter returnType, final ModelAndViewContainer mavContainer, final NativeWebRequest webRequest) throws IOException, HttpMediaTypeNotAcceptableException {
        OuterResult result = OuterResult.OK(returnValue);
        super.handleReturnValue(result, returnType, mavContainer, webRequest);
    }
}