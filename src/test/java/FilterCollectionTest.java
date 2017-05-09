import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
@RunWith(JUnitParamsRunner.class)
public class FilterCollectionTest
{
    private static final int MIN_LENGHT_FOUR=4;
    private static final int MIN_LENGHT_THREE=3;
    private static final int MIN_LENGHT_ONE=1;

    private static final int COLLECTION_SIZE_TWO=2;
    private static final int COLLECTION_SIZE_THREE=3;



    private FilterCollection SUT;

    @Before
    public void setup()
    {
        SUT=new FilterCollection();
    }

    private Object[] parametersList()
    {
        return new Object[]{
                //List, Expected, Max_lenght
                new Object[]{getListOfNames("My", "name", "is", "John", "Doe"), getListOfNames( "John", "name") , MIN_LENGHT_FOUR, COLLECTION_SIZE_TWO},
                new Object[]{getListOfNames("My", "name", "is", "John", "Doe"), getListOfNames( "John", "name", "Doe") , MIN_LENGHT_THREE,COLLECTION_SIZE_THREE}
        };
    }

 public List<String> getListOfNames(String... names)
 {
     List<String> result = asList(names);
     return result;
 }

    @Test
    @Parameters(method = "parametersList")
    public void filterStringsByLenght_ListWithLotOfValues_ShouldReturnAListWithOnlyThoseWithMinimunLeghtOf
            (List<String> collection,List<String> expectedList,int numberOfOccurences, int collectionSize) {

        List<String> result = SUT.filterStringsByLenght(collection, numberOfOccurences);

        //when
        assertThat(result, hasSize(collectionSize));
        for (String expected : expectedList) {
            assertThat(result, hasItem(expected));
        }
    }

}
