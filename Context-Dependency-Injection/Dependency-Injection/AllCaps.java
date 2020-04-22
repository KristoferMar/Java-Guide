Package com.dependency.injection.example.util

// Java class which extends the NameUtil interface.
public class AllCaps implements NameUtil {
    @Override
    public String sanitizeName(String name){
        return name.toUpperCase()
    }
}