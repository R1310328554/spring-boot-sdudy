package com.lk.importSelector;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by luokai on 2017/11/14.
 */
public class LkImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println("LkImportSelector.selectImports");

        System.out.println("annotationMetadata = [" + annotationMetadata + "]");

        return new String[0];
    }
}
