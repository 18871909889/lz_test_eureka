package lz.test.springswgger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author : lizhao
 * @Title: SwaggerDemo
 * @Package: lz.test.springswgger.api
 * @ProjectName lz_test
 * @Description: TODO
 * @date 2019-05-07  16:54
 */
@Api(description = "测试接口")
@RestController
public class SwaggerDemo {

    @ApiOperation(value = "新增用户" ,  notes="新增注册")
    @GetMapping("/getSwagger")
    public String getSwagger(){
        return "测试Swagger的接口";
    }
}
