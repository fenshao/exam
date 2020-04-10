
 <h1 class="curproject-name"> 报案人微信端（五华区） </h1> 
 


# 1 公共分类

## 1.1 图片验证码获取
<a id=1.1 图片验证码获取> </a>
### 基本信息

**Path：** /common/verificationPhoto

**Method：** POST

**接口描述：**
<p>success值：True&nbsp; &nbsp;返回图片验证码<br>
success值：False&nbsp; &nbsp; message信息为原因</p>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> photo</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">图片</span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> photoKey</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">加密的图片信息</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 1.2 上传图片换Code
<a id=1.2 上传图片换Code> </a>
### 基本信息

**Path：** /common/uploadImage

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  multipart/form-data | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| imageData | file  |  是 |    |  图片数据 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fileCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">图片编码</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 1.3 上传身份证照
<a id=1.3 上传身份证照> </a>
### 基本信息

**Path：** /common/uploadIdCard

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  multipart/form-data | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| idCardFace | file  |  是 |    |  人像面图片 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fileInfo</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> fileCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> fileUrl</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> cardInfo</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> aid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> idCard</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> fileCode</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> sex</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ethnicity</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> address</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> issue</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> validFrom</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> validTo</span></td><td key=1><span>null</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> birth</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-1-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> modifyTime</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 1.4 发送验证短信
<a id=1.4 发送验证短信> </a>
### 基本信息

**Path：** /common/sendMessageCode

**Method：** POST

**接口描述：**
<p>success: True&nbsp; 发送成功</p>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| phone | text  |  是 |    |  报案人手机号 |
| imageCode | text  |  是 |    |  图片验证码 |
| imageCodeKey | text  |  是 |    |  图片验证码秘钥 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> messgage</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 1.5 地区选择
<a id=1.5 地区选择> </a>
### 基本信息

**Path：** /common/queryRegion

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>1.5</td>
<td>Report_WA_Common_QueryRegion_ByParentID</td>
<td>根据父节点查出其所有子节点</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| fatherAid | text  |  是 |    |  【-1代表顶级】 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> regionList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">地址</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> aid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 1.6 工作区地址选择
<a id=1.6 工作区地址选择> </a>
### 基本信息

**Path：** /common/selectWorkRegion

**Method：** POST

**接口描述：**
<p>如果是仲裁， 该接口和正常地区接口返回的数据一样<br>
如果是监察 ， 该接口只会返回已开通的区域</p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>1.6</td>
<td>Report_WA_Common_QueryWorkRegion</td>
<td>查工作区AID</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| fatherAid | text  |  是 |    |  父节点 |
| whatUnit | text  |  是 |    |  什么监管单位管【1仲裁 0监察】 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> regionList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> fatherAid</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> aid</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 1.7 公司注册区地址选择
<a id=1.7 公司注册区地址选择> </a>
### 基本信息

**Path：** /common/selectRegisterRegion

**Method：** POST

**接口描述：**
<p>如果是仲裁， 该接口只会返回开通的区域<br>
如果是监察 ，该接口和正常地区接口返回的数据一样</p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>1.7</td>
<td>Report_WA_Common_QueryRegisterRegion</td>
<td>查注册区AID</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| fatherAid | text  |  是 |    |  父节点 |
| whatUnit | text  |  是 |    |  什么监管单位管【1仲裁 0监察】 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> regionList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> aid</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 1.8 获取公众号AppID和APPSecret
<a id=1.8 获取公众号AppID和APPSecret> </a>
### 基本信息

**Path：** /common

**Method：** POST

**接口描述：**
undefined

### 请求参数

# 测试

## 获取token
<a id=获取token> </a>
### 基本信息

**Path：** /test/test

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
# 2 登录/注册

## 2.1微信直接登录
<a id=2.1微信直接登录> </a>
### 基本信息

**Path：** /login/wxLogin

**Method：** POST

**接口描述：**
<p>success:True 返回token<br>
success:False 无信息，请直接跳转至登录界面</p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>2.1</td>
<td>Report_WA_Login_WxLogin_Q_ByWxOpenID</td>
<td>通过WxOpenID进行登录，查询是否存在用户记录</td>
<td>界面传的WxCode并不是WxOpenID，需要在服务层区进行换取WxOpenID</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| waJsCode | text  |  是 |  xxxxx  |  微信Code |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> token</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> sex</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 2.2短信登录_copy
<a id=2.2短信登录_copy> </a>
### 基本信息

**Path：** /login/messageLogin_1572060103417

**Method：** POST

**接口描述：**
<p>验证成功success值为True，返回token<br>
验证失败success值为False ，message为原因信息</p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>2.2</td>
<td>Report_WA_Login_MessageLogin_Q_ByPhone</td>
<td>根据手机号查登录账号信息</td>
<td>先用WxOpenID查出原来的账号，然后清空WxOpenID,再将该ID更新至目前将要登录的账户</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| phone | text  |  是 |  13888121880  |  电话号码【最长20位】 |
| messageCode | text  |  是 |  1111  |  短信验证码【4位】 |
| waJsCode | text  |  是 |  111  |  微信Code |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> token</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> sex</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 2.2短信登录
<a id=2.2短信登录> </a>
### 基本信息

**Path：** /login/messageLogin

**Method：** POST

**接口描述：**
<p>验证成功success值为True，返回token<br>
验证失败success值为False ，message为原因信息</p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>2.2</td>
<td>Report_WA_Login_MessageLogin_Q_ByPhone</td>
<td>根据手机号查登录账号信息</td>
<td>先用WxOpenID查出原来的账号，然后清空WxOpenID,再将该ID更新至目前将要登录的账户</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| phone | text  |  是 |  13888121880  |  电话号码【最长20位】 |
| messageCode | text  |  是 |  1111  |  短信验证码【4位】 |
| waJsCode | text  |  是 |  111  |  微信Code |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> token</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> sex</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 2.3密码登录
<a id=2.3密码登录> </a>
### 基本信息

**Path：** /login/keyLogin

**Method：** POST

**接口描述：**
<p>success值为True：返回Token<br>
success值为False：message返回原因</p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>2.3</td>
<td>Report_WA_Login_KeyLogin_Q</td>
<td>用账户密码方式登录</td>
<td>成功返回（1，姓名，性别,） 失败（0，null，null）,WXOpenID问题同上</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| phone | text  |  是 |  18278477185  |  电话号码【最长20位】 |
| loginKey | text  |  是 |  123456  |  密码【最长20位】 |
| waJsCode | text  |  是 |  xxx  |  微信Code |
| imageKey | text  |  否 |    |  图片验证码密钥 |
| imageCode | text  |  否 |    |  图片验证码的码 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> token</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> sex</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 2.4注册 
<a id=2.4注册 > </a>
### 基本信息

**Path：** /login/register

**Method：** POST

**接口描述：**
<p>注册成功返回success返回True，且附带Token<br>
注册失败返回success返回False，并返回message错误信息</p>
<p><br data-tomark-pass=""><br>
<br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>2.4</td>
<td>Report_WA_Login_Register_I</td>
<td>注册</td>
<td>微信问题同2.3</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| phone | text  |  是 |  13888121888  |  电话号码 |
| loginKey | text  |  是 |  123456  |  密码 |
| messageCode | text  |  是 |  111  |  短信验证码【4位】 |
| waJsCode | text  |  否 |  111  |  微信Code |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> token</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 2.5 忘记密码
<a id=2.5 忘记密码> </a>
### 基本信息

**Path：** /login/forgetLoginKey

**Method：** POST

**接口描述：**
<p><br data-tomark-pass=""><br>
<br data-tomark-pass=""><br>
<br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>2.5</td>
<td>Report_WA_Login_ForgetLoginKey_U</td>
<td>忘记密码</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| phone | text  |  是 |  13888121888  |  电话号码 |
| loginKey | text  |  是 |  123456  |  密码 |
| messageKey | text  |  是 |  111  |  短信验证码【4位】 |
| waJsCode | text  |  是 |  111  |  微信Code |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 2.6 退出登录
<a id=2.6 退出登录> </a>
### 基本信息

**Path：** /login/exitLogin

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>2.6</td>
<td>Report_WA_Login_ExitLogin</td>
<td>退出登录</td>
<td>清除WxopenID</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
# 4 个人中心

## 4.1 个人信息保存
<a id=4.1 个人信息保存> </a>
### 基本信息

**Path：** /personalCenter/personalInfoUpload

**Method：** POST

**接口描述：**
<p>（调用此接口之前，请先在公共接口类调用上传身份证）<br>
success：True 身份信息保存成功<br>
success：False 身份信息修改失败，message内容为失败原因</p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>4.1</td>
<td>Report_WA_PersonalCenter_PersonalInfoUpload_U</td>
<td>登录者认证信息保存</td>
<td>先更新Users表，然后查询对应的DisputeUser的ismyself为True的属性，更新之，没有则插入一条（IsComplete设为</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| name | text  |  是 |    |  姓名【最多20字】 |
| sex | text  |  是 |    |  性别【1男  0女】 |
| ethnicityName | text  |  是 |    |  民族【最长12个字】 |
| idCard | text  |  是 |    |  证件号码【最长20位】 |
| birthday | text  |  是 |    |  出生年月日 |
| idCardFaceCode | text  |  是 |    |  身份证头像面Code |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 4.2 修改密码
<a id=4.2 修改密码> </a>
### 基本信息

**Path：** /personalCenter/alterLoginKey

**Method：** POST

**接口描述：**
<p>success:True 修改成功</p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>4.2</td>
<td>Report_WA_PersonalCenter_AlterLoginKey_U</td>
<td>修改密码</td>
<td>老密码一致以后才能执行更新，更新成功返回1,更新失败返回0</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| oldKey | text  |  是 |    |  老密码 |
| newKey | text  |  是 |    |  新密码 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 4.3 意见反馈
<a id=4.3 意见反馈> </a>
### 基本信息

**Path：** /personalCenter/feedback

**Method：** POST

**接口描述：**
<p>success:true 意见反馈成功</p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>4.3</td>
<td>Report_WA_PersonalCenter_Feedback_I</td>
<td>意见反馈</td>
<td>只是反馈给开发人员看的</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| description | text  |  是 |    |  问题描述 【最多300字】 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 4.4  验证登录者是否实名认证
<a id=4.4  验证登录者是否实名认证> </a>
### 基本信息

**Path：** /personalCenter/verificationMan

**Method：** POST

**接口描述：**
<p><br data-tomark-pass=""><br>
<br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>4.4</td>
<td>Report_WA_PersonalCenter_VerificationMan_Q</td>
<td>验证登陆者是否实名认证</td>
<td>查Users的是字段</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isVerified</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">实名验证【True 实名通过  False实名失败】</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 4.5 个人信息查看
<a id=4.5 个人信息查看> </a>
### 基本信息

**Path：** /personalCenter/queryMyinfo

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td><span class="colour" style="color:rgb(85, 85, 85)">Report_WA_PersonalCenter_PersonalInfo_Q</span></td>
<td>个人信息查询</td>
<td>已实名认证</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> loginUser</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">姓名【20个字】</span></td><td key=5></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> sex</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">性别【True男  False女】</span></td><td key=5></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> ethnicityName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">民族【最长12个汉字】</span></td><td key=5></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> idCard</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">身份证号【最长20个字】</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 4.6 获取登录用户的unionId
<a id=4.6 获取登录用户的unionId> </a>
### 基本信息

**Path：** /personalCenter/getUnionId

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th>存储过程</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td>Report_WA_PersonalCenter_UserUnionID_U</td>
<td>将unionId更新至User表</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| waJsCode | text  |  是 |    |  微信JsCode |
| iv | text  |  是 |    |  加密算法的初始向量 |
| encryptedData | text  |  是 |    |  被加密的数据 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
# 5 劳动者维权/企业维权

## 5.1  劳动者个人类别列表
<a id=5.1  劳动者个人类别列表> </a>
### 基本信息

**Path：** /......................................................................../

**Method：** POST

**接口描述：**
<p>个人类别列表，请写死在前端（服务端不提供列表）<br>
最后缓存在 <span class="colour" style="color:rgba(13, 27, 62, 0.65)">laborList[0].typeName~~~~</span>字段里&nbsp; 最长不能超过50个字</p>
<p>反正你选不对，什么都没有，没有持久化。</p>
<p>隐藏此页面</p>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
## 5.2 所有纠纷类型列表
<a id=5.2 所有纠纷类型列表> </a>
### 基本信息

**Path：** /rightsProtect/argumentTypeList

**Method：** POST

**接口描述：**
<p>纠纷类别是多选的<br>
针对仲裁来讲叫做争议类型列表</p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.2</td>
<td>Report_WA_RightsProtect_ArgumentTypeList_Q</td>
<td>查纠纷列表</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> argumentTypeList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> argumentTypeId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">争议类别ID【0-254】</span></td><td key=5></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">争议描述</span></td><td key=5></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> isArbitration</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是仲裁类型【True是 False否】</span></td><td key=5></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> isMonitoring</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是监察类型【True是 False否】</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.3 双方基本信息_劳动者通讯录
<a id=5.3 双方基本信息_劳动者通讯录> </a>
### 基本信息

**Path：** /rightsProtect/queryLaborList

**Method：** POST

**接口描述：**
<p>success: Ture&nbsp; &nbsp;查询成功<br>
success: False&nbsp; 查询失败，请查看详细错误原因</p>
<p>iscomplete 为1的可以被选中<br>
iscomplete 为0的不能被选中 但是可以被编辑</p>
<p><br data-tomark-pass=""><br>
<br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.3</td>
<td>Report_WA_RightsProtect_LaborList_Q</td>
<td>查询一个账户下的通信录列表</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| pageIndex | text  |  是 |    |  想请求第几页 |
| pageSize | text  |  是 |    |  每页最大行数 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> laborList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> aid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者aid</span></td><td key=5></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者姓名</span></td><td key=5></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> phone</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者电话号码</span></td><td key=5></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> isComplete</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据是否完整</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.4 选择劳动者列表
<a id=5.4 选择劳动者列表> </a>
### 基本信息

**Path：** /rightsProtect/queryLabor

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.4</td>
<td>Report_WA_RightsProtect_LaborDetail_Q</td>
<td>查询一个劳动者的详细信息</td>
</tr>
</tbody>
</table>
<p>这个是抽屉里的人<br>
案件人<br>
类似于微信买车票程序的乘客</p>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| laborAid | text  |  是 |    |  劳动者aid |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> laborAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者AID</span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">姓名【20个字】</span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> sex</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">性别【True男  False女】</span></td><td key=5></td></tr><tr key=0-3-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> ethnicityName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">民族【最长12个汉字】</span></td><td key=5></td></tr><tr key=0-3-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> idCard</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">身份证号【最长20个字】</span></td><td key=5></td></tr><tr key=0-3-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> idCardFaceCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">身份证人像面Code</span></td><td key=5></td></tr><tr key=0-3-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> idCardFaceFile</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">身份证人像面路径</span></td><td key=5></td></tr><tr key=0-3-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> idCardCountyCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">身份证国徽面Code</span></td><td key=5></td></tr><tr key=0-3-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> idCardCountyFile</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">身份证国徽面路径</span></td><td key=5></td></tr><tr key=0-3-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> phone</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">电话号码【20个数字】</span></td><td key=5></td></tr><tr key=0-3-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> birthday</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">出生年月【年月日】</span></td><td key=5></td></tr><tr key=0-3-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> homeRegionAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">家庭区AID</span></td><td key=5></td></tr><tr key=0-3-12><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> homeRegionName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">家庭区全称</span></td><td key=5></td></tr><tr key=0-3-13><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> homeAddress</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">家庭地址详情【门牌号】</span></td><td key=5></td></tr><tr key=0-3-14><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contactRegionAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">联系区AID</span></td><td key=5></td></tr><tr key=0-3-15><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contactRegionName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">联系区名称</span></td><td key=5></td></tr><tr key=0-3-16><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> contactAddress</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">联系地址详情【门牌号】</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.5 劳动者详细信息创建或修改
<a id=5.5 劳动者详细信息创建或修改> </a>
### 基本信息

**Path：** /rightsProtect/uploadLabor

**Method：** POST

**接口描述：**
<p>success：True 身份信息创建修改成功<br>
success：False 身份信息修改失败，message内容为失败原因<br>
请求参数AID必须要传&nbsp; &nbsp; 没有AID的时候置为-1&nbsp; 前端做</p>
<p><br data-tomark-pass=""><br>
<br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.5</td>
<td>Report_WA_RightsProtect_Labor_IU</td>
<td>劳动者创建</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| laborAid | text  |  否 |    |  劳动者aid【不传视为新增】 |
| name | text  |  是 |    |  劳动者姓名【最多20字】 |
| idCard | text  |  是 |    |  劳动者证件号码【最长20位】 |
| sex | text  |  否 |    |  劳动者性别【1男  0女】 |
| ethnicityName | text  |  是 |    |  劳动者民族【最长12个字】 |
| birthday | text  |  否 |    |  劳动者出生年月日 |
| phone | text  |  是 |    |  电话号码 |
| contactRegionAid | text  |  是 |    |  劳动者联系地址aid（区） |
| contactAddress | text  |  是 |    |  劳动者联系地址(具体门牌)【最长50汉字】 |
| idCardFaceCode | text  |  否 |    |  劳动者身份证头像面Code |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.6 双方基本信息_企业信息查询
<a id=5.6 双方基本信息_企业信息查询> </a>
### 基本信息

**Path：** /rightsProtect/queryCompany

**Method：** POST

**接口描述：**
<p>success:True&nbsp; &nbsp;代表查询企业API成功，接口返回company对象，如果我们系统已有处理该地区的人社局 人社局信息bureau也会返回，没有人社局信息&nbsp; 其实也代表我们无法对该用户服务..<br>
success:False 代表查询企业API失败，跳转至下一个界面企业信息补全，提示用户:(未查到此公司信息，如公司名称填写错误，请回退查询，若公司名称无误，请手动填写相关信息)</p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th>存储过程</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td>Report_WA_RightsProtect_CompanyIsCharged</td>
<td>所填写的企业是否在辖区管辖范围内</td>
</tr>
<tr>
<td>Report_WA_RightsProtect_WorkRegionIsCharged</td>
<td>工作地址是否在辖区管辖范围内</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| companyName | text  |  是 |    |  公司名称【最长50个字】 |
| whatUnit | text  |  是 |    |  【1仲裁  0监察】 |
| workRegionAid | text  |  是 |    |  工作地址AID（区） |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> creditCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信用代码【最长20字节】</span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> registCapi</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">注册资本【例10块钱 ： 10.00】</span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> belongOrg</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">监管单位【最长50个汉字】</span></td><td key=5></td></tr><tr key=0-3-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> phone</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">电话号码</span></td><td key=5></td></tr><tr key=0-3-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> registerRegionAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">注册区AID</span></td><td key=5></td></tr><tr key=0-3-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> registerRegionName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">区全称</span></td><td key=5></td></tr><tr key=0-3-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> operName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">法定代表人姓名</span></td><td key=5></td></tr><tr key=0-3-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> operJob</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">法定代表人职务</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.7 企业信息补全_企业信息上传（仅看）
<a id=5.7 企业信息补全_企业信息上传（仅看）> </a>
### 基本信息

**Path：** /............../

**Method：** POST

**接口描述：**
<p>success :True&nbsp; &nbsp; 案件创建或更新成功<br>
success: False&nbsp; 案件创建失败（可能是没有对应管的人社局）</p>
<p><strong>案件AID　没有的时候请传－１　　代表新增</strong></p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.7</td>
<td>Report_WA_RightsProtect_DisputesCreate</td>
<td>案件创建</td>
<td>(创建之前先通过区ID查到是否存在开通管理的人社局，否则直接返回False)要创建Distupe,companyInfo,laborInfo,三条数据 案件状态为10编辑中</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> disputeAid</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件ID【不传为新增】</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> isLaborSueCompany</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">【1劳动者维权   0企业维权】</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> whatUnit</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">【1仲裁  0监察】</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> laborList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> laborAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者AID</span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> typeName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">固定给“其他”</span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> workRegionAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">工作区ID</span></td><td key=5></td></tr><tr key=0-3-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> workAddress</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">工作详细地址【最长50个汉字】</span></td><td key=5></td></tr><tr key=0-3-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isProxy</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否为涉事劳动者代表</span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> companyList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-4-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司名【最长50个汉字】</span></td><td key=5></td></tr><tr key=0-4-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyCreditCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信用代码【最长20个数字】</span></td><td key=5></td></tr><tr key=0-4-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyRegisteredCapital</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">注册资本【单位元】例 10元 = 10</span></td><td key=5></td></tr><tr key=0-4-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companySupervisoryUnit</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">监管单位【最长50个汉字】</span></td><td key=5></td></tr><tr key=0-4-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyPrincipalName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">负责人姓名【20个汉字】</span></td><td key=5></td></tr><tr key=0-4-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyPrincipalSex</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">负责人性别【1男  0女】</span></td><td key=5></td></tr><tr key=0-4-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyPrincipalBirthday</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">负责人出生年月日</span></td><td key=5></td></tr><tr key=0-4-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyPrincipalCareer</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">负责人职务【最长20个汉字】</span></td><td key=5></td></tr><tr key=0-4-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyRegisterRegionAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司区AID</span></td><td key=5></td></tr><tr key=0-4-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyAddress</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司地址详细地址</span></td><td key=5></td></tr><tr key=0-4-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyPhone</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司电话【最长20个数字】</span></td><td key=5></td></tr><tr key=0-4-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isProxy</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否是主要涉事公司【1是 0否】</span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> argumentList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">纠纷列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-5-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> argumentTypeId</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">纠纷列表ID</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> disputeAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件AID</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.7 企业信息补全_企业信息上传（用）
<a id=5.7 企业信息补全_企业信息上传（用）> </a>
### 基本信息

**Path：** /rightsProtect/disputeCreate

**Method：** POST

**接口描述：**
<p>完整请求样式<br>
{<br>
"AID": 100,<br>
"IsLaborSueCompany": true,<br>
"DisputeLaborInfoJson": "{"AID":100,"IsLaborSueCompany":true,"DisputeLaborInfoJson":"","DisputeCompanyInfoJson":"","ArgumentTypeJson":""}",<br>
"DisputeCompanyInfoJson": "{"AID":100,"IsLaborSueCompany":true,"DisputeLaborInfoJson":"","DisputeCompanyInfoJson":"","ArgumentTypeJson":""}",<br>
"ArgumentTypeJson": "{"AID":100,"IsLaborSueCompany":true,"DisputeLaborInfoJson":"","DisputeCompanyInfoJson":"","ArgumentTypeJson":""}"<br>
}</p>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disAid | text  |  是 |  100  |  案件AID　 |
| whatUnit | text  |  是 |    |  【1仲裁  0监察】 |
| isLaborSueCompany | text  |  是 |  true  |   |
| disputeLaborInfoJson | text  |  是 |  {\"aid\":100,\"isLaborSueCompany\":true,\"disputelaborInfoJson\":\"\",\"disputeCompanyInfoJson\":\"\",\"argumentTypeJson\":\"\"}  |  这里传的不是JSON对象是字符串，需要进行特别处理 |
| disputeCompanyInfoJson | text  |  是 |  {\"aid\":100,\"isLaborSueCompany\":true,\"disputeLaborInfoJson\":\"\",\"DisputeCompanyInfoJson\":\"\",\"ArgumentTypeJson\":\"\"}  |   |
| argumentTypeJson | text  |  是 |  {\"aid\":100,\"IsLaborSueCompany\":true,\"DisputeLaborInfoJson\":\"\",\"DisputeCompanyInfoJson\":\"\",\"ArgumentTypeJson\":\"\"}  |  纠纷列表 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> disputeAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.8 事实和理由_信息上传（仅看）
<a id=5.8 事实和理由_信息上传（仅看）> </a>
### 基本信息

**Path：** /rightsProtect/disputeCreate_Description

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.8</td>
<td>Report_WA_RightsProtect_DisputesCreate_Description</td>
<td>案件信息补全</td>
<td>补全DIstupes和劳动者信息</td>
</tr>
</tbody>
</table>
<p>案件涉事人列表，请以一个大json字符串参数给定</p>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> disputeAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件ID</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> laborList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> aid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者AID（通讯录表AID)</span></td><td key=5></td></tr><tr key=0-1-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> career</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者职务【最长20个汉字】</span></td><td key=5></td></tr><tr key=0-1-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isHaveDeal</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否签过合同【1是 0否】</span></td><td key=5></td></tr><tr key=0-1-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isLaborDispatch</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳务派遣否【1是 0否】</span></td><td key=5></td></tr><tr key=0-1-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> entryDate</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">入职日期【年月日】</span></td><td key=5></td></tr><tr key=0-1-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dealBeginDate</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合同开始日期</span></td><td key=5></td></tr><tr key=0-1-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dealEndDate</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合同结束日期</span></td><td key=5></td></tr><tr key=0-1-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> argumentDate</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">争议日期</span></td><td key=5></td></tr><tr key=0-1-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dealWage</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">约定工资 【5500.00】 </span></td><td key=5></td></tr><tr key=0-1-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dealPolicyName</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">约定工时制度【标准   综合  不定时】</span></td><td key=5></td></tr><tr key=0-1-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> causeDescription</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">事由描述最多五百字</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.8 事实和理由_信息上传_（用）
<a id=5.8 事实和理由_信息上传_（用）> </a>
### 基本信息

**Path：** /rightsProtect/disputeCreateDescription

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.8</td>
<td>Report_WA_RightsProtect_DisputesCreate_Description</td>
<td>案件信息补全</td>
<td>补全DIstupes和劳动者信息</td>
</tr>
</tbody>
</table>
<p><img src="data:image/png;base64,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" alt="image.png"><br>
案件涉事人列表，请以一个大json字符串参数给定<br>
测试用例<br>
[{"AID":"19","Career":"项目经理","IsHaveDeal":"1","IsLaborDispatch":"0","EntryDate":"2014-05-06","DealBeginDate":"2014-04-06","DealEndDate":"2017-04-06","ArgumentDate":"2017-03-06","DealWage":"50000","DealPolicyName":"标准","CauseDescription":"老板拖欠工资"},{"AID":"20","Career":"喂猪","IsHaveDeal":"1","IsLaborDispatch":"0","EntryDate":"2014-05-07","DealBeginDate":"2014-04-07","DealEndDate":"2017-04-07","ArgumentDate":"2017-03-07","DealWage":"50000","DealPolicyName":"标准","CauseDescription":"老板跑了"},{"AID":"21","Career":"喂狗","IsHaveDeal":"1","IsLaborDispatch":"0","EntryDate":"2014-05-08","DealBeginDate":"2014-04-08","DealEndDate":"2017-04-08","ArgumentDate":"2017-03-08","DealWage":"50000","DealPolicyName":"标准","CauseDescription":"老板占便宜"}]</p>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件ID |
| laborListJson | text  |  是 |    |  劳动者列表(JSon字符串) |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.9 请求事项_信息上传（仅看）
<a id=5.9 请求事项_信息上传（仅看）> </a>
### 基本信息

**Path：** /.................

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.9</td>
<td>Report_WA_RightsProtect_DisputesCreate_RequestItems</td>
<td>补全请求事项</td>
<td>创建请求事项信息</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> disputeAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件ID</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> requestListJson</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">请求列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> description</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">请求描述【最长50个汉字】</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.9 请求事项_信息上传_（用）
<a id=5.9 请求事项_信息上传_（用）> </a>
### 基本信息

**Path：** /rightsProtect/disputeCreateRequestItems

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.9</td>
<td>Report_WA_RightsProtect_DisputesCreate_RequestItems</td>
<td>补全请求事项</td>
<td>创建请求事项信息</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件ID |
| requestListJson | text  |  是 |    |  请求列表（Json字符串） |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.10 提交相关材料_案件提交（仅看）
<a id=5.10 提交相关材料_案件提交（仅看）> </a>
### 基本信息

**Path：** /..........................

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.10</td>
<td>Report_WA_RightsProtect_DisputesCreate_OtheMaterials</td>
<td>补全案件材料</td>
<td>创建材料信息，，然后开始进行数据项存在检验（要的数据都有了），调用标量值函数分配负责人，将状态改为20待接单</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> distupeAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件AID</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> IsPlaintiffAcceptMediation</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否接受调解【1是  0否】</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> disputeMaterialList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-2-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> fileCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料路径</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.10 提交相关材料_案件提交_（用）
<a id=5.10 提交相关材料_案件提交_（用）> </a>
### 基本信息

**Path：** /rightsProtect/disputeCreateOtheMaterials

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.10</td>
<td>Report_WA_RightsProtect_DisputesCreate_OtheMaterials</td>
<td>补全案件材料</td>
<td>创建材料信息，，然后开始进行数据项存在检验（要的数据都有了），调用标量值函数分配负责人，将状态改为20待接单</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件AID |
| isPlaintiffAcceptMediation | text  |  是 |    |  是否接受调解【1是  0否】 |
| disputeMaterialListJson | text  |  是 |    |  材料列表(Json字符串) |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.11 材料模板查询
<a id=5.11 材料模板查询> </a>
### 基本信息

**Path：** /rightsProtect/queryBureauMaterial

**Method：** POST

**接口描述：**
<p>success: True 查询成功<br>
succsss: False 查询失败，请查看消息</p>
<p>FAQ：</p>
<p><br data-tomark-pass=""><br>
<br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.11</td>
<td>Report_WA_RightsProtect_Material_Q</td>
<td>查询人社局要的材料列表</td>
<td>根据人社局AID，查一个材料列表出来， 查的是报案人需要递交的材料</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| bureauAid | text  |  是 |    |  人社局AID |
| whatUnit | text  |  是 |    |  材料类别【1仲裁  0监察】 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> materialTemplateTypeList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料模板</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> aid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料模板aid</span></td><td key=5></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料名称</span></td><td key=5></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> file</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料地址</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 5.12 案件是否允许调解
<a id=5.12 案件是否允许调解> </a>
### 基本信息

**Path：** /rightsProtect/disputeCanMediate

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>5.12</td>
<td><span class="colour" style="color:rgb(85, 85, 85)">Report_WA_RightsProtect_DisputeCanMediate_Q</span></td>
<td>查询该案件是否允许调解</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |  1  |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> canMediate</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件是否允许调解</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
# 6 案件

## 6.1 处理中的案件列表
<a id=6.1 处理中的案件列表> </a>
### 基本信息

**Path：** /disputes/processingDisputelist

**Method：** POST

**接口描述：**
<p>success:True&nbsp; 接口调用成功<br>
success:False 接口调用失败，请查看Code， message</p>
<p><br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>6.1</td>
<td>Report_WA_Disputes_ProcessingDispute_Q</td>
<td>查询该登录用户提交的状态值&lt;40案件列表</td>
<td>如果该用户已经进行了实名认证，案件列表还要在加上以身份证号查询出来的案件</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| pageIndex | text  |  是 |  1  |  当前页数，用于分页 |
| pageSize | text  |  是 |  5  |  每页条数，用于分页 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成功标志</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">错误编码</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据包</span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> disputeList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> aid</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件aid</span></td><td key=5></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> IsLaborSueCompany</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件类型【1劳动者维权  0企业维权】</span></td><td key=5></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">企业名称【最长50个字】</span></td><td key=5></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> laborName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者姓名【最长20个字】</span></td><td key=5></td></tr><tr key=0-3-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> laborPhone</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者电话号码【最长20个数字】</span></td><td key=5></td></tr><tr key=0-3-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> canCancel</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否可撤销【1是 0否】</span></td><td key=5></td></tr><tr key=0-3-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr><tr key=0-3-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> stateName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态描述</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 6.2 已处理的案件列表
<a id=6.2 已处理的案件列表> </a>
### 基本信息

**Path：** /disputes/finishDisputelist

**Method：** POST

**接口描述：**
<p><span class="colour" style="color:rgb(85, 85, 85)">success:True&nbsp; 接口调用成功</span><br>
<span class="colour" style="color:rgb(85, 85, 85)">success:False 接口调用失败，请查看Code， message</span></p>
<p><br data-tomark-pass=""><br>
<span class="colour" style="color:rgb(85, 85, 85)"></span></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>6.2</td>
<td>Report_WA_Disputes_FinishDispute_Q</td>
<td>查询该登录用户提交的状态值&gt;40案件列表</td>
<td>如果该用户已经进行了实名认证，案件列表还要在加上以身份证号查询出来的案件</td>
</tr>
</tbody>
</table>
<p><span class="colour" style="color:rgb(85, 85, 85)"></span></p>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| pageIndex | text  |  是 |  ２  |  当前页数，用于分页 |
| pageSize | text  |  是 |  ５  |  每页条数，用于分页 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成功标志</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">错误编码</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据包</span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> disputeList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> aid</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件AID</span></td><td key=5></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> isLaborSueCompany</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件类型【1劳动者维权 0企业维权】</span></td><td key=5></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">企业名称【最长50汉字】</span></td><td key=5></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> laborName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者姓名【最长20汉字】</span></td><td key=5></td></tr><tr key=0-3-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> laborPhone</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者电话号码【最长20数字】</span></td><td key=5></td></tr><tr key=0-3-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr><tr key=0-3-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> stateName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态描述</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 6.3 创建中的案件列表
<a id=6.3 创建中的案件列表> </a>
### 基本信息

**Path：** /disputes/creatingDisputeList

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th>存储过程</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td><span class="colour" style="color:rgb(85, 85, 85)">Report_WA_Disputes_CreatingDispute_Q</span></td>
<td><span class="colour" style="color:rgb(85, 85, 85)">查询该登录用户提交的状态值=10的案件列表</span></td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| pageIndex | text  |  是 |  1  |  当前页数，用于分页 |
| pageSize | text  |  是 |  11  |  每页条数，用于分页 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成功标志</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">错误编码</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">数据包</span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> disputeList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> aid</span></td><td key=1><span>integer</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件aid</span></td><td key=5></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> IsLaborSueCompany</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件类型【1劳动者维权  0企业维权】</span></td><td key=5></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">企业名称【最长50个字】</span></td><td key=5></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> laborName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者姓名【最长20个字】</span></td><td key=5></td></tr><tr key=0-3-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> laborPhone</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者电话号码【最长20个数字】</span></td><td key=5></td></tr><tr key=0-3-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> createTime</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">创建时间</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 6.4 评价案件调解员
<a id=6.4 评价案件调解员> </a>
### 基本信息

**Path：** /disputes/evaluationMediator

**Method：** POST

**接口描述：**
<p>success: true 评价成功<br>
success: false 评价失败</p>
<p><br data-tomark-pass=""><br>
<br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>6.4</td>
<td>Report_WA_Disputes_EvaluationMediator_I</td>
<td>给调解员评分</td>
<td>检查案件状态是否是待评价，然后对应找到DisputeMediator的IsEndMediator为True的数据，给他添加评分，然后再修改案件状态</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件AID |
| mediatorScore | text  |  是 |    |  调解员评分 |
| mediatorDescription | text  |  是 |    |  评价描述 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">成功标志</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">错误编码</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">信息</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 6.6 撤诉
<a id=6.6 撤诉> </a>
### 基本信息

**Path：** /disputes/cancelDispute

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>6.6</td>
<td>Report_WA_Disputes_CancelDispute_U</td>
<td>案件撤诉</td>
<td>检测状态是否&lt;20 ，小于将案件状态修改为44 否则状态</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
# 7 案件详情

## 7.1 案件基本信息_查询
<a id=7.1 案件基本信息_查询> </a>
### 基本信息

**Path：** /disputeDetail/basicInfo

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>Report_WA_DisputeDetail_BasicInfo_Q</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> disputeBasic</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> isLaborSueCompany</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">【1劳动者维权   0 企业维权】</span></td><td key=5></td></tr><tr key=0-3-0-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> stateName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件状态</span></td><td key=5></td></tr><tr key=0-3-0-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司名</span></td><td key=5></td></tr><tr key=0-3-0-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyRegisterShow</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司注册区（全称）</span></td><td key=5></td></tr><tr key=0-3-0-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyRegisterAddress</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司门牌号</span></td><td key=5></td></tr><tr key=0-3-0-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyPhone</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司电话</span></td><td key=5></td></tr><tr key=0-3-0-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyPrincipalName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">法人姓名</span></td><td key=5></td></tr><tr key=0-3-0-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> laborName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者姓名</span></td><td key=5></td></tr><tr key=0-3-0-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> laborPhone</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者电话</span></td><td key=5></td></tr><tr key=0-3-0-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> argumentDate</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">争议时间</span></td><td key=5></td></tr><tr key=0-3-0-10><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> isApplyUser</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">登录用户是否是报案人</span></td><td key=5></td></tr><tr key=0-3-0-11><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> whatUnit</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">维权方式 1:仲裁--0:监察</span></td><td key=5></td></tr><tr key=0-3-0-12><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> workRegionAid</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">工作地址（区）AID</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 7.2 争议类型_查询
<a id=7.2 争议类型_查询> </a>
### 基本信息

**Path：** /disputeDetail/argumentList

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>Report_WA_DisputeDetail_ArgumentList_Q</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> argumentList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">涉及纠纷列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">纠纷描述</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 7.3 事实和理由_查询
<a id=7.3 事实和理由_查询> </a>
### 基本信息

**Path：** /disputeDetail/factAndReason

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>Report_WA_DisputeDetail_FactAndReasons_Q</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> factAndReason</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> factAndReason</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">事实和理由</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 7.4 请求事项_查询
<a id=7.4 请求事项_查询> </a>
### 基本信息

**Path：** /disputeDetail/requestList

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>Report_WA_DisputeDetail_RequestList_Q</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> argumentList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">请求事项描述</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 7.5 相关材料_查询
<a id=7.5 相关材料_查询> </a>
### 基本信息

**Path：** /disputeDetail/materialList

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>Report_WA_DisputeDetail_MaterialList_Q</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> materialList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> file</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料地址</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 7.6 调解结果_查询
<a id=7.6 调解结果_查询> </a>
### 基本信息

**Path：** /disputeDetail/mediator

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>Report_WA_DisputeDetail_ResultInfo_Q</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |   |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解员姓名</span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> phone</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解员电话</span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> stateName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解状态</span></td><td key=5></td></tr><tr key=0-3-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> resultDescription</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解结果描述</span></td><td key=5></td></tr><tr key=0-3-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> streetOfficeName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解街道办名称</span></td><td key=5></td></tr><tr key=0-3-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> streetOfficeAddress</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解街道办地址</span></td><td key=5></td></tr><tr key=0-3-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isPlaintiffAcceptMediation</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">原告是否同意调解</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 7.7 评价_查询
<a id=7.7 评价_查询> </a>
### 基本信息

**Path：** /disputeDetail/Evaluation

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>Report_WA_DisputeDetail_Evaluation_Q</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mediatorScore</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解员打分</span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mediatorDescription</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解员描述</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 7.8 调解结果材料_查询
<a id=7.8 调解结果材料_查询> </a>
### 基本信息

**Path：** /disputeDetail/mediatorMaterial

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>7.8</td>
<td>Report_WA_DisputeDetail_MediatorMaterial_Q</td>
<td>案件调解结果材料查询</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |   |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> materialList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> file</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料路径</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
# 8 案件详情修改

## 8.1 验证案件是否可以提交
<a id=8.1 验证案件是否可以提交> </a>
### 基本信息

**Path：** /disputeUpdate/canDisputeSubmit

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th>存储过程</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td><span class="colour" style="color:rgb(85, 85, 85)">Report_WA_D</span>isputeUpdate<span class="colour" style="color:rgb(85, 85, 85)">_C</span>anSubmit<span class="colour" style="color:rgb(85, 85, 85)">_Q</span></td>
<td>查询该案件是否已填写基本信息、涉及纠纷、事实和理由、请求事项</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |  1  |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> canSubmit</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件是否可以提交</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.12 提交案件
<a id=8.12 提交案件> </a>
### 基本信息

**Path：** /disputeUpdate/disputeSubmit

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th>存储过程</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td><span class="colour" style="color:rgb(85, 85, 85)">Report_WA_DisputeUpdate_D</span>ispute<span class="colour" style="color:rgb(85, 85, 85)">_Submit</span></td>
<td>提交该创建中的案件</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |  1  |  案件AID |
| isPlaintiffAcceptMediation | text  |  是 |  1  |  是否接受调解【1 同意 0拒绝】 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.2 删除案件
<a id=8.2 删除案件> </a>
### 基本信息

**Path：** /disputeUpdate/disputeDelete

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th>存储过程</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td><span class="colour" style="color:rgb(85, 85, 85)">Report_WA_DisputeUpdate_D</span>ispute<span class="colour" style="color:rgb(85, 85, 85)">_D</span></td>
<td>删除该创建中的案件</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |  1  |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.7 该案件涉及的双方信息
<a id=8.7 该案件涉及的双方信息> </a>
### 基本信息

**Path：** /disputeUpdate/basicInfoQuery

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th>存储过程</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td><span class="colour" style="color:rgb(85, 85, 85)">Report_WA_DisputeUpdate_DisputeBasicInfo_Q</span></td>
<td>该案件涉及的双方信息</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |  1  |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> laborAid</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者AID</span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> laborName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者姓名</span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> workRegionAid</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">工作区AID</span></td><td key=5></td></tr><tr key=0-3-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> workRegionNameShow</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">工作区全称</span></td><td key=5></td></tr><tr key=0-3-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> workAddress</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">工作详细地址【最长50个汉字】</span></td><td key=5></td></tr><tr key=0-3-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司名【最长50个汉字】</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.3 修改案件基本信息
<a id=8.3 修改案件基本信息> </a>
### 基本信息

**Path：** /disputeUpdate/disputeBasicInfoUpdate

**Method：** POST

**接口描述：**
<p>先验证企业信息，然后再插入数据</p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>8.3</td>
<td>Report_WA_DisputeUpdate_DisputeBasicInfo_U</td>
<td>修改案件基本信息</td>
<td>修改companyInfo,laborInfo的数据</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |  100  |  案件AID　 |
| laborAid | text  |  是 |  1  |  劳动者AID |
| workRegionAid | text  |  是 |  1  |  工作区ID |
| workAddress | text  |  是 |  书香大地  |  工作详细地址【最长50个汉字】 |
| companyName | text  |  是 |  昆明华川科技有限公司  |  公司名【最长50个汉字】 |
| whatUnit | text  |  是 |  1  |  【1仲裁  0监察】 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.8 该案件的涉及纠纷
<a id=8.8 该案件的涉及纠纷> </a>
### 基本信息

**Path：** /disputeUpdate/disputeArgumentQuery

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th>存储过程</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td><span class="colour" style="color:rgb(85, 85, 85)">Report_WA_DisputeUpdate_DisputeArgument_Q</span></td>
<td>该案件的涉及纠纷</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |  1  |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> argumentTypeList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">涉及纠纷列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> argumentId</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">涉及纠纷ID</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.4 案件信息_涉及纠纷及维权方式修改（仅看）
<a id=8.4 案件信息_涉及纠纷及维权方式修改（仅看）> </a>
### 基本信息

**Path：** /............../_1570852451759

**Method：** POST

**接口描述：**
<p>判断对应的维权方式<br>
&nbsp; &nbsp; 1. 若监察→仲裁<br>
&nbsp; &nbsp; &nbsp; &nbsp; 根据企业的信息，判断是否可以更改（企业的所属辖区），若不存在企业所属辖区，则提示“该企业暂不支持仲裁维权，若坚持申请仲裁维权，请尝试修改企业信息，或者到当地人社局进行咨询立案”<br>
&nbsp; &nbsp; 2. 若仲裁→监察<br>
&nbsp; &nbsp; &nbsp; &nbsp; 不需要判断，直接通过</p>
<table>
<thead>
<tr>
<th>存储过程</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td>Report_WA_DisputeUpdate_DisputeArgument_U</td>
<td>修改案件的涉及纠纷</td>
</tr>
<tr>
<td><span class="colour" style="color:rgb(85, 85, 85)">Report_WA_DisputeUpdate_DisputeWhatUnit_U</span></td>
<td>修改案件的维权方式</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> disputeAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件AID【不传为新增】</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> whatUnitOld</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">【1仲裁  0监察】</span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> whatUnitNew</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">【1仲裁  0监察】</span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> companyName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">企业名称</span></td><td key=5></td></tr><tr key=0-4><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> workRegionAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">工作地址（区）AID</span></td><td key=5></td></tr><tr key=0-5><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> argumentTypeJson</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">纠纷列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-5-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> argumentTypeId</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">纠纷列表ID</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.4 案件信息_涉及纠纷及维权方式修改（用）
<a id=8.4 案件信息_涉及纠纷及维权方式修改（用）> </a>
### 基本信息

**Path：** /disputeUpdate/disputeArgumentUpdate

**Method：** POST

**接口描述：**


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |  100  |  案件AID　 |
| whatUnitOld | text  |  是 |  1  |  【1仲裁  0监察】（旧） |
| whatUnitNew | text  |  是 |  1  |  【1仲裁  0监察】（新） |
| companyName | text  |  是 |  昆明华川科技有限公司  |  企业名称 |
| workRegionAid | text  |  是 |  1  |  工作地址（区）AID |
| argumentTypeJson | text  |  是 |    |  纠纷列表 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.9 该案件的事实和理由
<a id=8.9 该案件的事实和理由> </a>
### 基本信息

**Path：** /disputeUpdate/factAndReasonQuery

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th>存储过程</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td><span class="colour" style="color:rgb(85, 85, 85)">Report_WA_DisputeUpdate_FactAndReason_Q</span></td>
<td>查询该案件的事实和理由</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |  1  |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> career</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者职务【最长20个汉字】</span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isHaveDeal</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否签过合同【1是 0否】</span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isLaborDispatch</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳务派遣否【1是 0否】</span></td><td key=5></td></tr><tr key=0-3-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> entryDate</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">入职日期【年月日】</span></td><td key=5></td></tr><tr key=0-3-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dealBeginDate</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合同开始日期</span></td><td key=5></td></tr><tr key=0-3-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dealEndDate</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合同结束日期</span></td><td key=5></td></tr><tr key=0-3-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> argumentDate</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">争议日期</span></td><td key=5></td></tr><tr key=0-3-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dealWage</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">约定工资 【5500.00】 </span></td><td key=5></td></tr><tr key=0-3-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> dealPolicyName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">约定工时制度【标准   综合  不定时】</span></td><td key=5></td></tr><tr key=0-3-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> causeDescription</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">事由描述最多五百字</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.6 案件信息_事实和理由修改
<a id=8.6 案件信息_事实和理由修改> </a>
### 基本信息

**Path：** /disputeUpdate/factAndReasonUpdate

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>8.6</td>
<td>Report_WA_DisputeUpdate_FactAndReason_U</td>
<td>修改案件事实和理由</td>
</tr>
</tbody>
</table>
<pre><code data-backticks="4">
</code></pre>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |  1  |  案件ID |
| career | text  |  是 |  搬运工  |  劳动者岗位【最长20个汉字】 |
| isHaveDeal | text  |  是 |  0  |  是否签过合同【1是 0否】 |
| entryDate | text  |  是 |  2019-10-17  |  入职日期【年月日】 |
| dealBeginDate | text  |  否 |  2019-10-17  |  合同开始日期 |
| dealEndDate | text  |  否 |  2019-10-17  |  合同结束日期 |
| argumentDate | text  |  是 |  2019-10-17  |  争议日期 |
| dealWage | text  |  是 |  4500  |  约定工资 |
| dealPolicyName | text  |  否 |  不定时  |  约定工时制度【标准   综合  不定时】 |
| causeDescription | text  |  是 |  这是一条来自2019年10月17日17:28:45的测试  |  事由描述最多五百字 |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.10 该案件的请求事项
<a id=8.10 该案件的请求事项> </a>
### 基本信息

**Path：** /disputeUpdate/disputeRequest

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th>存储过程</th>
<th>描述</th>
</tr>
</thead>
<tbody>
<tr>
<td><span class="colour" style="color:rgb(85, 85, 85)">Report_WA_DisputeUpdate_DisputeRequest_Q</span></td>
<td>查询该案件的请求事项</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |  1  |  案件AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> requestList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-0-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> description</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">请求事项内容</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.11 案件信息_请求事项修改（仅看）
<a id=8.11 案件信息_请求事项修改（仅看）> </a>
### 基本信息

**Path：** /................._1571024984040

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>8.11</td>
<td>Report_WA_DisputeUpdate_DisputeRequest_U</td>
<td>案件请求事项修改</td>
</tr>
</tbody>
</table>
<p>先清空，再插入</p>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/json | 是  |   |   |
**Body**

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> disputeAid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件ID</span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> requestListJson</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">请求列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-1-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> description</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">请求描述【最长50个汉字】</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
## 8.11 案件信息_请求事项修改（用）
<a id=8.11 案件信息_请求事项修改（用）> </a>
### 基本信息

**Path：** /disputeUpdate/disputeRequestUpdate

**Method：** POST

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>8.11</td>
<td>Report_WA_DisputeUpdate_DisputeRequest_U</td>
<td>案件请求事项修改</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAid | text  |  是 |    |  案件ID |
| requestListJson | text  |  是 |    |  请求列表（Json字符串） |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>boolean</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr>
               </tbody>
              </table>
            
# 废弃

## 6.3 案件详情
<a id=6.3 案件详情> </a>
### 基本信息

**Path：** /disputes/disputesDetail

**Method：** POST

**接口描述：**
<p><span class="colour" style="color:rgb(85, 85, 85)">事实和说明要是拼接的</span><br>
<span class="colour" style="color:rgb(85, 85, 85)">我于XX年XX月XX日入职到XXX公司任XX职务，（是、否）签订过劳动合同，合同期限为XX年XX月XX日至XX年XX月XX日，约定工资为XX元/月，约定工时制度为（标准、综合、不定时）。XX年XX月XX日发生争议，具体情况如下：XXXXX（详述争议过程）.</span><br>
我于{入职时间}入职到{公司名称}任{职业}职务，{是否签订劳动合同}签订过劳动合同，合同期限为{合同开始时间}至{合同结束时间}，约定工资为{约定工资}元/月，约定工时制度为（标准、综合、不定时），{争议时间}发生争议，具体情况如下（原因描述）</p>
<p><br data-tomark-pass=""><br>
<br data-tomark-pass=""></p>
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>6.3</td>
<td>Report_WA_Disputes_DisputesDetail_Q</td>
<td>根据案件ID,查出详细的案件信息</td>
</tr>
</tbody>
</table>


### 请求参数
**Headers**

| 参数名称  | 参数值  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| Content-Type  |  application/x-www-form-urlencoded | 是  |   |   |
**Body**

| 参数名称  | 参数类型  |  是否必须 | 示例  | 备注  |
| ------------ | ------------ | ------------ | ------------ | ------------ |
| disputeAID | text  |  是 |  1564156  |  案件的AID |



### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody"><tr key=0-0><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> success</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-1><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> code</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-2><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> message</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3><td key=0><span style="padding-left: 0px"><span style="color: #8c8a8a"></span> data</span></td><td key=1><span>object</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap"></span></td><td key=5></td></tr><tr key=0-3-0><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> disputeAID</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件AID</span></td><td key=5></td></tr><tr key=0-3-1><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> isLaborSueCompany</span></td><td key=1><span>number</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">案件类型【1劳动者维权  0企业维权】</span></td><td key=5></td></tr><tr key=0-3-2><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> causeDescription</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">原因描述【最长500字】</span></td><td key=5></td></tr><tr key=0-3-3><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> WhatUnit</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">执法部门【1仲裁 0监察】</span></td><td key=5></td></tr><tr key=0-3-4><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> stateName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态描述</span></td><td key=5></td></tr><tr key=0-3-5><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> stateID</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">状态ID</span></td><td key=5></td></tr><tr key=0-3-6><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> laborList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-6-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> laborAID</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者AID</span></td><td key=5></td></tr><tr key=0-3-6-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">劳动者姓名</span></td><td key=5></td></tr><tr key=0-3-6-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> phone</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">电话号码</span></td><td key=5></td></tr><tr key=0-3-6-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> isHaveDeal</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否签订劳动合同【1是 0否】</span></td><td key=5></td></tr><tr key=0-3-6-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> entryDate</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">入职日期【年月日】</span></td><td key=5></td></tr><tr key=0-3-6-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> dealBeginDate</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合同开始日期</span></td><td key=5></td></tr><tr key=0-3-6-6><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> dealEndDate</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">合同结束日期</span></td><td key=5></td></tr><tr key=0-3-6-7><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> dealWage</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">约定工资【例100.00】</span></td><td key=5></td></tr><tr key=0-3-6-8><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> dealPolicyName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">约定工作制度【标准、综合、不定时】</span></td><td key=5></td></tr><tr key=0-3-6-9><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> argumentDate</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">争议日期【年月日】</span></td><td key=5></td></tr><tr key=0-3-7><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> companyList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-7-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司名【最长50个汉字】</span></td><td key=5></td></tr><tr key=0-3-7-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> companyAddressShow</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">注册地址全称【冗余】【最长50个汉字】</span></td><td key=5></td></tr><tr key=0-3-7-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> phone</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">公司电话【最长20个数字】</span></td><td key=5></td></tr><tr key=0-3-7-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> principalName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">负责人姓名【最长20个汉字】</span></td><td key=5></td></tr><tr key=0-3-8><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> argumentTypeList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">争议类型【多个】</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-8-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> argumentName</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">争议类型描述【最长200字】</span></td><td key=5></td></tr><tr key=0-3-9><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> requestList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">请求【多个】</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-9-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> description</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">请求描述【最多50个字】</span></td><td key=5></td></tr><tr key=0-3-10><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> materialList</span></td><td key=1><span>object []</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料列表</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-10-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> file</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料地址</span></td><td key=5></td></tr><tr key=0-3-10-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> aid</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">材料AID</span></td><td key=5></td></tr><tr key=0-3-11><td key=0><span style="padding-left: 20px"><span style="color: #8c8a8a">├─</span> mediator</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解相关信息</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-11-0><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> name</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解员姓名</span></td><td key=5></td></tr><tr key=0-3-11-1><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> phone</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解员电话</span></td><td key=5></td></tr><tr key=0-3-11-2><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> canEvaluation</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否可以评价【1 是  0 否】</span></td><td key=5></td></tr><tr key=0-3-11-3><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> canWatchEvaluation</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">是否可以查看评价【1 是 0否】</span></td><td key=5></td></tr><tr key=0-3-11-4><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> result</span></td><td key=1><span>string</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解结果描述</span></td><td key=5></td></tr><tr key=0-3-11-5><td key=0><span style="padding-left: 40px"><span style="color: #8c8a8a">├─</span> resultPhotoList</span></td><td key=1><span>object []</span></td><td key=2>非必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">调解结果图片</span></td><td key=5><p key=3><span style="font-weight: '700'">item 类型: </span><span>object</span></p></td></tr><tr key=0-3-11-5-0><td key=0><span style="padding-left: 60px"><span style="color: #8c8a8a">├─</span> fileCode</span></td><td key=1><span>string</span></td><td key=2>必须</td><td key=3></td><td key=4><span style="white-space: pre-wrap">图片地址</span></td><td key=5></td></tr>
               </tbody>
              </table>
            
