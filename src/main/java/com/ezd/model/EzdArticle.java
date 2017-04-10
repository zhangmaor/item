package com.ezd.model;

import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 * 文章信息表
 */
public class EzdArticle {
    private int articleId;
    private String articleLogo;//文章封面
    private EzdArtittype articleType;//文章类型 references ezd_artitype(artitype_id)
    private String articleMtitle;//主标题
    private String articleStitle;//副标题
    private String articleAuthor;//作者
    private String articleAuemail;//作者邮箱
    private String articlePic;//文章分享图
    private String articleContent;//文章内容
    private String articleKeywords;//文章关键字
    private int articleStatus;//文章状态
    private List<EzdReadarti> ezdReadartis;//阅读本文章的信息
    private List<EzdSayart> ezdSayarts;//对本文的评论
    private List<EzdPoint> ezdPoints;//对本文的点赞

    public List<EzdReadarti> getEzdReadartis() {
        return ezdReadartis;
    }

    public void setEzdReadartis(List<EzdReadarti> ezdReadartis) {
        this.ezdReadartis = ezdReadartis;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleLogo() {
        return articleLogo;
    }

    public void setArticleLogo(String articleLogo) {
        this.articleLogo = articleLogo;
    }

    public EzdArtittype getArticleType() {
        return articleType;
    }

    public void setArticleType(EzdArtittype articleType) {
        this.articleType = articleType;
    }

    public String getArticleMtitle() {
        return articleMtitle;
    }

    public void setArticleMtitle(String articleMtitle) {
        this.articleMtitle = articleMtitle;
    }

    public String getArticleStitle() {
        return articleStitle;
    }

    public void setArticleStitle(String articleStitle) {
        this.articleStitle = articleStitle;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public String getArticleAuemail() {
        return articleAuemail;
    }

    public void setArticleAuemail(String articleAuemail) {
        this.articleAuemail = articleAuemail;
    }

    public String getArticlePic() {
        return articlePic;
    }

    public void setArticlePic(String articlePic) {
        this.articlePic = articlePic;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleKeywords() {
        return articleKeywords;
    }

    public void setArticleKeywords(String articleKeywords) {
        this.articleKeywords = articleKeywords;
    }

    public int getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(int articleStatus) {
        this.articleStatus = articleStatus;
    }

    @Override
    public String toString() {
        return "EzdArticle{" +
                "articleId=" + articleId +
                ", articleLogo='" + articleLogo + '\'' +
                ", articleType=" + articleType +
                ", articleMtitle='" + articleMtitle + '\'' +
                ", articleStitle='" + articleStitle + '\'' +
                ", articleAuthor='" + articleAuthor + '\'' +
                ", articleAuemail='" + articleAuemail + '\'' +
                ", articlePic='" + articlePic + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleKeywords='" + articleKeywords + '\'' +
                ", articleStatus=" + articleStatus +
                ", ezdReadartis=" + ezdReadartis +
                ", ezdSayarts=" + ezdSayarts +
                ", ezdPoints=" + ezdPoints +
                '}';
    }

    public List<EzdSayart> getEzdSayarts() {
        return ezdSayarts;
    }

    public void setEzdSayarts(List<EzdSayart> ezdSayarts) {
        this.ezdSayarts = ezdSayarts;
    }

    public List<EzdPoint> getEzdPoints() {
        return ezdPoints;
    }

    public void setEzdPoints(List<EzdPoint> ezdPoints) {
        this.ezdPoints = ezdPoints;
    }
}
