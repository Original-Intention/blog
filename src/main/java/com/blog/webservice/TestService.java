/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestService
 * Author:   zwh
 * Date:     2019-5-13 10:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.blog.webservice;

import javax.jws.WebService;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zwh
 * @create 2019-5-13
 * @since 1.0.0
 */
@WebService
public class TestService implements ITestService {
    public String printData(String printerName){
        String strRet = "Welcome to use WebService, " + printerName;

        System.out.println("Print from WebService:" + strRet);

        return strRet;
    }

}