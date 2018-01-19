package com.ivfun.character.helper.document

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Persistent
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime

@Document
data class Node
(
    @Id
    val id: String? = null,
    @Field(value = "name")
    val name: String? = null,
    @Persistent
    @JsonIgnore
    val updated: LocalDateTime? = LocalDateTime.now()
)