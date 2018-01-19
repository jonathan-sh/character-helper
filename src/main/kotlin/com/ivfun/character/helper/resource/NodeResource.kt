package com.ivfun.character.helper.resource

import com.ivfun.character.helper.document.Node
import com.ivfun.character.helper.repository.NodeRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/node"])
class NodeResource(val nodeRepository: NodeRepository)
{
    @RequestMapping(method = [RequestMethod.GET])
    fun find(): MutableList<Node>?
    {
        return nodeRepository.findAll()
    }

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.GET])
    fun findOne(@PathVariable id: String): Node?
    {
        return nodeRepository.findOne(id)
    }

    @RequestMapping(method = [RequestMethod.POST, RequestMethod.PUT])
    fun save(@RequestBody node: Node): Node?
    {
        return nodeRepository.save(node)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
    fun delete(@RequestBody node: Node)
    {
        return nodeRepository.delete(node.id)
    }
}