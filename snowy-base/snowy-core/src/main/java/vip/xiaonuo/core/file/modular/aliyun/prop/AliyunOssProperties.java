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
package vip.xiaonuo.core.file.modular.aliyun.prop;

import lombok.Data;

/**
 * 腾讯云cos文件存储配置
 *
 * @author xuyuxiang
 * @date 2020/5/22 6:56 下午
 */
@Data
public class AliyunOssProperties {

    /**
     * 默认北京，内网
     * <p>
     * https://help.aliyun.com/document_detail/31837.html?spm=a2c4g.11186623.2.17.467f45dcjB4WQQ#concept-zt4-cvy-5db
     */
    private String endPoint = "http://oss-cn-beijing.aliyuncs.com";

    /**
     * 秘钥id
     */
    private String accessKeyId;

    /**
     * 秘钥secret
     */
    private String accessKeySecret;

}
