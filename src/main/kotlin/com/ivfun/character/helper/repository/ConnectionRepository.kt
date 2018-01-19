package com.ivfun.character.helper.repository

import com.ivfun.character.helper.document.Connection
import org.springframework.data.mongodb.repository.MongoRepository
interface ConnectionRepository : MongoRepository<Connection, String>
{
}