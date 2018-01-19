package com.ivfun.character.helper.service

import com.ivfun.character.helper.document.Connection

interface ConnectionService
{
    fun save(connection: Connection): Connection?
}