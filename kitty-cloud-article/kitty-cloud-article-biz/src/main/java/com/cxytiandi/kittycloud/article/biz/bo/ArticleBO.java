package com.cxytiandi.kittycloud.article.biz.bo;

import com.cxytiandi.kittycloud.article.biz.enums.ArticleStatusEnum;
import com.cxytiandi.kittycloud.article.biz.enums.ArticleTypeEnum;
import lombok.Data;

/**
 * 文章BO
 *
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2020-02-12 20:01:04
 */
@Data
public class ArticleBO {

    /**
     * 文章ID
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 类型
     */
    private ArticleTypeEnum type;

    /**
     * 访问次数
     */
    private Long visitCount;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 标签（多个英文逗号分隔）
     */
    private String tags;

    /**
     * 内容（包含HTML）
     */
    private String content;

    /**
     * 文本内容
     */
    private String textContent;

    /**
     * 文章状态
     */
    private ArticleStatusEnum status;

    /**
     * 热度值（点赞数+评论数+访问数）
     */
    private Integer heat;
}