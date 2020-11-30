package com.qfedu.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileDownController {
	@RequestMapping("filedown")
	public void down(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		File file = new File(request.getSession().getServletContext().getRealPath("/"), "gs1.png");
		System.out.println("文件" + file.getAbsolutePath());
		byte[] data = FileUtils.readFileToByteArray(file);
		response.setContentType("application/x-msdownload;");
		response.setHeader("Content-disposition",
				"attachment; filename=" + new String(file.getName().getBytes("utf-8"), "ISO8859-1"));
		response.setHeader("Content-Length", String.valueOf(file.length()));
		response.getOutputStream().write(data);
	}
}
