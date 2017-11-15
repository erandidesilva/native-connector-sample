package org.sample.con.calc;

import org.ballerinalang.annotation.JavaSPIService;
import org.ballerinalang.repository.PackageRepository;
import org.ballerinalang.repository.fs.ClasspathPackageRepository;
import org.ballerinalang.spi.ExtensionPackageRepositoryProvider;

/**
 * This represents the standard Ballerina built-in extension package repository provider.
 * 
 * @since 0.94
 */
@JavaSPIService("org.ballerinalang.spi.ExtensionPackageRepositoryProvider")
public class PackageRepositoryProvider implements ExtensionPackageRepositoryProvider {

    private static final String JAR_BAL_LIB_LOCATION = "/META-INF/natives/";

    @Override
    public PackageRepository loadRepository() {
        return new ClasspathPackageRepository(this.getClass(), JAR_BAL_LIB_LOCATION);
    }
}
