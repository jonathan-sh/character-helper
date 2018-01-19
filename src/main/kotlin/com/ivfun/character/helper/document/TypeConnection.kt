package com.ivfun.character.helper.document

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Persistent
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime

@Document(collection = "type_connection")
data class TypeConnection
(
    @Id
    val id: String? = null,
    @Field(value = "color")
    val color: String? = null,
    @Field(value = "description")
    val description: String? = null,
    @Persistent
    @JsonIgnore
    val updated: LocalDateTime? = LocalDateTime.now()
)