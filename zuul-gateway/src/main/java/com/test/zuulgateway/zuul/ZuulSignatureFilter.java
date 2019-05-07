//package com.test.zuulgateway.zuul;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * 描述：
// *
// * @author : lizhao
// * @Title: ZuulSignatureFilter
// * @Package: com.test.zuulgateway.zuul
// * @ProjectName lz_test
// * @Description: TODO
// * @date 2019-04-12  10:34
// */
//@Component
//public class ZuulSignatureFilter extends ZuulFilter {
//
//    @Override
//    public String filterType() {
//        return FilterConstants.PRE_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        return 0;
//    }
//
//    @Override
//    public boolean shouldFilter() { //此处可以判断环境
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//        System.out.println("网关打印request："+request);
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException { //通过网关进入
//        RequestContext rct = RequestContext.getCurrentContext();
//
//        HttpServletRequest request = rct.getRequest();
//        String requestURI = request.getRequestURI();
//        System.out.println("网关打印requestURI ："+requestURI);
//        return null;
//    }
//}
