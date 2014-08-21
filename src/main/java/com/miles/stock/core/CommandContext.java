package com.miles.stock.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @author miles
 * @datetime 2014/5/27 16:32
 */
public class CommandContext {
    private Map<String, Object> map = new HashMap<String, Object>();

    public void add(String key, Object value) {
        map.put(key, value);
    }

    public Object get(String key) {
        return map.get(key);
    }
}
