Package com.dependency.injection.example.util

@Stateless
public class PersonService {

    @Inject
    @Title // Defines that wew are using the "TitleCase.java" class.
    private NameUtil nameUtil;

    // Usage
    name = nameUtil.sanitizeName(name);
}