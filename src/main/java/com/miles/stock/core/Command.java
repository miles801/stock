package com.miles.stock.core;

/**
 * @author miles
 * @datetime 2014/5/27 16:32
 */
public interface Command {
    /**
     * 执行命令
     *
     * @param context
     */
    void execute(CommandContext context);

}
