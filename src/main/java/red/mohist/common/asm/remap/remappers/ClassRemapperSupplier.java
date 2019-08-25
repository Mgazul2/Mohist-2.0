package red.mohist.common.asm.remap.remappers;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;

/**
 *
 * @author pyz
 * @date 2019/7/2 11:24 PM
 */
public interface ClassRemapperSupplier {
    default ClassRemapper getClassRemapper(ClassWriter classWriter) {
        return new ClassRemapper(classWriter, (Remapper) this);
    }
}
