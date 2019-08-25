package red.mohist.common.asm.remap.proxy;

import red.mohist.common.asm.remap.RemapUtils;

import java.lang.reflect.Method;

/**
 *
 * @author pyz
 * @date 2019/7/6 10:09 AM
 */
public class ProxyMethod {
    public static String getName(Method method) {
        return RemapUtils.inverseMapMethodName(method.getDeclaringClass(), method.getName(), method.getParameterTypes());
    }
}
