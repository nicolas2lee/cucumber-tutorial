package tao.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * Created by xinrui on 30/10/2017.
 */
public class StreamTest {
    public StreamTest() {
    }

    public Map<String, BigDecimal> checkPnl(List<Od> ods){
        Map result = ods.stream()
                .collect(groupingBy(
                        Od::getEl5, Collectors.collectingAndThen(
                                Collectors.toList(),
                                x -> x.stream()
                                        .map(y -> y.getValudoc())
                                        .reduce((a,b)-> a.add(b))
                        )
                ));

        for (int i=0; i<100;i++){

        }
        return result;
    }

    Function<BigDecimal, BigDecimal> summingBigDecimal(){
        return x-> x.add(BigDecimal.ZERO);
    }
}
