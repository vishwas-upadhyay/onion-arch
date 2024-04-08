package com.thetechyatra.onionarchspringboot.architecture;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "com.thetechyatra.onionarchspringboot",
        importOptions = {
                ImportOption.DoNotIncludeTests.class,
                ImportOption.DoNotIncludeJars.class,
                ImportOption.DoNotIncludeArchives.class
        })
public class ArchitectureTest {
 @ArchTest
 public static void meet_onion_architecture_rules(JavaClasses classes) {
  onionArchitecture()
          .domainModels("com.thetechyatra.onionarchspringboot.domain.model..")
          //.domainServices("com.thetechyatra.onionarchspringboot.domain..")
          .applicationServices("com.thetechyatra.onionarchspringboot.application..")
          .adapter("persistence", "com.thetechyatra.onionarchspringboot.adapter.spi.persistence..")
          .adapter("rest", "com.thetechyatra.onionarchspringboot.adapter.api.rest..")
//          .adapter("web", "com.thetechyatra.onionarchspringboot.web..")
          .check(classes);
 }
}
