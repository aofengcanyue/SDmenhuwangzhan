package com.regex.web.common.utils;

import java.text.ParseException;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;


/**
 * 〈一句话功能�?述�??<br>
 * Converter 〈功能详细描述�?�实现stringTodate
 */
public class StringDateConverter extends DateConverterBase implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        if (source == null) {
            return null;
        }
        String trim = source.trim();
        if (trim.length() == 0) {
            return null;
        }
        Date date = null;
        try {
        	date = source.contains(":") ? getDateTimeFormat().parse(trim) : getDateFormat().parse(trim);
        } catch (ParseException e) {
//            throw new BaseException("无效的日期格式：" + trim);
        }
		return date;
    }
}
