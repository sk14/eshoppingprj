package com.niit.Eshopping.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.EshoppingBackend1.dao.CategoryDAO;
import com.niit.EshoppingBackend1.dto.Category;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	private CategoryDAO categoryDAO;

	// @Autowired
	// private HttpServletRequest request;

	// admin page will be loaded
	@RequestMapping(method = RequestMethod.GET)
	public String newCategory(ModelMap model) {
		Category category = new Category();
		model.addAttribute("category", category);
		model.addAttribute("userClickAdmin", true);
		return "page";

	}

	// To populate the category list
	@GetMapping(value = { "/all/category" })
	@ResponseBody
	public List<Category> showAll() {
		return categoryDAO.list();
	}

	// To add a category
	@RequestMapping(value = "/add/category", method = RequestMethod.POST)
	public String saveCategory(@Valid Category category, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			model.addAttribute("category", category);
			model.addAttribute("userClickAdmin", true);
			return "page";
		} else {

			if (category.getId() == 0) {
				if (categoryDAO.add(category)) {
					model.addAttribute("success", "Category Added");
				}
			} else {
				if (categoryDAO.update(category)) {
					model.addAttribute("success", "Category update");
				}
			}
			return "redirect:/admin";

		}
	}

	// To get category

	@GetMapping(value = { "/show/category/{id}" })
	public ModelAndView getCategoryById(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("category", categoryDAO.get(id));
		mv.addObject("userClickAdmin", true);
		return mv;

	}
	// deleting a category

	/*@RequestMapping(value = "/delete/category}")
	public String deleteCategoryById(@Valid Category category, BindingResult result) {
		// this.categoryDAO.delete(id);
		if (categoryDAO.delete(category)) {
		}
		return "redirect:/admin";
	}*/
	@RequestMapping(value = { "/delete/{id}/category" })
	public String deleteCategoryById(@PathVariable Integer id) {
		categoryDAO.delete(id);

		return "redirect:/admin";
	}

	// helper to upload the file

	/*
	 * protected String uploadImage(MultipartFile multipartFile){
	 * 
	 * String folderToUpload="/resources/images"; //1. get the filename
	 * 
	 * String filename=multipartFile.getOriginalFilename(); //2. get the real
	 * path and create the directory //if it does not exists String
	 * realPath=request.getServletContext().getRealPath(folderToUpload); if(!new
	 * File(realPath.exists())){ new File(realPath.mkdirs);
	 * 
	 * } //3. transfer the file String filePath=realPath + filename; File
	 * destination=new File(filepath); try{
	 * multipartFile.transferTo(destinstion); } catch(Exception e){} return
	 * filename; }
	 */

}
