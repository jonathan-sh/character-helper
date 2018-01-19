package com.ivfun.character.helper.service.impl

import com.ivfun.character.helper.document.Connection
import com.ivfun.character.helper.repository.ConnectionRepository
import com.ivfun.character.helper.repository.NodeRepository
import com.ivfun.character.helper.repository.TypeConnectionRepository
import com.ivfun.character.helper.service.ConnectionService
import org.springframework.stereotype.Service

@Service
class ConnectionServiceImpl (val connectionRepository: ConnectionRepository,
                             val nodeRepository: NodeRepository,
                             val typeConnectionRepository: TypeConnectionRepository)
:ConnectionService
{

    override fun save(connection: Connection): Connection
    {
       if (existNodesAndTypeConnection(connection))
       {
          return connectionRepository.save(connection)
       }
        throw IllegalArgumentException("insert problems")
    }


    fun existNodesAndTypeConnection(connection: Connection): Boolean
    {
        return nodeRepository.exists(connection.id_node_a) &&
               nodeRepository.exists(connection.id_node_b) &&
               typeConnectionRepository.exists(connection.id_type_connection)
    }
}