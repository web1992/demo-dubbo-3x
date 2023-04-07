package com.gbdmf.demo.dubbo3.api;

import com.internet.measure.common.dp.common.MultiUnitDP;
import com.internet.measure.common.dto.MultiUnitDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author web1992
 * @date 2023/4/7  13:55
 */
@Getter
@Setter
public class TestParamDTO implements Serializable {

    private static final long serialVersionUID = 3617107484430520235L;
    private MultiUnitDTO orderRealQuantity;


}
