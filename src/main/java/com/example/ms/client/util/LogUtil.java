package com.example.ms.client.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wangwenchang
 * @date 2018/5/11 17:13
 */
public class LogUtil {

    private static Logger logger() {
        StackTraceElement caller = findCaller();
        return caller == null ? LoggerFactory.getLogger(LogUtil.class) : LoggerFactory.getLogger(caller.getClassName() + "." + caller.getMethodName() + "() Line: " + caller.getLineNumber());
    }

    private static StackTraceElement findCaller() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        } else {
            StackTraceElement caller = null;
            String logClassName = LogUtil.class.getName();
            boolean flag = false;
            StackTraceElement[] var4 = stackTrace;
            int var5 = stackTrace.length;
            for (int var6 = 0; var6 < var5; ++var6) {
                StackTraceElement stackTraceElement = var4[var6];
                if (logClassName.equals(stackTraceElement.getClassName())) {
                    flag = true;
                }

                if (flag && !logClassName.equals(stackTraceElement.getClassName())) {
                    flag = false;
                    caller = stackTraceElement;
                    break;
                }

            }
            return caller;
        }
    }

    public static void info(String message) {
        info(message,  null);
    }

    public static void info(String message, Throwable e) {
        logger().info(message,e);

    }

    public static void error(String message) {
        error(message,  null);
    }

    public static void error(String message, Throwable e) {
        logger().error(message,e);

    }

    public static void debug(String message) {
        debug(message,  null);
    }

    public static void debug(String message, Throwable e) {
        logger().error(message,e);

    }

}
