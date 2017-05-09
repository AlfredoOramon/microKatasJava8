import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 9/05/17 12:14
 */
public class FilterCollection {
    public List<String> filterStringsByLenght(List<String> collection, int minLeght)
    {
        return collection.stream()
                .filter( string -> string.length() >= minLeght)
                .collect(Collectors.toList());
    }
}
