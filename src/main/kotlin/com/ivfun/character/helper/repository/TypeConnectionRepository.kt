package com.ivfun.character.helper.repository

import com.ivfun.character.helper.document.TypeConnection
import org.springframework.data.mongodb.repository.MongoRepository

interface TypeConnectionRepository: MongoRepository<TypeConnection, String>
{
}