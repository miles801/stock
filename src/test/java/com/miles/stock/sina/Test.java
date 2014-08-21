package com.miles.stock.sina;

import java.io.IOException;

/**
 * Created on 2014/8/3 17:26
 *
 * @author miles
 */
public class Test {
    public static void main(String[] args) throws IOException {
        /*InputStream input = Test.class.getClassLoader().getResourceAsStream("深沪Ａ股.xlsx");
        PinYin pinYin = PinYin.getInstance();
        // 读取第一个sheet
        Workbook workbook = new XSSFWorkbook(input);
        Sheet sheet = workbook.getSheetAt(0);
        int startRow = sheet.getFirstRowNum();
        int endRow = sheet.getLastRowNum();
        List<Stock> stockList = new ArrayList<Stock>();
        // 获取首行信息
        DecimalFormat format = new DecimalFormat("000000");
        for (int i = startRow; i < endRow; i++) {
            Row row = sheet.getRow(i);
            if (POIUtils.isEmpty(row)) {
                break;
            }
            // 股票编号 股票类型
            String code = POIUtils.getCellValue(row.getCell(0));
            code = format.format(Float.parseFloat(code));
            String type = StockType.getType(code).getValue();
            // 股票名称 股票拼音
            String stockName = POIUtils.getCellValue(row.getCell(1)).replaceAll("\\s+", "");
            String stockNamePinyin = pinYin.getPinYinHeadChar(stockName).toUpperCase();
            // 股票行业
            String industry = POIUtils.getCellValue(row.getCell(2));
            Stock stock = new Stock();
            stock.setName(stockName);
            stock.setShortName(stockNamePinyin);
            stock.setType(type);
            stock.setCode(code);
            stock.setIndustry(industry);
            stockList.add(stock);
        }
        Gson gson = new Gson();
        IOUtils.write(gson.toJson(stockList), new FileOutputStream("D:\\workspace_intelij\\stock\\src\\test\\resources\\stock.json"));*/
    }
}
