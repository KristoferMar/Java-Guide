Package com.dependency.injection.example.util

//This is a Qualifier annotation
// This is how we create our own annotation called @title.
@Qualifier
@Target({TYPE, METHOD, PARAMETER, FIELD})
@Retention(RUNTIME)
@Documented
public @interface Title {

}