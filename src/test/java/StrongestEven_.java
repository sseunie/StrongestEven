import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class StrongestEven_ {
    private final int leftBound;
    private final int rightBound;
    private int strongestNumberOfInterval;

    public StrongestEven_(int leftBound, int rightBound, int strongestNumberOfInterval) {
        this.leftBound = leftBound;
        this.rightBound = rightBound;
        this.strongestNumberOfInterval = strongestNumberOfInterval;
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][] {
                {0, 0, 0}
        };
    }

    @Test
    public void executeTest() {
        assertThat(StrongestEven.getStrongest(leftBound, rightBound)).isEqualTo(strongestNumberOfInterval);
    }
}
