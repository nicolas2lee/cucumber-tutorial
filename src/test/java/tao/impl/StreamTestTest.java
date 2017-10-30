package tao.impl;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by xinrui on 30/10/2017.
 */
public class StreamTestTest {
    @Test
    public void should_return_300() throws Exception {
        List<Od> ods = new ArrayList<>();
        Od od1 = new Od("EUR", new Amount("USD",new BigDecimal(100)));
        Od od2 = new Od("EUR", new Amount("USD",new BigDecimal(200)));
        ods.add(od1);
        ods.add(od2);
        StreamTest streamTest = new StreamTest();
        Map result = streamTest.checkPnl(ods);
        Optional<Amount> expected = Optional.of(new Amount("USD", new BigDecimal(300)));
        assertThat(result.get("EUR")).isEqualTo(expected);

    }


}