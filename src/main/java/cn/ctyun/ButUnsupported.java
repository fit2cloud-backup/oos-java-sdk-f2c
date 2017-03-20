package cn.ctyun;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 表示一个程序元素在AWS官方的SDK中原本没有被标注为"&#64;Deprecated"，
 * 但由于该元素没有被ctyun.cn服务端实现，故而被标注为"&#64;Deprecated"，
 * 以便借助IDE的警示功能提醒开发者注意。
 * 若开发者使用AWS官方的服务端，则无需理会该标注以及"&#64;Deprecated"标注。
 * <p/>
 * 
 * Indicate a program element that is not annotated as &#64;Deprecated 
 * in the official AWS' SDK, but unsupported at the server side of ctyun.cn.
 * 
 * @author: Jiang Feng
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})

public @interface ButUnsupported {

}
