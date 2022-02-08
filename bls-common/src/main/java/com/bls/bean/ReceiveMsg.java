package com.bls.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: bailesi
 * @description: 接收参数
 * @author: Mr.Yuan
 * @create: 2022-01-24 00:25
 **/
public class ReceiveMsg implements Serializable {

    private static final long serialVersionUID = -2890359325875015308L;

    private String from; //从哪里来的消息 谁发的就是谁的id
    private String[] to; //要发送到哪里
    private String subject; //标题
    private String content; //内容 （base64）
    private int type; //消息类型 1 2 3 4
    private String pcount; //传递netty的key  在消息列表中表示用户id
    private String key;
    private int tryCount; //重试次数 1 -> 10秒后重试第一次 2 第一次之后20秒重试第二次
    private String[] cc; //将消息拷贝给谁 和to一样
    private int contentType; //消息类型
    private String charset; //编码集
    private int level; //级别 默认0
    private String[] tags; // 标签
    private List<Object> attachments; //附件
    private String references; //关联主题ID
    private String inReplyTo; //回复消息的ID
    private String subjectId; //主题id
    private Date creatTime; //创建时间
    private String oddNumbers; //询价单号
    private Date lastUpdTime; //最后更新时间
    private int start; // 消息发送状态

}
