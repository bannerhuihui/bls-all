package com.bls.service.feign;

import com.bls.bean.ResultMsg;
import com.bls.enu.ResultCodeEnum;
import com.bls.pojo.Test;
import com.bls.service.TestFeignService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestFeignFallbackService implements TestFeignService {

    @Override
    public ResultMsg<List<Test>> selectAll() {
        ResultMsg rst = new ResultMsg(ResultCodeEnum.SYSTEM_FAILURE.getCode(),ResultCodeEnum.SYSTEM_FAILURE.getMsg(),null);
        return rst;
    }
}
