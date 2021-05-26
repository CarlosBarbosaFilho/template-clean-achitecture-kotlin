package br.com.template.clear.arch.contact.service.use_case_port.input

import br.com.template.clear.arch.contact.service.use_case_port.data.ContactInputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactOutputPort

interface ContactServiceUseCaseInputPort {

    fun create(contactInputPort: ContactInputPort): ContactOutputPort

    fun getById(id: Long): ContactOutputPort

    fun getAll(): List<ContactOutputPort>

    fun remove(id: Long): Unit
}