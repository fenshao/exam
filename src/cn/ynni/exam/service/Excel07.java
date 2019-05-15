package cn.ynni.exam.service;

import cn.ynni.exam.model.Question;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Excel07 {
	public static XSSFSheet getFile(String path) throws IOException, InvalidFormatException {
		//创建输入流
		//C:\Users\y8501\eclipse-workspace\javaTest\src\111.xlsx
		//C:\\Users\\y8501\\Desktop\\2013keyi.xls
		//String path = "（xlsx格式）excel路径";
		FileInputStream fis = new FileInputStream(new File(path));
		//由输入流得到工作簿
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//得到工作表
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		/*
		//得到行,0表示第一行
		XSSFRow row = sheet.getRow(0);
		//创建单元格行号由row确定,列号作为参数传递给createCell;第一列从0开始计算
		XSSFCell cell = row.getCell(1);
		//获取单元格的值
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);

		//关闭工作簿
		workbook.close();
		fis.close();
		*/
		return sheet;
	}
	
	public ArrayList<Question> getExcel(String path) {
		ArrayList<Question> a = new ArrayList<>();
		XSSFSheet file = null;
		try {
			file = getFile(path);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int rowNum = file.getLastRowNum(); //获取sheet的行数
		//System.out.println(rowNum);
		for (int i = 1; i <= rowNum; i++) {
			Question question = new Question();
			question.setTitle(file.getRow(i).getCell(3).getStringCellValue());
			//System.out.println(file.getRow(i).getCell(3).getStringCellValue());
			question.setOptionA(file.getRow(i).getCell(4).getStringCellValue());
			question.setOptionB(file.getRow(i).getCell(5).getStringCellValue());
			question.setOptionC(file.getRow(i).getCell(6).getStringCellValue());
			question.setOptionD(file.getRow(i).getCell(7).getStringCellValue());
			question.setAnswer(file.getRow(i).getCell(8).getStringCellValue());
			a.add(question);
		}
		//question.setQuestionId(getFile(path));
		//question.getTitle() = getFile(path);
		return a;
	}
}
