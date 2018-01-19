package com.ivfun.character.helper.resource

import com.ivfun.character.helper.document.TypeConnection
import com.ivfun.character.helper.repository.TypeConnectionRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/type-connection"])
class TypeConnectionResource(val typeConnectionRepository: TypeConnectionRepository)
{
    @RequestMapping(method = [RequestMethod.GET])
    fun find(): MutableList<TypeConnection>?
    {
        return typeConnectionRepository.findAll()
    }

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.GET])
    fun findOne(@PathVariable id: String): TypeConnection?
    {
        return typeConnectionRepository.findOne(id)
    }

    @RequestMapping(method = [RequestMethod.POST,RequestMethod.PUT])
    fun save(@RequestBody typeConnection: TypeConnection): TypeConnection?
    {
        return typeConnectionRepository.save(typeConnection)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
    fun delete(@RequestBody typeConnection: TypeConnection)
    {
        return typeConnectionRepository.delete(typeConnection.id)
    }
}