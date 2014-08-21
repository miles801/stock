package com.miles.stock.sina;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * Created on 2014/7/16 0:37
 *
 * @author miles
 */
public class POIUtils {
    /**
     * 如果一行中所有的cell都类型都是blank，则返回true，否则返回false
     *
     * @param row excel的行
     */
    public static boolean isEmpty(Row row) {
        if (row == null) {
            throw new IllegalArgumentException("判断是否为空行时,HSSFRow不能为空!");
        }
        short startCellIndex = row.getFirstCellNum();
        short endCellIndex = row.getLastCellNum();
        for (int i = startCellIndex; i <= endCellIndex; i++) {
            Cell cell = row.getCell(i);
            if (cell == null) continue;
            String value = getCellValue(cell);
            if (value != null && !"".equals(value.trim())) { //值不为空
                return false;
            }
        }
        return true;
    }

    public static String getCellValue(Cell cell) {
        if (cell == null) {
            throw new IllegalArgumentException("获取单元格的值时,HSSFCell不能为空!");
        }
        int type = cell.getCellType();
        if (type == Cell.CELL_TYPE_BLANK) {
            return null;
        } else if (type == Cell.CELL_TYPE_STRING) {
            return cell.getStringCellValue();
        } else if (type == Cell.CELL_TYPE_BOOLEAN) {
            boolean value = cell.getBooleanCellValue();
            return Boolean.toString(value);
        } else if (type == Cell.CELL_TYPE_NUMERIC) {
            double value = cell.getNumericCellValue();
            return Double.toString(value);
        } else if (type == Cell.CELL_TYPE_FORMULA) {//格式
            return null;
        } else {
            throw new RuntimeException("不支持的cell类型[" + type + "]!");
        }
    }


    public static Row addRow(Sheet sheet, int rowIndex) {
        return sheet.createRow(rowIndex);
    }

    public static Cell addCell(Row row, int cellIndex, int cellType, String cellValue) {
        Cell cell = row.createCell(cellIndex, cellType);
        if (cellType == Cell.CELL_TYPE_BLANK) {
        } else if (cellType == Cell.CELL_TYPE_STRING) {
            cell.setCellValue(cellValue);
        } else if (cellType == Cell.CELL_TYPE_BOOLEAN) {
            cell.setCellValue(Boolean.parseBoolean(cellValue));
        } else if (cellType == Cell.CELL_TYPE_NUMERIC) {
            cell.setCellValue(Double.parseDouble(cellValue));
        } else if (cellType == Cell.CELL_TYPE_FORMULA) {//格式
            cell.setCellFormula(cellValue);
        } else {
            throw new RuntimeException("不支持的cell类型[" + cellType + "]!");
        }
        return cell;
    }
}
