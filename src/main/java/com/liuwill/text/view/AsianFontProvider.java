package com.liuwill.text.view;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;

/**
 * Created by Administrator on 2016/8/18 0018.
 */
public class AsianFontProvider extends XMLWorkerFontProvider {

    public Font getFont(final String fontname, final String encoding,
                        final boolean embedded, final float size, final int style,
                        final BaseColor color) {
        final String FONT = "resources/fonts/NotoSansCJKsc-Regular.otf";
        BaseFont bf = null;
       // Font font = null;
        try {
            bf = BaseFont.createFont("STSong-Light","Adobe-GB1-5" , BaseFont.NOT_EMBEDDED);  //"UniGB-UCS2-H"
           // font  = FontFactory.getFont(FONT, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            //bf = BaseFont.createFont("font/msyh.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Font font = new Font(bf, size, style, color);
        font.setColor(color);
        return font;
    }
}