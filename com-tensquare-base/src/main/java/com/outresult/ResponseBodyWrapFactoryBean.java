package com.outresult;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * 替换为ResponseBody包装类
 * created by ludan on 2017/09/25
 */
@Component
public class ResponseBodyWrapFactoryBean implements InitializingBean {

    @Autowired
    private RequestMappingHandlerAdapter adapter;

    @Autowired
    private ApplicationContextProvider applicationContextProvider;

    @Override
    public void afterPropertiesSet() throws Exception {
        List<HandlerMethodReturnValueHandler> returnValueHandlers = adapter.getReturnValueHandlers();
        List<HandlerMethodReturnValueHandler> handlers = new ArrayList<>(returnValueHandlers);
        decorateHandlers(handlers);
        adapter.setReturnValueHandlers(handlers);
    }

    private void decorateHandlers(List<HandlerMethodReturnValueHandler> handlers) {
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();

        MappingJackson2HttpMessageConverter converter = applicationContextProvider.getBeanByClass(MappingJackson2HttpMessageConverter.class);

        messageConverters.add(converter);

        ResponseBodyWrapHandler handler = new ResponseBodyWrapHandler(messageConverters);
        handlers.add(0, handler);
    }

}