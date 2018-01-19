package com.ivfun.character.helper.document

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Persistent
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime

@Document(collection = "connection")
data class Connection
(
    @Id
    val id: String? = null,
    @Field(value = "id_type_connection")
    val id_type_connection: String? = null,
    @Field(value = "id_node_a")
    val id_node_a: String? = null,
    @Field(value = "id_node_b")
    val id_node_b: String? = null,
    @Persistent
    @JsonIgnore
    val updated: LocalDateTime? = LocalDateTime.now()
)

