/*
Copyright [2020] [https://www.xiaonuo.vip]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Snowy采用APACHE LICENSE 2.0开源协议，您在使用过程中，需要注意以下几点：

1.请不要删除和修改根目录下的LICENSE文件。
2.请不要删除和修改Snowy源码头部的版权声明。
3.请保留源码和相关描述文件的项目出处，作者声明等。
4.分发源码时候，请注明软件出处 https://gitee.com/xiaonuobase/snowy-cloud
5.在修改包名，模块名称，项目代码等时，请注明软件出处 https://gitee.com/xiaonuobase/snowy-cloud
6.若您的项目无法满足以上几点，可申请商业授权，获取Snowy商业授权许可，请在官网购买授权，地址为 https://www.xiaonuo.vip
 */
package vip.xiaonuo.api.tenant.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vip.xiaonuo.api.tenant.entity.TenantInfo;
import vip.xiaonuo.common.consts.FeignConstant;

/**
 * TenantInfoService 服务接口
 *
 * @author dongxiayu
 * @date 2021/3/31 1:26
 */
@RequestMapping("/feign/tenantInfoServiceApi")
public interface TenantInfoServiceApi {

    String APP_NAME = FeignConstant.TENANT_APP;

    /**
     * 获取租户信息，通过租户编码
     *
     * @param code 租户编码
     * @return 租户信息
     * @author xuyuxiang
     * @date 2019-06-19 14:17
     */
    @RequestMapping("/getByCode")
    TenantInfo getByCode(@RequestParam(value = "code") String code);

}