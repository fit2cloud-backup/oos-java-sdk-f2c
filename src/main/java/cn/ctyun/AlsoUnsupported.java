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
 * 表示一个程序元素在AWS官方的SDK中已经被标注为"&#64;Deprecated"，
 * 同时该元素也没有被ctyun.cn服务端实现。因此，如果开发者使用AWS官方的服务端，
 * 则不建议使用该程序元素。如果开发者使用ctyun.cn的服务端，
 * 则不可以使用该程序元素。
 * <p/>
 * 
 * Indicate a program element that is annotated as &#64;Deprecated
 * in the official AWS' SDK, and also unsupported at the server side of ctyun.cn.
 * 
 * @author: Jiang Feng
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})

public @interface AlsoUnsupported {

}
