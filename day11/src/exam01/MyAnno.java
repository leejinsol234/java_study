package exam01;


import static java.lang.annotation.ElementType.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //소스 적용 시점(실행 중에)
//@Target(value={ElementType.TYPE,ElementType.METHOD,ElementType.FIELD}) //소스 적용 범위 (value=ElementType.TYPE)
@Target(value={TYPE,METHOD,FIELD}) //상수로 import해서 간단하게 작성 import static java.lang.annotation.ElementType.*;
//여러 개일 때는 배열로 담음
public @interface MyAnno { //extends java.lang.annotation.Annotation
    String[] value() default {"이름1","이름2"}; //default로 기본값을 설정할 수 있다.
    int max() default 100;
    int min() default 10;
}
