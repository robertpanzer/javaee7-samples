package org.javaee7.jca.filewatch.event;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Deleted {

    public String value() default ".*";

}
