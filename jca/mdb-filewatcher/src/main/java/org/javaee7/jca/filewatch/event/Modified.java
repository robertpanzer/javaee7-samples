package org.javaee7.jca.filewatch.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Modified {

    public String value() default ".*";

}
