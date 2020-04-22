Package com.dependency.injection.example.util

// Java class which implements our NameUtil interface.

@Title // This annotation declares TitleCase as an Title
public class TitleCase implements NameUtil {

    @Override
    public String sanitizeName(String name) {
        return name.substring(0,1).toUpperCase()+name.substring(1);
    }
}