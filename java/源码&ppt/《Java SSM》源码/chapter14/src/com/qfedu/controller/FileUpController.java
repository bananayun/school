package com.qfedu.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUpController {
	@RequestMapping("fileup")
	public void file(MultipartFile file, HttpServletRequest request, HttpServletResponse response)
			throws IllegalStateException, IOException {
		String fn = file.getOriginalFilename();
		File desfile = new File(request.getSession().getServletContext().getRealPath("/"), fn);
		file.transferTo(desfile);
		response.getWriter().print(desfile.getAbsolutePath());
	}
}
