package com.example.a11355;


/**
 * 常量
 */
public interface Constant {

    interface URL {
        String BaseUrl = "http://119.29.130.113:8011/Index.asmx/";
        String BaseImg = "http://119.29.130.113:8011";
        //本地服务器地址
//        String BaseUrl = "http://192.168.1.230:6579/Index.asmx/";
//        String BaseImg ="http://192.168.1.230:6579";

        //String DefaultHeadImg = "res:///" + R.drawable.ic_launcher;


    }

    interface Strings {
        //手机号正则
        String RegexMobile = "^1(3[0-9]|4[5,7]|5[0-9]|7[0-9]|8[0-9])\\d{8}$";
        //邮箱正则
        String RegexEmail = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
        //身份证正则
        String RegexIdNum = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}(([0-9]|X)|x)$";


        //权限提醒
        String PermissionFileTips = "本应用保存数据时被系统拒绝，请手动授权。\n" +
                "授权方式：点击设置按钮进入应用设置页面，选择权限(或权限管理)->存储空间\n请选择允许";
        //权限提醒
        String PermissionCameraTips = "本应用未获取到拍照权限，请手动授权。\n" +
                "授权方式：点击设置按钮进入应用设置页面，选择权限(或权限管理)->相机\n请选择允许";

        String[] mainRVTexts = {"PopupWindow","Dialog"};


    }


    interface Integers {
        //操作成功
        int SUC = 200;
        //操作失败
        int FAIL = 300;
        //数据为空
        int NULL = 400;
        //数据异常
        int ABNORMAL = 500;

        //短信验证码重试秒数
        int CodeRetryTime = 120;
        //用户编号基底
        long BaseUserCode = 10000000;
        //中奖号码基底
        long BaseLuckyCode = 10000001;
        //验证码失效时间 --130秒
        long CodeInvalidTime = 130 * 1000;
        //加入购物车动画时长
        long CartAnimDuration = 1500;
        //输入框较长的长度限制
        int EditLengthLong = 140;
        //输入框一般的长度限制
        int EditLengthMiddle = 60;
        //输入框较短的长度限制
        int EditLengthShort = 20;
        //区代


    }

    interface ID {
        String QQ_APP_ID = "1105927296";
        String WeChat_APP_ID = "wxf575fa0e9bc46293";
        String WeChat_APP_Secret = "9ee29b20c9fb83176e5d96f70bffb12b";
        String WeChat_State = "wechat_sdk_crowd";
    }

    interface Code {
        //打开相册请求码
        int AlbumCode = 0x0001;
        //拍照请求码
        int CameraCode = 0x0002;
        //修改昵称请求码
        int UpdateAliasCode = 0x0003;
        //修改出生年月请求码
        int UpdateBirthdayCode = 0x0004;
        //修改现居地请求码
        int UpdateBirthplaceCode = 0x0005;
        //修改手机请求码
        int UpdateMobileCode = 0x0006;
        //修改邮箱请求码
        int UpdateEmailCode = 0x0007;
        //修改详细地址请求码
        int UpdateAddressCode = 0x0008;
        //添加银行卡请求码
        int AddCardCode = 0x0009;
        //回购密码
        int WithdrawPwdCode = 0x000A;
        //打款申请
        int BusinessCode = 0x000B;
        //上传门面照片
        int UploadStoreCode = 0x000C;
        //上传营业执照
        int UploadAuthCode = 0x000D;
        //上传身份证正反面
        int UploadIdCode = 0x000E;
        //上传业务员合照
        int UploadClerkCode = 0x000F;
        //上传税务证
        int UploadTaxCode = 0x0010;
        //上传承诺书
        int UploadLetterCode = 0x0011;

        int PermissionCode = 0x1001;
        int PermissionCameraCode = 0x1003;

        int UpdateNickNameAndSexCode = 0x0012;

        //登录跳转注册请求码
        int RegisterCode = 0x2001;
        //进入登录页请求码
        int IntoLoginCode = 0x2002;
        //进入认证
        int IntoCertifyCode = 0x2003;
        //进入添加页面
        int IntoAddCode = 0x2004;
        //进入入住商户页请求码
        int IntoStoreApplyCode = 0x2003;
        //进入中奖记录详情页请求码
        int IntoAwardDetailCode = 0x2004;
        //申请发货请求码
        int IntoDeliverCode = 0x2005;
        //申请发货 点击地址请求码
        int ApplyAddressCode = 0x2006;
        //进入晒单 请求码
        int IntoAwardShareCode = 0x2007;

        int EditCode = 0x3001;

        //添加地址请求码
        int AddAddressCode = 0x1001;
        //二维码
        int REQUEST_CODE = 0x4001;
        //绑定手机号
        int REQUEST_CODE_UPdata_MOBILE = 0x4003;
        int REQUEST_CODE_Mobile = 0x4002;

        //修改营业时间
        int UpdataBusinessHours = 0x5010;
        //修改店铺简介请求码
        int UpdateStoreIntroduceCode = 0x5000;
    }

    interface IdString {
        String WeChat_APP_ID = "wxf575fa0e9bc46293";
        String WeChat_APP_Secret = "9ee29b20c9fb83176e5d96f70bffb12b";
        String WeChat_State = "wechat_sdk_qd";

        String AliPayCompany = "深圳市百信信息科技有限公司";
        String AliPay_APP_ID = "2017072007826996";
        String AliPayPARTNER = "2088722477273283";//支付宝 商户PID
        String AliPaySELLER = "3023357723@qq.com";//支付宝 商户收款账号

    }
}