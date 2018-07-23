package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Faker on 2018\5\7 0007.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Protocol {
    String value();
}
