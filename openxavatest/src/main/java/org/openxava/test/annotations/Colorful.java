package org.openxava.test.annotations;

import java.lang.annotation.*;

/**
 * Custom annotation attached to an editor.
 * 
 * @author Javier Paniza
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface Colorful {
	
	String color() default "black";
	
}
