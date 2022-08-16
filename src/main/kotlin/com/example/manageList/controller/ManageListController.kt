package com.example.manageList.controller

import com.example.manageList.entity.TitleEntity
import com.example.manageList.service.ManageListService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam


@Controller
class ManageListController(private val manageListService: ManageListService) {
    @GetMapping("/")
    fun manageList(model: Model): String? {
        val titleList = manageListService.findAll()
        model.addAttribute("titles", titleList)
        return "index"
    }

    @GetMapping("/register")
    fun displayRegisterPage(): String {
        return "new"
    }

    @PostMapping("/register")
    fun registerManageList(
        @ModelAttribute titleEntity: TitleEntity): String {
        println(titleEntity)
        manageListService.save(titleEntity)
        return "redirect:/"
    }
}