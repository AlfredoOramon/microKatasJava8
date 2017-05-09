import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 8/05/17 9:27
 */
public class ToUpperTestClass
{

    public List<String> transform(List<String> collection)
    {
        return collection.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
