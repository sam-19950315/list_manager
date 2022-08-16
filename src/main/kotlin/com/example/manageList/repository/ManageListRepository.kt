package com.example.manageList.repository

import com.example.manageList.entity.TitleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ManageListRepository : JpaRepository<TitleEntity,Long>{
}