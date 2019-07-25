package com.jy.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.alibaba.fastjson.JSONObject;
import com.jy.entity.Goods;
import com.jy.service.IGoodsService;
import com.jy.utils.ExcelUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @description: excel导入导出controller
 * @author: huyu
 * @create: 2019-07-25 16:37
 */
@Controller
@RequestMapping("/excel")
public class ExcelImpOrExpController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IGoodsService goodsService;

    @RequestMapping("/export")
    public void goodsExport2Excel(HttpServletResponse response) {
        // goods信息查询
        List<Goods> goodsList = goodsService.list();

        // excel导出
        ExcelUtils.exportExcel(goodsList, "easypoi导出功能", "导出sheet1", Goods.class, "测试goods.xls", response);

        logger.info("导出成功！");
    }

    @RequestMapping("/import")
    public void importExcel2(@RequestParam("file") MultipartFile file) {
        ImportParams importParams = new ImportParams();
        // 数据处理
        importParams.setHeadRows(1);
        importParams.setTitleRows(1);

        try {
            ExcelImportResult<Goods> result = ExcelImportUtil.importExcelMore(file.getInputStream(), Goods.class,
                    importParams);
            List<Goods> goodsList = result.getList();
            for (Goods goods : goodsList) {
                // System.out.println(User);
                goodsService.save(goods);
                logger.info("从Excel导入数据到数据库的详细为 ：{}", JSONObject.toJSONString(goods));
                //TODO 将导入的数据做保存数据库操作
            }
            logger.info("从Excel导入数据一共 {} 行 ", goodsList.size());
        } catch (IOException e) {
            logger.error("导入失败：{}", e.getMessage());
        } catch (Exception e1) {
            logger.error("导入失败：{}", e1.getMessage());
        }
        logger.info("导入成功");
    }
}
