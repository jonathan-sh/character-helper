package com.ivfun.character.helper.resource

import com.ivfun.character.helper.document.Connection
import com.ivfun.character.helper.repository.ConnectionRepository
import com.ivfun.character.helper.service.ConnectionService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/connection"])
class ConnectionResource(val connectionRepository: ConnectionRepository,
                         val connectionService: ConnectionService)
{
    @RequestMapping(method = [RequestMethod.GET])
    fun find(): MutableList<Connection>?
    {
        return connectionRepository.findAll()
    }

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.GET])
    fun findOne(@PathVariable id: String): Connection?
    {
        return connectionRepository.findOne(id)
    }

    @RequestMapping(method = [RequestMethod.POST, RequestMethod.PUT])
    fun save(@RequestBody connection: Connection): Connection?
    {
        return connectionService.save(connection)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
    fun delete(@RequestBody connection: Connection)
    {
        return connectionRepository.delete(connection.id)
    }
}