package br.com.template.clear.arch.contact.service.use_case

import br.com.template.clear.arch.contact.service.use_case_port.data.ContactInputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactOutputPort
import br.com.template.clear.arch.contact.service.use_case_port.input.ContactServiceUseCaseInputPort
import br.com.template.clear.arch.contact.service.use_case_port.output.ContactServiceUseCaseOutputPort
import org.springframework.stereotype.Service

@Service
class ContactServiceUseCaseInputPortImpl (
    private val contactServiceUseCaseOutputPort: ContactServiceUseCaseOutputPort):
        ContactServiceUseCaseInputPort{

    override fun create(contactInputPort: ContactInputPort): ContactOutputPort {
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): ContactOutputPort {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<ContactOutputPort> {
        return this.contactServiceUseCaseOutputPort.getAll()
    }

    override fun remove(id: Long) {
        TODO("Not yet implemented")
    }

}