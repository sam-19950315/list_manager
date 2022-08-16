package com.example.manageList.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
public class TitleEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var title: String,
    var ax: Int,
    var ay: Int,
    var az: Int,
    var abb: Int,
    var ace: Int,
    var aee: Int,
    var bx: Int,
    var by: Int,
    var bz: Int,
    var bbb: Int,
    var bce: Int,
    var bee: Int,
    var cx: Int,
    var cy: Int,
    var cz: Int,
    var cbb: Int,
    var cce: Int,
    var cee: Int
    )