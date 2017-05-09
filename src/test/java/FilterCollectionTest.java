import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 9/05/17 12:11
 */
public class FilterCollectionTest
{
    private static final int MIN_LENGHT_FOUR=4;
    FilterCollection SUT;

    @Before
    public void setup()
    {
        SUT=new FilterCollection();
    }

    @Test
    public void filterStringsByLenght_ListWithLotOfValuesAndThreeWithLenghtMoreThanThree_ShouldReturnAListWithOnlyThoseOneString()
    {
        //given

        List<String> collection = asList("My", "name", "is", "John", "Doe");

        //then
        List<String> result=SUT.filterStringsByLenght(collection,MIN_LENGHT_FOUR);

        //when
        assertThat(result, hasSize(2));
        assertThat(result, hasItem("John"));
        assertThat(result, hasItem("Mathias"));
    }

}
