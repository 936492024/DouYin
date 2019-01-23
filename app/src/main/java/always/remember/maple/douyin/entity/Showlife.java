package always.remember.maple.douyin.entity;

import java.io.Serializable;
import java.util.List;

public class Showlife implements Serializable {

    /**
     * id : 1123
     * uid : 1
     * content : 大自然鬼斧神工，同一个地球，同一颗太阳，差别怎么这么太呢？。那边雾霾预警，这边空气清新，那边阴雨沥沥，这边阳光明媚。<br>伟大的"大陆小三亚"——攀枝花米易助老之家康养基地，偶来了！<br>
     * create_time : 2018-03-12 17:40
     * comment_count : 4
     * status : 1
     * type : feed图片    video视频
     * video: heep://-------
     * image : http://tp.zlzjcyw.com/social/Public/upload/20180312/20180312053943343.jpg
     * image2 : http://tp.zlzjcyw.com/social/Public/upload/20180312/20180312053943343.jpg
     * image3 : http://tp.zlzjcyw.com/social/Public/upload/20180312/20180312053943343.jpg
     * image4 : http://tp.zlzjcyw.com/social/Public/upload/20180312/20180312053943343.jpg
     * image5 : http://tp.zlzjcyw.com/social/Public/upload/20180312/20180312053943343.jpg
     * image6 : http://tp.zlzjcyw.com/social/Public/upload/20180312/20180312053943343.jpg
     * image7 : http://tp.zlzjcyw.com/social/Public/upload/20180312/20180312053943343.jpg
     * image8 : http://tp.zlzjcyw.com/social/Public/upload/20180312/20180312053943343.jpg
     * image9 : http://tp.zlzjcyw.com/social/Public/upload/20180312/20180312053943343.jpg
     * rows ：[,]
     * support_down : 0
     * nickname : 张贵君（北京办）
     * portrait : http://tp.zlzjcyw.com/social/Public/portrait/1/20180204055029603.jpg
     * is_praise : false
     * comments : [{"id":"7","uid":"4","weibo_id":"1123","content":"code","create_time":"1521116503","status":"1","to_comment_id":"0","support_down":"0","toUid":"0","is_comment":0,"nickname":"v1i555"},
     * {"id":"8","uid":"6669","weibo_id":"1123","content":"你说的好","create_time":"1521116710","status":"1","to_comment_id":"7","support_down":"0","toUid":"4","is_comment":1,"nickname":"用户xfh6669","to_nickname":"v1i555"},
     * {"id":"9","uid":"6671","weibo_id":"1123","content":"你说的对DAU银灰色部分萨与复古一份改变","create_time":"1521117710","status":"1","to_comment_id":"8","support_down":"0","toUid":"6669","is_comment":1,"nickname":"用户xfh6671","to_nickname":"用户xfh6669"},
     * {"id":"10","uid":"6671","weibo_id":"1123","content":"研发部因素的发布一份不用说的鬼地方预估一个地方","create_time":"1521118710","status":"1","to_comment_id":"0","support_down":"0","toUid":"0","is_comment":0,"nickname":"用户xfh6671"}]
     * label_id : 11
     */

    private String id;
    private String uid;
    private String content;
    private String create_time;
    private String comment_count;
    private String status;
    private String type;
    private String image;
    private String image2;
    private String image3;
    private String image4;
    private String image5;
    private String image6;
    private String image7;
    private String image8;
    private String image9;
    private List<String> rows;
    private String video;
    private String support_down;
    private String nickname;
    private String portrait;
    private boolean is_praise;
    private int is_top;// 1 置顶（请求下一页时忽略这position数据） 0普通说说
    private List<CommentsBean> comments;
    private boolean isExpand;//是否具有说说内容折叠
    private boolean isBigSize;//是否字体变大
    private boolean isCommentExpand;//是否具有评论折叠
    private String label_id;//标签id

    public String getLabel_id() {
        return label_id;
    }

    public void setLabel_id(String label_id) {
        this.label_id = label_id;
    }

    public boolean isCommentExpand() {
        return isCommentExpand;
    }

    public void setCommentExpand(boolean commentExpand) {
        isCommentExpand = commentExpand;
    }

    public boolean isBigSize() {
        return isBigSize;
    }

    public void setBigSize(boolean bigSize) {
        isBigSize = bigSize;
    }

    public int getIs_top() {
        return is_top;
    }

    public void setIs_top(int is_top) {
        this.is_top = is_top;
    }

    public List<String> getRows() {
        return rows;
    }

    public void setRows(List<String> rows) {
        this.rows = rows;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    public String getImage5() {
        return image5;
    }

    public void setImage5(String image5) {
        this.image5 = image5;
    }

    public String getImage6() {
        return image6;
    }

    public void setImage6(String image6) {
        this.image6 = image6;
    }

    public String getImage7() {
        return image7;
    }

    public void setImage7(String image7) {
        this.image7 = image7;
    }

    public String getImage8() {
        return image8;
    }

    public void setImage8(String image8) {
        this.image8 = image8;
    }

    public String getImage9() {
        return image9;
    }

    public void setImage9(String image9) {
        this.image9 = image9;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isExpand() {
        return isExpand;
    }

    public void setExpand(boolean expand) {
        isExpand = expand;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getComment_count() {
        return comment_count;
    }

    public void setComment_count(String comment_count) {
        this.comment_count = comment_count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSupport_down() {
        return support_down;
    }

    public void setSupport_down(String support_down) {
        this.support_down = support_down;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public boolean isIs_praise() {
        return is_praise;
    }

    public void setIs_praise(boolean is_praise) {
        this.is_praise = is_praise;
    }

    public List<CommentsBean> getComments() {
        return comments;
    }

    public void setComments(List<CommentsBean> comments) {
        this.comments = comments;
    }

    public boolean hasComment(){
        if(comments!=null && comments.size()>0){
            return true;
        }
        return false;
    }

    public static class CommentsBean implements Serializable {

        /**
         * id : 2182
         * uid : 102
         * weibo_id : 1401
         * content : 哈哈
         * create_time : 2018-04-16 10:17:59
         * status : 1
         * to_comment_id : 0
         * support_down : 0
         * toUid : 0
         * nickname : 助老之家互助平台小助
         * portrait : http://wx.qlogo.cn/mmopen/vi_32/OrtUFkIbK66zryZWFXuxo3TR5rBKxyRVROPq9p6q9THbFoobZaU2NQ9EXwEhibUu1vicdqAId6ib3wVw4dIvwh0Sw/132
         * comments : [{"id":"2183","uid":"7376","weibo_id":"1401","content":"你明明嘻嘻嘻无所谓你明明","create_time":"1523845093","status":"1","to_comment_id":"2182","support_down":"0","toUid":"102","nickname":"徐晃之巨龙撞击","portrait":"http://p5kgkqzx0.bkt.clouddn.com/20180412/7376_1523518219.JPEG","ToNickname":"助老之家互助平台小助","ToPortrait":"http://wx.qlogo.cn/mmopen/vi_32/OrtUFkIbK66zryZWFXuxo3TR5rBKxyRVROPq9p6q9THbFoobZaU2NQ9EXwEhibUu1vicdqAId6ib3wVw4dIvwh0Sw/132"}]
         */

        private String id;
        private String uid;
        private String weibo_id;
        private String content;
        private String create_time;
        private String status;
        private String to_comment_id;
        private String support_down;
        private String toUid;
        private String nickname;
        private String portrait;
        private List<InerCommentsBean> comments;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getWeibo_id() {
            return weibo_id;
        }

        public void setWeibo_id(String weibo_id) {
            this.weibo_id = weibo_id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTo_comment_id() {
            return to_comment_id;
        }

        public void setTo_comment_id(String to_comment_id) {
            this.to_comment_id = to_comment_id;
        }

        public String getSupport_down() {
            return support_down;
        }

        public void setSupport_down(String support_down) {
            this.support_down = support_down;
        }

        public String getToUid() {
            return toUid;
        }

        public void setToUid(String toUid) {
            this.toUid = toUid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getPortrait() {
            return portrait;
        }

        public void setPortrait(String portrait) {
            this.portrait = portrait;
        }

        public List<InerCommentsBean> getComments() {
            return comments;
        }

        public void setComments(List<InerCommentsBean> comments) {
            this.comments = comments;
        }

        public boolean hasItemComment(){
            if(comments != null && comments.size()>0){
                return true;
            }
            return false;
        }

        public static class InerCommentsBean implements Serializable{
            /**
             * id : 2183
             * uid : 7376
             * weibo_id : 1401
             * content : 你明明嘻嘻嘻无所谓你明明
             * create_time : 1523845093
             * status : 1
             * to_comment_id : 2182
             * support_down : 0
             * toUid : 102
             * nickname : 徐晃之巨龙撞击
             * portrait : http://p5kgkqzx0.bkt.clouddn.com/20180412/7376_1523518219.JPEG
             * ToNickname : 助老之家互助平台小助
             * ToPortrait : http://wx.qlogo.cn/mmopen/vi_32/OrtUFkIbK66zryZWFXuxo3TR5rBKxyRVROPq9p6q9THbFoobZaU2NQ9EXwEhibUu1vicdqAId6ib3wVw4dIvwh0Sw/132
             */

            private String id;
            private String uid;
            private String weibo_id;
            private String content;
            private String create_time;
            private String status;
            private String to_comment_id;
            private String support_down;
            private String toUid;
            private String nickname;
            private String portrait;
            private String ToNickname;
            private String ToPortrait;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getWeibo_id() {
                return weibo_id;
            }

            public void setWeibo_id(String weibo_id) {
                this.weibo_id = weibo_id;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getTo_comment_id() {
                return to_comment_id;
            }

            public void setTo_comment_id(String to_comment_id) {
                this.to_comment_id = to_comment_id;
            }

            public String getSupport_down() {
                return support_down;
            }

            public void setSupport_down(String support_down) {
                this.support_down = support_down;
            }

            public String getToUid() {
                return toUid;
            }

            public void setToUid(String toUid) {
                this.toUid = toUid;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPortrait() {
                return portrait;
            }

            public void setPortrait(String portrait) {
                this.portrait = portrait;
            }

            public String getToNickname() {
                return ToNickname;
            }

            public void setToNickname(String ToNickname) {
                this.ToNickname = ToNickname;
            }

            public String getToPortrait() {
                return ToPortrait;
            }

            public void setToPortrait(String ToPortrait) {
                this.ToPortrait = ToPortrait;
            }
        }
    }
}
