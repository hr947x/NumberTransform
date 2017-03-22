package hr947x.numbertransform;

public class Rmb {
    String a[] = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
    String c[] = { "", "亿", "千", "百", "拾", "万", "千", "百", "拾", "亿", "千", "百",
            "拾", "万", "千", "百", "拾", "元" };
    String d[] = { "", "角", "分", "厘", "" };
    String rmb, rmbstrtemp, rmbint, rmbdec;

    void setrmb(String rmbstr) {
        rmbstrtemp = rmbstr;
    }

    String getrmb() {
        StringBuffer rmbstrResult = new StringBuffer();
        StringBuffer rmbstrall = new StringBuffer();
        if ((rmbstrtemp.indexOf(".") > 0)
                && (rmbstrtemp.length() - rmbstrtemp.indexOf(".") > 3)) {
            rmbstrtemp = rmbstrtemp.substring(0, rmbstrtemp.length()
                    - ((rmbstrtemp.length() - rmbstrtemp.indexOf(".")) - 3));
        }
        rmbstrall.append(rmbstrtemp);
        if (rmbstrtemp.indexOf(".") < 0) {
            rmbstrall.append(".00");
        }
        if ((rmbstrtemp.length() - rmbstrtemp.indexOf(".")) == 1) {
            rmbstrall.append("00");
        }
        rmb = rmbstrall.toString();
        rmbint = rmb.substring(0, rmb.indexOf("."));
        rmbdec = rmb.substring(rmb.indexOf(".") + 1, rmb.length());
        String rmbchar;
        int rmbcom, rmbdic;
        rmbcom = c.length - (rmbint.length());
        for (int i = 0; i < rmbint.length(); i++) {
            rmbchar = rmbint.substring(i, i + 1);
            rmbdic = Integer.parseInt(rmbchar);
            rmbstrResult.append(a[rmbdic]);
            rmbstrResult.append(c[rmbcom]);
            rmbcom++;
        }
        for (int i = 0; i < rmbdec.length(); i++) {
            rmbchar = rmbdec.substring(i, i + 1);
            rmbdic = Integer.parseInt(rmbchar);
            rmbstrResult.append(a[rmbdic]);
            rmbstrResult.append(d[i + 1]);
        }
        return rmbstrResult.toString();
    }
}