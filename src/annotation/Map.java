package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import rotas.MetodoHttp;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Map {
	
	public String endereco() default "";
	public boolean autenticar() default false;
	public MetodoHttp metodo() default MetodoHttp.GET;

}
