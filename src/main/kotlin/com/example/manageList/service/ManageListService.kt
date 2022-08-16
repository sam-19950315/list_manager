package com.example.manageList.service

import com.example.manageList.entity.TitleEntity
import com.example.manageList.repository.ManageListRepository
import org.springframework.stereotype.Service

@Service
class ManageListService(private val manageListRepository: ManageListRepository) {
    fun findAll(): List<TitleEntity> = manageListRepository.findAll()
    fun save(titleEntity: TitleEntity): TitleEntity {
        return manageListRepository.save(titleEntity)
    }
}