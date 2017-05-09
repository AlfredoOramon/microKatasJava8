import org.junit.Before;
import org.junit.Test;

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
    FilterCollection SUT;

    @Before
    public void setup()
    {
        SUT=new FilterCollection();
    }

    @Test
    public void filterStrings_ListWithLotOfValuesAndThreeWithLenghtMoreThanThree_ShouldReturnAListWithOnlyThoseOneString
    {
        //given

        //then

        //when
        assertThat(result, hasSize(2));
        assertThat(result, hasItem("John"));
        assertThat(result, hasItem("Matias"));
    }

}
