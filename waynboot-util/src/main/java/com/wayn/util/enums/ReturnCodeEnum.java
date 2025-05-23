package com.wayn.util.enums;

import lombok.Getter;

/**
 * 错误状态码enum
 */
@Getter
public enum ReturnCodeEnum {

    // 200，通用操作成功 3xx，资源重定向 4xx，客户端错误 500，通用操作失败
    SUCCESS(200, "操作成功"),
    UNAUTHORIZED(401, "没有权限，请联系管理员授权"),
    FORBIDDEN(403, "认证失败，请联系管理员授权"),
    NOT_FOUND(404, "路径不存在，请检查路径是否正确"),
    ERROR(500, "操作失败"),

    /**
     * 4xxx，参数类型错误
     */
    PARAMETER_MISS_ERROR(4001, "参数缺失"),
    PARAMETER_TYPE_ERROR(4002, "参数类型错误"),
    PARAMETER_ERROR(4003, "参数错误"),

    /**
     * 50xx，订单错误
     * 51xx，用户错误
     * 52xx，上传错误
     * 53xx，商品错误
     * 54xx，部门错误
     * 55xx，菜单错误
     * 56xx，工具错误
     * ...
     */
    CUSTOM_ERROR(5000, ""),
    ORDER_SUBMIT_ERROR(5001, "下单失败"),
    ORDER_NOT_EXISTS_ERROR(5002, "订单不存在"),
    ORDER_CANNOT_REFUND_ERROR(5003, "订单不能退款"),
    ORDER_CANNOT_CONFIRM_ERROR(5004, "订单不能确认收货"),
    ORDER_CANNOT_SHIP_ERROR(5005, "订单不能确认发货"),
    ORDER_CANNOT_PAY_ERROR(5006, "订单不能支付"),
    ORDER_CANNOT_CANCAL_ERROR(5007, "订单不能取消"),
    ORDER_CANNOT_DELETE_ERROR(5008, "订单不能删除"),
    ORDER_SET_PAY_ERROR(5009, "订单设置支付类型失败"),
    ORDER_NOT_SUPPORT_PAYWAY_ERROR(5010, "不支持的支付类型"),
    ORDER_HAS_CREATED_ERROR(5011, "订单已经创建过了 "),
    ORDER_USER_NOT_SAME_ERROR(5012, "订单用户和当前登陆用户不一致"),
    ORDER_ERROR_CART_EMPTY_ERROR(5013, "下单失败，当前购物车无数据"),
    ORDER_ERROR_ADDRESS_ERROR(50143, "下单失败，当前地址错误"),
    ORDER_REFUND_ERROR(50144, "退款失败"),
    ORDER_ERROR_STOCK_NOT_ENOUGH(50145, "%s,%s 库存不足，请重新选择商品"),
    ORDER_NOT_FOUND(50146, "订单未找到"),
    ORDER_REFUND_MONEY_LARGE(50147, "退款金额超过订单金额"),
    WX_ERROR(50148, "微信错误"),

    // 用户错误
    USER_NOT_EXISTS_ERROR(5101, "用户不存在"),
    USER_TWO_PASSWORD_NOT_SAME_ERROR(5102, "两次密码输入不相符"),
    USER_EMAIL_CODE_ERROR(5102, "邮箱验证码不正确"),
    USER_PHONE_HAS_REGISTER_ERROR(5102, "手机号已注册，请更换手机号"),
    USER_ACCOUNT_PASSWORD_ERROR(5102, "用户账号或密码错误"),
    USER_VERIFY_CODE_ERROR(5103, "验证码不正确"),
    USER_OLD_PASSWORD_ERROR(5104, "旧密码错误"),
    USER_NEW_OLD_PASSWORD_NOT_SAME_ERROR(5105, "新密码不能与旧密码相同"),
    USER_CAPTCHA_CODE_ERROR(5106, "图形验证码不正确"),
    USER_REGISTER_MOBILE_ERROR(5107, "注册手机号错误"),
    OLD_PASSWORD_NOT_EQUALS_ERROR(5108, "旧密码错误"),
    MOBILE_ERROR(5107, "手机号错误"),
    MOBILE_YZM_SEND_ERROR(5109, "短信验证码发送失败" ),
    YZM_ENTER_ERROR(5110, "验证码输入错误" ),
    YZM_ENTER_BUSY_ERROR(5110, "验证码输入频繁，请稍等" ),

    // 上传错误
    UPLOAD_ERROR(5201, "上传图片失败"),

    // 商品错误
    GOODS_SPEC_ONLY_START_ONE_DEFAULT_SELECTED_ERROR(5301, "商品规格只能选择一个启用默认选中"),
    GOODS_HAS_OFFSHELF_ERROR(5302, "商品已经下架"),
    GOODS_STOCK_NOT_ENOUGH_ERROR(5303, "商品库存不足"),

    // 部门错误
    DEPT_HAS_SUB_DEPT_ERROR(5401, "存在下级部门,不允许删除"),
    DEPT_HAS_USER_ERROR(5402, "部门存在用户,不允许删除"),

    // 菜单错误
    MENU_HAS_SUB_MENU_ERROR(5501, "存在子菜单,不允许删除"),
    MENU_HAS_DISTRIBUTE_ERROR(5502, "菜单已分配,不允许删除"),

    // 工具错误
    TOOL_EMAIL_ERROR(5601, "邮件信息未配置完全，请先填写配置信息"),
    TOOL_QINIU_NOT_EXISTS_ERROR(5602, "七牛云配置不存在"),
    TOOL_QINIU_CONFIG_ERROR(5603, "七牛云配置错误"),


    REDIS_CONNECTION_TIMEOUT_ERROR(5701, "redis连接超时"),
    ES_CONNECTION_TIMEOUT_ERROR(5702, "es连接超时");
    private final int code;
    private String msg;

    ReturnCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ReturnCodeEnum setMsg(String msg) {
        this.msg = msg;
        return this;
    }


}
