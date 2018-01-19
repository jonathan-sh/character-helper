package com.ivfun.character.helper.repository


import com.ivfun.character.helper.document.Node
import org.springframework.data.mongodb.repository.MongoRepository

interface NodeRepository: MongoRepository<Node, String>
{
}