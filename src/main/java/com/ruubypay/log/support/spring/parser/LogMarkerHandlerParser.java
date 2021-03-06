package com.ruubypay.log.support.spring.parser;

import com.ruubypay.log.AroundLogHandler;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * @author liu_penghui
 * @date 2018/10/17.
 */
public class LogMarkerHandlerParser extends AbstractSingleBeanDefinitionParser {
    @Override
    protected Class<?> getBeanClass(Element element) {
        return AroundLogHandler.class;
    }
}
