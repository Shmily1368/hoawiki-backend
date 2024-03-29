package top.horizonask.hoawiki.authentication.security.handler;

import top.horizonask.hoawiki.authentication.common.ResponseUtils;
import cn.hutool.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @author: Yanbo Han
 * @time: 2021/12/31 2:36
 */

@Component
public class UserAccessDeniedHandler implements AccessDeniedHandler {


    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        ResponseUtils.responseJson(response,ResponseUtils.response(HttpStatus.HTTP_FORBIDDEN,"Access Denied.",accessDeniedException.getMessage()));
    }
}
