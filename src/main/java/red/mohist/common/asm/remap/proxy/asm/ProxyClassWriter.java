package red.mohist.common.asm.remap.proxy.asm;

import red.mohist.common.asm.remap.RemapUtils;

import java.io.IOException;

/**
 *
 * @author pyz
 * @date 2019/7/15 8:52 PM
 */
public class ProxyClassWriter {

    public static byte[] remapClass(byte[] code) {
        try {
            return RemapUtils.remapFindClass(null, null, code);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
