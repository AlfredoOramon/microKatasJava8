import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 9/05/17 9:41
 */
public class ToUpperTestClassTest {

    ToUpperTestClass SUT;

    @Before
    public void setup()
    {
        SUT=new ToUpperTestClass();
    }

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {

        //Given
        List<String> collection = asList("My", "name", "is", "John", "Doe");

        //When
        List<String> result=SUT.transform(collection);

        //Then
        assertThat(result, hasSize(5));
        assertThat(result, hasItem("MY"));
        assertThat(result, hasItem("NAME"));
        assertThat(result, hasItem("IS"));
        assertThat(result, hasItem("JOHN"));
        assertThat(result, hasItem("DOE"));
    }
}