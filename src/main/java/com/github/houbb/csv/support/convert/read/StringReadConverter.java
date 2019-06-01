package com.github.houbb.csv.support.convert.read;

import com.github.houbb.csv.api.IReadConverter;
import com.github.houbb.heaven.annotation.ThreadSafe;

/**
 * 字符串读取转换器
 * @author binbin.hou
 * @since 0.0.1
 */
@ThreadSafe
public class StringReadConverter implements IReadConverter<String> {

    @Override
    public String convert(String value, Class fieldType) {
        return value;
    }

}
